package Names;

import java.util.ArrayList;
import java.util.Scanner;


public class A1 {
	
    public void run() {
    Scanner input; 
	
	input = new Scanner(System.in);
	
	System.out.print("Enter a marvel character name: \n");
	
	while(input.hasNext()) {
		String name = input.next().trim().replaceAll("-","").replaceAll("[0-9]","").toLowerCase();
		System.out.println(name);
	}
	
	}
    
    private static Avenger AvengerObject(String heroAlias, String heroName) {
    	Avenger avenger = new Avenger();
		avenger.setHeroAlias(heroAlias);
		avenger.setHeroName(heroName);
		return avenger;
    }
    
    private static void printStudentList (ArrayList<Avenger> avengerlist) {
		System.out.println("Alias\t\tLast name");
		for (int i = 0; i < avengerlist.size(); i++) {
			System.out.println(
					avengerlist.get(i).getHeroAlias() +  "\t\t" + 
					avengerlist.get(i).getHeroName());
			
		}

		}


	public static void main(String[] args) {
		ArrayList<Avenger> avengerList = new ArrayList<Avenger>();
		avengerList.add(AvengerObject("captainamerica", "rogers"));
		avengerList.add(AvengerObject("ironman", "stark"));
		avengerList.add(AvengerObject("blackwidow", "romanoff"));
		avengerList.add(AvengerObject("hulk", "banner"));
		avengerList.add(AvengerObject("black panther", "tchalla"));
		avengerList.add(AvengerObject("thor", "odinson"));
		avengerList.add(AvengerObject("hawkeye", "barton"));
		avengerList.add(AvengerObject("war machine", "rhodes"));
		avengerList.add(AvengerObject("spiderman", "parker"));
		avengerList.add(AvengerObject("wintersoldier", "barnes"));
		
		
		A1 avengersNames = new A1();
		avengersNames.run();
		

	}

}

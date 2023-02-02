package Names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A1 {

	public void run() {
		Scanner input;

		input = new Scanner(System.in);

		System.out.print("Enter a marvel character name or alias: \n");

		while (input.hasNext()) {
			String name = input.next().trim().replaceAll("-", "").replaceAll("[0-9]", "").toLowerCase().replaceAll(".",
					"");
			System.out.println(name);
		}

	}

	public void checkAvengerName(ArrayList<Avenger> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			Avenger a = list.get(i);
			if (a.getHeroName().equals(name)) {
				a.addFrequency(i);
			}
		}
	}
	
	public void checkAvengerAlias(ArrayList<Avenger> list, String alias) {
		for (int i = 0; i < list.size(); i++) {
			Avenger a = list.get(i);
			if (a.getHeroAlias().equals(alias)) {
				a.addFrequency(i);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Avenger> avengerList = new ArrayList<Avenger>();
		avengerList.add(new Avenger("captainamerica", "rogers"));
		avengerList.add(new Avenger("ironman", "stark"));
		avengerList.add(new Avenger("blackwidow", "romanoff"));
		avengerList.add(new Avenger("hulk", "banner"));
		avengerList.add(new Avenger("black panther", "tchalla"));
		avengerList.add(new Avenger("thor", "odinson"));
		avengerList.add(new Avenger("hawkeye", "barton"));
		avengerList.add(new Avenger("war machine", "rhodes"));
		avengerList.add(new Avenger("spiderman", "parker"));
		avengerList.add(new Avenger("wintersoldier", "barnes"));

		Collections.sort(avengerList);
		Collections.sort(avengerList, new CompAvenger());

		A1 avengersNames = new A1();
		avengersNames.run();

	}
}

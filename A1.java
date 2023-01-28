package Names;

import java.util.Scanner;

public class A1 {
	
	Scanner input; 
	
    public void run() {
	
	input = new Scanner(System.in);
	
	System.out.println("Enter a marvel character name: ");
	
	while(input.hasNext()) {
		String name = input.next().trim().replaceAll("-","").replaceAll("[0-9]","").toLowerCase();
		System.out.println(name);
	}
	}

	public static void main(String[] args) {
		A1 avengersNames = new A1();
		avengersNames.run();
		

	}

}

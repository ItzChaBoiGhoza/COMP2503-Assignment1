import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** 
 * COMP 2503 Winter 2023 Assignment 1 
 * 
 * This program must read a input stream and keeps track of the 
 * frequency at which an avenger is mentioned either by name or alias.
 *
 * @author Denzel Pascual, Shamil Baig, Ghoza Ghazali
 * @date Feb 6, 2023
*/

public class A1 {
	public String[][] avengerRoster = { { "captainamerica", "rogers" }, { "ironman", "stark" },
			{ "blackwidow", "romanoff" }, { "hulk", "banner" }, { "blackpanther", "tchalla" }, { "thor", "odinson" },
			{ "hawkeye", "barton" }, { "warmachine", "rhodes" }, { "spiderman", "parker" },
			{ "wintersoldier", "barnes" } };

	private int topN = 4;
	private int totalwordcount = 0;
	private ArrayList<Avenger> avengersArrayList = new ArrayList<Avenger>();

	public static void main(String[] args) throws FileNotFoundException {
		A1 a1 = new A1();
		a1.run();
	}
	
	 public void run() throws FileNotFoundException {
		readInput();
		printResults();
	}

	/**
	 * read the input stream and keep track  
	 * how many times avengers are mentioned by alias or last name.
	 * @throws FileNotFoundException 
	 */

	private void readInput() throws FileNotFoundException {
		//Scanner for input
		Scanner input = new Scanner(System.in);
		
		//This loop will loop through if there scanner(input)
		while(input.hasNext()) {
			//Input string format, only looking for words no 0-9, or punctuation marks, or white spaces
			String word = input.next().trim().toLowerCase();
			word = word.replaceAll("'s","").replaceAll("[^a-z]", "").replaceAll("[0123456789]","");
			
			//if the word is not empty, add the word increase the totalwordcount.
			if(word.length() > 0) {
				totalwordcount++;
				//Loops through the 2-dimensional array to see if the word from scanner matches 
				for(int i = 0; i < avengerRoster.length; i++) {
					//Check if the word is either an avenger alias or last name
					if(word.equals(avengerRoster[i][0]) || word.equals(avengerRoster[i][1])) {
						//Create a new avenger object with the corresponding alias and last name.
						Avenger avenger = new Avenger(avengerRoster[i][0], avengerRoster[i][1]);
						//if this avenger has already been mentioned, increase the frequency count for the object already in the arraylist.
						//else avenger has not been mentioned before, add the newly created avenger to the list, and increase frequency.
						if(avengersArrayList.contains(avenger)) {
							avengersArrayList.get(avengersArrayList.indexOf(avenger)).addFrequency();
						} else {
							avenger.addFrequency();
							avengersArrayList.add(avenger);
						}
					}
				}
			}
		}
		input.close();
	}

	/**
	 * print the results
	 */
	private void printResults() {
		System.out.println("Total number of words: " + totalwordcount);
		System.out.println("Number of Avengers Mentioned: " + avengersArrayList.size());
		System.out.println();

		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input
		// Make sure you follow the formatting example in the sample output
		for(int j = 0; j < avengersArrayList.size(); j++) {
			System.out.println(avengersArrayList.get(j));
		}
		System.out.println();
		
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the most popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		Collections.sort(avengersArrayList, Avenger.MostPopular);
		topFourLoopThrough();
		System.out.println();

		System.out.println("Top " + topN + " least popular avengers:");
		// Todo: Print the least popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		Collections.sort(avengersArrayList, new LeastPopular());
		topFourLoopThrough();
		System.out.println();

		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		// Make sure you follow the formatting example in the sample output
		Collections.sort(avengersArrayList);
		for(int j = 0; j < avengersArrayList.size(); j++) {
			System.out.println(avengersArrayList.get(j));
		}
		System.out.println();
	}
	
	public void topFourLoopThrough() {
		if(avengersArrayList.size() > 2) {
			for(int j = 0; j < 4; j++) {
				System.out.println(avengersArrayList.get(j));
			}
		} else {
			for(int j = 0; j < 2; j++) {
				System.out.println(avengersArrayList.get(j));
			}
		}
	}
}

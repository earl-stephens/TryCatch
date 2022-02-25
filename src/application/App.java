package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// try catch for run time exception
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number > ");
		String line = scanner.nextLine();
		int value = 0;
		
		try {
			value = Integer.parseInt(line);
			//if this doesn't work, you get an error, such as entering a letter
			//this will exit the main method and terminate the program
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid number");
		}

		
		System.out.println("You entered " + value);
		
		scanner.close();
	}

}

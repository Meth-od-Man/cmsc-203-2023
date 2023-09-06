/*
 * Class: CMSC203 
 * Instructor:Monshi
 * Description: (Give a brief description for each Class):a game of guessing random colors to see how many the user gets right.
 * Due: 9/11/2023
 * Platform/compiler:IDK
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Jared Hernandez
*/

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		Random rand = new Random();
		 
		
		String Name;
		String Description;
		String DueDate;
		
		int guessesCorrect = 0;
		
		System.out.println("Enter your name:");
		Name = myObj.nextLine();
		System.out.println("Describe yourself:");
		Description = myObj.nextLine();
		System.out.println("Due Date:");
		DueDate = myObj.nextLine();
		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		
		for(int i = 1;i < 11;i++) {
			int randInt1 = rand.nextInt(5);
			String color = null;
			String guess = "";
		
			
			System.out.println("\n Round " + i);
			System.out.println("I am thinking of a color.\nIs it Red, Green, Blue, Orange, or Yellow?\nEnter your guess:");
			guess=myObj.nextLine();
			
			while((guess.equalsIgnoreCase("Red")== false)&&(guess.equalsIgnoreCase("Green")== false)&&(guess.equalsIgnoreCase("Blue")==false)&&(guess.equalsIgnoreCase("Orange") == false)&&(guess.equalsIgnoreCase("Yellow") == false)) {
				System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?\nEnter your guess again:");
				guess=myObj.nextLine();
			}
			
			   
			switch(randInt1) {
			case 0: 
			color = "Red";
			break;
			case 1:
			color = "Green";
			break;
			case 2:
			color = "Blue";
			break;
			case 3:
			color = "Orange";
			break;
			case 4:
			color = "Yellow";
			break;
			}
			System.out.println("\n\n\nI was thinking of :" + color);
			if(guess.equalsIgnoreCase(color)){
				++ guessesCorrect;
			}
			//System.out.println("THE THANG BE THANGIN OR NAW:" + guessesCorrect);
			if(i == 10) {
				System.out.println("\nGame Over");
			}
			}
		
		myObj.close();
		System.out.println("\nYou guessed "+ guessesCorrect + " out of 10 colors correctly\nUser Name: " + Name + "\nUser Description: " + Description + "\nDue Date: " + DueDate);
		
		}
	}

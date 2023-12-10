import java.util.*;
/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 12/07/2023
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jared Hernandez
*/


public class BevShopDriverApp{

	
	public static void main(String[] args) {
		
		BevShop shop = new BevShop();
		
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("The current order in process can have at most 3 alcoholic beverages.\r\n"
				+ "The minimum age to order alcohol drink is 21\r\n"
				+ "Start please a new order:\r\n"
				+ "Your Total Order for now is 0.0\r\n"
				+ "Would you please enter your name:");
		String name = input.nextLine();
		System.out.println("\nWould you please enter your age:");
		int age = input.nextInt();//int time, Day day, String customerName, int customerAge
		shop.startNewOrder(15, Day.MONDAY, name, age);
		Customer diner = new Customer(name, age);
		Order order = new Order(15, Day.MONDAY,diner);
		
		
			
		if(shop.isValidAge(age) == true) {
			System.out.println("!!Your age is above 20 and you are eligible to order alcohol!!" );
		
		System.out.println("Would you please add an alcohol drink ");
		order.addNewBeverage("Mojito", Size.SMALL);
		
		System.out.println("The current order of drinks is " + order.getTotalItems());
		System.out.println("Total price of the order: " + order.beverage.get(0).calcPrice());
		if(shop.isEligibleForMore() == true) {
			System.out.println("our current alcohol drink order is less than 4\nWould you please add a second alcohol drink");
		}
		order.addNewBeverage("Moscow Mule", Size.MEDIUM);
		System.out.println("The current order of drinks is " + order.getTotalItems());
		System.out.println("Total price of the order: " + order.calcOrderTotal());
		
		}
	}

}

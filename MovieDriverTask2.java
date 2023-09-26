import java.util.Scanner;

public class MovieDriverTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String movie;
		String rating;
		int ticketsSold;
		Scanner input = new Scanner(System.in);
		String boogieman = "y";//controls the while loop, scares it out if its not y
		Movie a = new Movie();
		
		while(boogieman.equals("y")) {
		System.out.println("Please enter a movie name: ");
		movie = input.nextLine();
		a.setTitle(movie);
		
		System.out.println("Please enter the movie's rating: ");
		rating = input.nextLine();
		a.setRating(rating);
		
		System.out.println("Please enter the number of tickets sold for this movie");
		ticketsSold = input.nextInt();
		input.nextLine();
		
		System.out.println();
		a.setSoldTickets(ticketsSold);
		
		System.out.println(a);
		
		System.out.println("Do you want to try another? (y or n)");
		boogieman = input.nextLine();
		}
		System.out.println("Goodbye");
	}

}

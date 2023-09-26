import java.util.Scanner;

public class MovieDriverTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String movie;
		String rating;
		int ticketsSold;
		
		Scanner input = new Scanner(System.in);//create objects
		Movie a = new Movie();
		

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
		
		//call toString method
		System.out.println(a);
		input.close();
	}

}

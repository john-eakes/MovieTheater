import java.util.*;
public class MovieTheater{
	
	//Declare static variables
	public static final int ADULT_PRICE = 12;
	public static final int CHILD_PRICE = 10;
	public static final int  MATINEE_DISCOUNT = 3;
	//Main method
	public static void main (String[] args){
	
		//Declare scanner and variables
		Scanner scnr = new Scanner(System.in);
		int adultTickets = 0;
		int childTickets = 0;
		int price = 0;
		String matinee;
		
		
		//Prompt user for each ticket type
		System.out.println("Adult tickets: ");
		adultTickets = scnr.nextInt();
		if (adultTickets < 0){
			System.out.println("Invalid value");
			System.exit(0);
		}
		System.out.println("Child tickets: ");
		childTickets = scnr.nextInt();
		if (childTickets < 0){
			System.out.println("Invalid value");
			System.exit(0);
		}
		
		//Checking matinee. If yes, give deal. If no, price is regular
		System.out.println("Matinee (y,n): ");
		matinee = scnr.next();
		if (matinee.substring(0,1).equals("y") || matinee.substring(0,1).equals("Y")){
			price = (((adultTickets * ADULT_PRICE)-(MATINEE_DISCOUNT * adultTickets)) + ((childTickets * CHILD_PRICE) - (MATINEE_DISCOUNT * childTickets)));
			System.out.println("Ticket price: $ " + price + ".00");
		}
		else {
			price =  ((adultTickets * ADULT_PRICE) + (childTickets * CHILD_PRICE));
			System.out.println("Ticket price: $ " + price + ".00");
		}
		scnr.close();
	}
}

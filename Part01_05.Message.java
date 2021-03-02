
import java.util.Scanner;

public class Message {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write a message: ");
		// Write your program here
		
		// make a variable that stores the contents of the next line that is "read" by the scanner
		String input = scanner.nextLine(); 
		// pass the variable to the .println() method 
		System.out.println(input); 
	}
}



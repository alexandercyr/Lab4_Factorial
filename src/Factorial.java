import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt = 0;
		
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println();
		
		userInt = Validator.getInt(scnr, "Enter an integer that's greater than 0 but less than 10: ", 1,9 );
		
		System.out.println(calculateFactorial(userInt));
		
		
	}
	
	public static int calculateFactorial(int userNum) {
		
		int result;
		
		if (userNum == 1) {
			result = 1;
		}
		else {
			result = calculateFactorial(userNum-1) * userNum;
		}
		
		return result;
		
		
	}

}

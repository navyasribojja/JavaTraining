package Day1Assignments;

import java.util.Scanner;

public class FactorialUsingDoWhile {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();

        long factorial = 1;
        int i = n;

        // Do-while loop to calculate factorial
        do { 
            factorial *= i;
            i--;
        } 
        
        while (i > 0);

        System.out.println("The factorial of " + n + " is: " + factorial);

        scanner.close();
    }
}

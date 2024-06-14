package Day3Exercises;

import java.util.Scanner;
public class GreatestNumberArray {
	

	
	    public static void main(String[] args) {
	    	//to obtain user input
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the elements of the array (separated by spaces):");
	        String input = scanner.nextLine();
	        String[] tokens = input.split(" ");
	        int n = tokens.length;
	        int[] numbers = new int[n];
	       //for  loop
	        for (int i = 0; i < n; i++) {
	            numbers[i] = Integer.parseInt(tokens[i]);
	        }
	       
	        int greatest = findGreatest(numbers);
	       
	        System.out.print("The numbers are: ");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i]);
	            if (i < numbers.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        //prompt the user
	        System.out.println();
	        System.out.println("The greatest number is: " + greatest);
	       //closing the scanner
	        scanner.close();
	    }
	   
	    public static int findGreatest(int[] arr) {
	        int greatest = arr[0];
	        for (int num : arr) {
	        	
	        	//if number is greater than greatest returns the greatest
	            if (num > greatest) {
	                greatest = num;
	            }
	        }
	        return greatest;
	    }
	}




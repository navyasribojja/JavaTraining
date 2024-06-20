package Day1Excercises;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Enter the company name
		System.out.println("Enter the Company name:");
		String companyName =sc.nextLine();
		
		//Enter the location
		System.out.println("Enter the location:");
		String location=sc.nextLine();
		
		System.out.println(companyName +" Technologies "+ location);

	}

}


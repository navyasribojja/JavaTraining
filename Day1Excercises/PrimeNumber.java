package Day1Excercises;

public class PrimeNumber{
	public static void main(String[] args) {
		//declare variable
		  if (args.length != 1) {
	            System.out.println("Enter the Number in Argument.");
	            return;
	        }
		  try {
		int number = Integer.parseInt(args[0]);
		
		if(isPrime(number)) {
			System.out.println(number +" is a PrimeNumber");
		}
		else {
			System.out.println(number +" is not a PrimeNumber");
			
		}
		  }
		  catch(NumberFormatException e) {
			  System.out.println("Enter the valid value");
		  }
		
			
		}

	public static boolean isPrime(int number) {
		if(number<2) {
			return false;
			
		}
		  for (int i = 2; i < Math.sqrt(number); i++) {  
	           if (number % i == 0) {  
	               return false;  
	           }  
		  }
		return true;
		
		
	}

	
}

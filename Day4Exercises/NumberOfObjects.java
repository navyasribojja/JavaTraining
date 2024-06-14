package Day4Exercises;

public class NumberOfObjects {
	
	    // Static variable to keep track of the number of objects created
	    private static int count = 0;

	    // Constructor increments the count whenever a new object is created
	    public NumberOfObjects() {
	        count++;
	    }

	    // Static method to get the current count of objects
	    public static int getObjectCount() {
	        return count;
	    }
	}




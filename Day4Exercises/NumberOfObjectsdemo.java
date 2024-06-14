package Day4Exercises;

public class NumberOfObjectsdemo {
	
	    public static void main(String[] args) {
        // Creating instances of ObjectCounter
    	NumberOfObjects obj1 = new NumberOfObjects();
    	NumberOfObjects obj2 = new NumberOfObjects();
    	NumberOfObjects obj3 = new NumberOfObjects();

        // Printing the number of objects created
        System.out.println("Number of objects created: " + NumberOfObjects.getObjectCount());

        // Creating more instances of ObjectCounter
        NumberOfObjects obj4 = new NumberOfObjects();
        NumberOfObjects obj5 = new NumberOfObjects();

        // Printing the updated number of objects created
        System.out.println("Number of objects created: " + NumberOfObjects.getObjectCount());
    



}


}




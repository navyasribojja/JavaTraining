package Day4Exercises;

public class Paymentdemo {

	    public static void main(String[] args) {
	        // Creating CashPayment objects
	        CashPayment cashpayment1 = new CashPayment(150.00);
	        CashPayment cashpayment2 = new CashPayment(75.50);

	        // Creating CreditCardPayment objects
	        Creditcard creditCardPayment1 = new Creditcard(200.00, "John Doe", "12/25", "1234567890123456");
	        Creditcard creditCardPayment2 = new Creditcard(350.75, "Jane Smith", "08/23", "6543210987654321");

	        // Displaying payment details
	        System.out.println("Cash Payments:");
	        cashpayment1.paymentDetails();
	        cashpayment2.paymentDetails();

	        System.out.println("\nCredit Card Payments:");
	        creditCardPayment1.paymentDetails();
	        creditCardPayment2.paymentDetails();
	    }
	

}






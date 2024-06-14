package Day4Exercises;

	public class CashPayment extends Payment {

		public CashPayment(double amount) {
			super(amount);
		}

		@Override
		public void paymentDetails() {
			System.out.println("The payment amount of $" + getAmount() + " is made in cash.");
		}

	}




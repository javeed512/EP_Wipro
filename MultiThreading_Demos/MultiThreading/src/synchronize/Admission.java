package synchronize;

public class Admission implements Runnable {

	int seats = 1;

	public static void main(String[] args) {

		Admission ad = new Admission();

		Thread t1 = new Thread(ad);
		t1.setName("Satish");

		Thread t2 = new Thread(ad);
		t2.setName("Raju");

		t1.start();
		t2.start();

	}

	@Override
	public synchronized void run() {

		if (seats > 0) {

			System.out.println("No. of Seats Before " + seats);

			System.out.println("Seat is allocated to " + Thread.currentThread().getName());

			seats = seats - 1;

			System.out.println("No. of seats After " + seats);

		}

		else {

			System.err.println("Sorry! Try next year " + Thread.currentThread().getName());

		}

	}

}

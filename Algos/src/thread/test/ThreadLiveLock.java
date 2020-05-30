package thread.test;


/**
 * In the example there are two threads for customer and shop. 
 * Customer is waiting for the order to be shipped before paying money where as shop is willing to ship order only after getting amount. 
 * So both threads are responding to event but busy there itself unless event condition is fulfilled.
 * @author gokul.sonawane
 *
 */

public class ThreadLiveLock {

	static final Customer customer = new Customer();
	static final Shop shop = new Shop();

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				customer.payMoney(shop);
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				shop.shipOrder(customer);
			}
		});

		thread1.start();
		thread2.start();
	}
}

class Customer {
	private boolean paid = false;

	public void payMoney(Shop shop) {
		while (!shop.isOrderShipped()) {
			System.out.println("waiting for order");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		setPaid(true);
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
}

class Shop {
	private boolean orderShipped = false;

	public void shipOrder(Customer customer) {
		while (!customer.isPaid()) {
			System.out.println("waiting for money");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		setOrderShipped(true);
	}

	public void setOrderShipped(boolean orderShipped) {
		this.orderShipped = orderShipped;
	}

	public boolean isOrderShipped() {
		return orderShipped;
	}
}
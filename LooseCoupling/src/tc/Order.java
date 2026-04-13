package tc;

public class Order {
	Notification n;
	public Order(Notification n) {
		this.n = n;
	}
	public void placeOrder() {
		n.send();
	}
	public static void main(String args[]) {
		Order o1 = new Order(new EmailService());
		Order o2 = new Order(new SMSService());
		o1.placeOrder();
		o2.placeOrder();
	}
}

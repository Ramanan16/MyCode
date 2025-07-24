package TaxiBookingApp;

public class Taxi implements Cloneable {

	private int taxiId;
	private int bookingId;
	private int customerId;
	private char currentLoction = 'A';
	private char pickupLoction;
	private char dropLoction;
	private int pickuptime;
	private int droptime;
	private double amount;
	private double totalEarnings;

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setpickupLoction(char pickupLoction) {
		this.pickupLoction = pickupLoction;
	}

	public char getpickupLoction() {
		return pickupLoction;
	}

	public void setdroploction(char dropLoction) {
		this.dropLoction = dropLoction;
	}

	public char getdroploction() {
		return dropLoction;
	}

	public void setpickuptime(int pickuptime) {
		this.pickuptime = pickuptime;
	}

	public int getpickuptime() {
		return pickuptime;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public char getCurrentLoction() {
		return currentLoction;
	}

	public void setCurrentLoction(char currentLoction) {
		this.currentLoction = currentLoction;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTotalEarnings() {
		return totalEarnings;
	}

	public void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	public int getDroptime() {
		return droptime;
	}

	public void setDroptime(int droptime) {
		this.droptime = droptime;
	}

	public int getTaxiId() {
		return taxiId;
	}

	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}

	public String toString() {
		return "    " + getTaxiId() + "           " + getBookingId() + "           " + getCustomerId() + "         "
				+ getpickupLoction() + "      " + getdroploction() + "      " + getpickuptime() + "      "
				+ getDroptime() + "     " + getAmount() ;
	}
}

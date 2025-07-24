package TaxiBookingApp;

import java.util.ArrayList;
import java.util.List;

public class TaxiBooking {
	private static List<Taxi> taxi = new ArrayList<Taxi>();
	private static int noOfTaxi = 2, id = 1;
	private static List<Taxi> taxiHistory = new ArrayList<Taxi>();

	public static String booking(char pickupLoction, char dropLoction, int timeToPickup)
			throws CloneNotSupportedException {
		if (taxi.size() < noOfTaxi) {
			taxi.add(new Taxi());
		}

		int min = Integer.MAX_VALUE;
		Taxi taxiRider = null;

		for (Taxi t : taxi) {
			if (t.getDroptime() <= timeToPickup && Math.abs(pickupLoction - t.getdroploction()) <= min) {
				if (Math.abs(pickupLoction - t.getdroploction()) == min) {

					if (taxiRider != null && t.getTotalEarnings() < taxiRider.getTotalEarnings()) {
						taxiRider = t;
					}
				} else {
					taxiRider = t;
					min = Math.abs(pickupLoction - t.getdroploction());
				}
			}
		}

		if (taxiRider != null) {
			taxiRider.setTaxiId(taxi.indexOf(taxiRider) + 1);
			taxiRider.setBookingId(id);
			taxiRider.setCustomerId(id++);
			taxiRider.setpickupLoction(pickupLoction);
			taxiRider.setdroploction(dropLoction);
			taxiRider.setpickuptime(timeToPickup);
			taxiRider.setDroptime(timeToPickup + Math.abs(pickupLoction - dropLoction));
			taxiRider.setCurrentLoction(dropLoction);
			taxiRider.setAmount((15 * Math.abs(pickupLoction - dropLoction) - 5) * 10 + 100);
			taxiRider.setTotalEarnings(taxiRider.getAmount() + taxiRider.getTotalEarnings());
			taxiHistory.add((Taxi)taxiRider.clone());
		}
		return taxiRider != null ? "Taxi Number: " + (taxi.indexOf(taxiRider) + 1) + " allotted" : "Taxi not Available";
	}

	public static void display() {
		System.out.println("================================================================================");
		for (Taxi t : taxi) {
			System.out.println("TaxiId: " + t.getTaxiId() + "Total Earnings: " + t.getTotalEarnings());
			System.out.println("TaxiID |" + " Booking id |" + " customer id |" + " from |" + " To |" + " Pickup |"
					+ " Drop |" + " Amount |");
			for (Taxi ta : taxiHistory) {
				if (ta.getTaxiId() == t.getTaxiId())
					System.out.println(ta.toString());
			}
		}
		}
	}



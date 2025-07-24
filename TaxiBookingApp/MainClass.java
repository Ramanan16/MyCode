package TaxiBookingApp;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Booking \n2. Booking details \n3. logout");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("Pickup point");
				char pickupLocation = sc.next().charAt(0);
				System.out.println("Drop point");
				char dropLocation = sc.next().charAt(0);
				System.out.println("Pickup Time");
				int timeToPickup = sc.nextInt();
				if (pickupLocation >= 'a' && dropLocation <= 'f') {
					pickupLocation = (char) (pickupLocation - 32);
					dropLocation = (char) (dropLocation - 32);
				}
				if (pickupLocation >= 'A' && dropLocation <= 'F') {
					System.out.println(TaxiBooking.booking(pickupLocation, dropLocation, timeToPickup));
				} else {
					System.out.println("Enter currect location --> A, B, C, D, E, F");
				}
				break;
			case 2:
				TaxiBooking.display();
				break;
			case 3:
				System.out.println("Thank you");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}

	}

}

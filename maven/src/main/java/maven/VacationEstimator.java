 //Copyright (C) 2023
 //All rights reserved
package maven;

import java.util.Scanner;


public class VacationEstimator {
	/**
	*
	*
	* @author Alex Villegas
	*/
	//CHECKSTYLE:OFF
	public static void main(String[] args) {
	//CHECKSTYLE:ON
		Vacation vac1 = new Vacation();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Vacation Package Estimator*****");
		System.out.println("Enter your destination:");
		vac1.setDestination(sc.nextLine());
		System.out.println("Enter the number of travelers:");
		vac1.setTravelers(sc.nextInt());
		System.out.println("Enter the duration in days:");
		vac1.setDuration(sc.nextInt());
		System.out.println("Select your add-ons:");
		System.out.println("1. All-Inclusive Package - $200 per traveler");
		System.out.println("2. Adventure Activities Package - $150 per traveler");
		System.out.println("3. Spa and Wellness Package - $100 per traveler");
		System.out.println("4. Nothing");
		vac1.setExtra(sc.nextInt());
		while(vac1.getExtra()<1 && vac1.getExtra()>4) {
			System.out.println("Select your add-ons:");
			System.out.println("1. All-Inclusive Package - $200 per traveler");
			System.out.println("2. Adventure Activities Package - $150 per traveler");
			System.out.println("3. Spa and Wellness Package - $100 per traveler");
			System.out.println("4. Nothing");
			vac1.setExtra(sc.nextInt());
		}
		if(vac1.getTravelers()>80) {
			System.out.println("The vacation package is not available for groups of more than 80 persons");	
		}
		else {
			double total_cost = vac1.verifyDestiny(vac1.getDestination());
			vac1.getCost(total_cost, vac1.getTravelers(), vac1.getDuration());
			vac1.getTotalWithExtra(vac1.getExtra(),vac1.getTravelers());
			System.out.println("The total cost of the vacation package is " + vac1.getTotal_cost());
		}

	}

}

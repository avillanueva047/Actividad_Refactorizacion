package org.pris2.actividad1;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

	private String _name;
	private ArrayList<Rental> _rentals = new ArrayList<Rental>();

	/**
	 * 
	 * @param name
	 */
	public Customer(String name) {
		_name = name;
	}

	/**
	 * 
	 * @param arg
	 */
	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	}

	/**
	 * Descomposición y Redistribución de método statement()
	 * 
	 * @return result
	 */

	public String statement() {
		Iterator<Rental> rentals = _rentals.iterator();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasNext()) {
			Rental aRental = (Rental) rentals.next();

			// show figures for this rental
			result += "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	public String htmlStatement() {
		Iterator<Rental> rentals = _rentals.iterator();
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			// show figures for each rental
			result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		// add footer lines
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) 
		+ "</EM> frequent renter points<P>";
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
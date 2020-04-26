package org.pris2.actividad1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

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
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	/**
	 * Descomposición y Redistribución de método statement()
	 * @return result
	 */

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration <Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental) rentals.nextElement();

			// add frequent renter points
			frequentRenterPoints += aRental.getFrequentRenterPoints();
			// show figures for this rental
			result += "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n";
			totalAmount += aRental.getCharge();
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}
}
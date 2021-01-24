package org.pris2.actividad1;

public interface Price {
	int getPriceCode();
	
	double getCharge(int daysRented);
	
	default int getFrequentRenterPoints(int daysRented){
		return 1 * daysRented;
	}
}

package org.pris2.actividad1;

public abstract class Price {
	abstract int getPriceCode();
	
	abstract double getCharge(int daysRented);
	
	int getFrequentRenterPoints(int daysRented){
		return 1;
	}
}
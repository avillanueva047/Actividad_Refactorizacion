package org.pris2.actividad1;

public class NewReleasePrice implements Price {

	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	public double getCharge(int daysRented){
		return daysRented * 3.0;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2: 1;
	}
}

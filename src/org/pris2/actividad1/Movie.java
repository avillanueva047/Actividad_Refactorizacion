package org.pris2.actividad1;

public class Movie {

	private int _priceCode;
	private String _title;
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	public Movie (String title, int priceCode) {
		_title = title;
		_priceCode =  priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	/**
	 * 
	 * @param arg
	 */
	public void setPriceCode(int arg) {
		_priceCode = arg;
	}

	public String getTitle() {
		return _title;
	}

	double getCharge(int daysRented){
		double result = 0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (daysRented > 2)
					result += (daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += daysRented * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (daysRented > 3)
					result += (daysRented - 3) * 1.5;
				break;
		}
		return result;
	}

	int getFrecuentRenterPoints(int daysRented) {
		if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else
			return 1;
	}
}
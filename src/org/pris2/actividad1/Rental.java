package org.pris2.actividad1;

public class Rental {

	private int _daysRented;
	private Movie _movie;

	/**
	 * 
	 * @param movie
	 * @param daysRented
	 */
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}
	
	double getCharge(){
		double result = 0;
		switch (getMovie().getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (getDaysRented() > 2)
					result += (getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (getDaysRented() > 3)
					result += (getDaysRented() - 3) * 1.5;
				break;
		}
		return result;
	}

	int getFrequentRenterPoints() {
		if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
			return 1;
		else
			return 1;
	}

}
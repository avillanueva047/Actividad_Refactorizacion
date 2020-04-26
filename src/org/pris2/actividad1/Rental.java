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
		return _movie.getCharge(_daysRented);
	}
	
	int getFrequentRenterPoints() {
		return _movie.getFrecuentRenterPoints(_daysRented);
	}

}
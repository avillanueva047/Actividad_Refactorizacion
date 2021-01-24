package org.pris2.actividad1;

public class Rental {

	private int daysRented;
	private Movie movie;

	/**
	 * 
	 * @param movie
	 * @param daysRented
	 */
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	double getCharge(){
		return movie.getCharge(daysRented);
	}
	
	int getFrequentRenterPoints() {
		return movie.getFrecuentRenterPoints(daysRented);
	}

}
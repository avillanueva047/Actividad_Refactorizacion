package org.pris2.actividad1;

public class Movie {

	private Price _price;
	private String _title;
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	public Movie (String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return _price.getPriceCode();
	}

	/**
	 * 
	 * @param arg
	 */
	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public String getTitle() {
		return _title;
	}
	
	double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}

	
	int getFrecuentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
}
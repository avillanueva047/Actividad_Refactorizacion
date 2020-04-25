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

}
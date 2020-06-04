package test2;

public class Date {
	
	private int day; // 06, 07, 08
	private int month; // 11, 12
	private int year; // 2018, 2019

	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

}

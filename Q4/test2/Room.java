package test2;

public class Room {
	
	private String roomType;
	private int rentalDays;

	public Room() {
		this.roomType = null;
		this.rentalDays = 0;
	}
	/**
	 * @param roomType
	 * @param rentalDays
	 */
	public Room(String roomType, int rentalDays) {
		super();
		this.roomType = roomType;
		this.rentalDays = rentalDays;
	}

	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * @return the rentalDays
	 */
	public int getRentalDays() {
		return rentalDays;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	/**
	 * @param rentalDays the rentalDays to set
	 */
	public void setRentalDays(int rentalDays) {
		this.rentalDays = rentalDays;
	}
	
	public double calculateDeposit() {
		double dep = 200 * this.getRentalDays();
		return dep;
	}


}

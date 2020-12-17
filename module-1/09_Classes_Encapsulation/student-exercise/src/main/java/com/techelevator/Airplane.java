package com.techelevator;

public class Airplane {
	String planeNumber;
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
	boolean success = false;
	
	if(forFirstClass) {
		
		if(totalNumberOfSeats <= getAvailableFirstClassSeats()) {
			bookedFirstClassSeats += totalNumberOfSeats;
			success = true;
		}
		
	} else {
		//reserve coach seats
		if(totalNumberOfSeats <= getAvailableCoachSeats()) {
			bookedCoachSeats += totalNumberOfSeats;
			success = true;
		}
	}
	
	return success;
}

	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

}

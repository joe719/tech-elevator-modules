package com.techelevator;




public class Elevator {
	
	private int currentFloor;
	private boolean doorOpen;
	
	
public Elevator(int numberOfFloors) {
	this.numberOfFloors = numberOfFloors;
	this.currentFloor = 1;
}
	public void openDoor() {
		doorOpen = true;
	}
	public void closeDoor() {
		doorOpen = false;
	}
	public void goUp(int desiredFloor) {
		if (!doorOpen && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
			currentFloor = desiredFloor;
		}
			
	}
	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor >= 1 && desiredFloor < currentFloor) {
			currentFloor = desiredFloor;
		}
	}

	private int numberOfFloors;
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}


	


}

package com.techelevator;

public class Television {

	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	
	public Television() {
		this.currentChannel = 3;
		this.currentVolume = 2;
	}
	
	
		//currentChannel = 3;
		//currentVolume = 2;
	
	public void turnOff() {
    	if(isOn == true) {
		isOn = false;
    	}
    }
    	
    public void turnOn() {
    	if(isOn == false) {
    		isOn = true;
    	
    	currentChannel = 3;
    	currentVolume = 2;
    	}
    }
    
    //changes the current channel—only if it's on—to the value of `newChannel` as long as it's between 3 and 18.
    public void changeChannel(int newChannel) {
    	if(isOn && newChannel >= 3 && newChannel <= 18) {
    		currentChannel = newChannel;
    }
    }
    
    public void channelUp() {
    	if(isOn && currentChannel >= 3 && currentChannel <= 17) {
    		currentChannel++;
    	} else if(isOn) {
    		currentChannel = 3;
    	}
    }
    
    public void channelDown() {
    	if(isOn && currentChannel > 3 && currentChannel <= 18) {
    		currentChannel--;
    	} else if(isOn) {
    		currentChannel = 18;
    	}
    }
    
    public void raiseVolume() {
    	if(isOn && currentVolume >= 2 && currentVolume <= 9) {
    		currentVolume++;
    	}
    }
    
    public void lowerVolume() {
    	if(isOn && currentVolume >= 1 && currentVolume <= 10) {
    		currentVolume--;
    	}
    }
	
	
    public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}


}


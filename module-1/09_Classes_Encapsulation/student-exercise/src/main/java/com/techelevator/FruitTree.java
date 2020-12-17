package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int piecesOfFruitLeft) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = piecesOfFruitLeft;
	}
	
	//# fruit to remove
	
	//if # fruit < what we have - boolean true, if not boolean false
	
	//boolean true - lower # we have
	
	//boolean false - go home
	
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		
		
		if(this.piecesOfFruitLeft >= numberOfPiecesToRemove) {
		this.piecesOfFruitLeft = this.piecesOfFruitLeft - numberOfPiecesToRemove;
		return true;
		}
		return false;
		
	}
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

}

package com.boston.codingdojo;

public class ItemExtended extends Item {
	public ItemExtended(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		// implementation left to subclasses
	}
	
	protected void incrementQuality(int incrementAmount) {
		// if increasing, do nothing if qualiy 50 or above and do not increase above 50
		if (incrementAmount > 0 && quality < 50) {
			quality +=incrementAmount;
			if (quality > 50) {
				quality = 50;
			}
		}
		// if increasing, do nothing if qualiy 0 or below or and do not increase below 0
		else if (incrementAmount < 0 && quality > 0){
			quality += incrementAmount;
			if (quality < 0) {
				quality = 0;
			}
		}
			
	}

	protected void incrementDaysToExpire() {
	  sellIn --;
  }
}

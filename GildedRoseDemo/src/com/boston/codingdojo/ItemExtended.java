package com.boston.codingdojo;

public class ItemExtended extends Item {
	public ItemExtended(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		// implementation left to subclasses
	}
	
	protected void incrementQuality(int incrementAmount) {
		if ((incrementAmount > 0 && quality >= 50) || (incrementAmount < 0 && quality <=0 )) {
			// do nothing
		}
		else {
			quality += incrementAmount;
			if (quality > 50) {
				quality = 50;
			} 
			if (quality < 0) {
				quality = 0;
			}
		}
			
	}

	protected void incrementDaysToExpire() {
	  sellIn --;
  }
}

package com.boston.codingdojo;

public class ItemOther extends ItemExtended {

	public ItemOther(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	public int getIncrementAmount() {
		if (sellIn > 0) {
			return -1;
		} else {
			return -2;
		}
	}
	
	public void updateQuality() {
		incrementQuality(getIncrementAmount());
		incrementDaysToExpire();
	}

}

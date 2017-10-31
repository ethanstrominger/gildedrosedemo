package com.boston.codingdojo;

public class ItemOther extends ItemExtended {

	public ItemOther(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
    // calls second getIncrementFunction to ensure using logic of that function
	public int getIncrementAmount() {
		return getIncrementAmount(sellIn);
	}
	
	// create static function so can be called by ItemConjured
	public static int getIncrementAmount(int pSellIn) {
		if (pSellIn > 0) {
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

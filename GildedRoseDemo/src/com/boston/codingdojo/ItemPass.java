package com.boston.codingdojo;

public class ItemPass extends ItemExtended {

	public ItemPass(int sellIn, int quality) {
		super(GildedRose.ITEM_PASS, sellIn, quality);
	}
	
	public int getIncrementAmount() {
		if (sellIn > 10) {
			return 1;
		} else if (sellIn > 5) {
			return 2;
		} else if (sellIn > 0) {
			return 3;
		}
		else {
			return -quality;
		}
	}
	
	public void updateQuality() {
		incrementQuality(getIncrementAmount());
		incrementDaysToExpire();
	}

}

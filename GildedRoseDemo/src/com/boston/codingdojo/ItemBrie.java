package com.boston.codingdojo;

public class ItemBrie extends ItemExtended {

	public ItemBrie(int sellIn, int quality) {
		super(ItemUtil.ITEM_BRIE, sellIn, quality);
	}
	
	public int getIncrementAmount() {
		if (sellIn > 0) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public void updateQuality() {
		incrementQuality(getIncrementAmount());
		incrementDaysToExpire();
	}

}

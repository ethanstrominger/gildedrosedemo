package com.boston.codingdojo;

public class ItemConjured extends ItemExtended {

	public ItemConjured(int sellIn, int quality) {
		super(ItemUtil.ITEM_CONJURED, sellIn, quality);
	}
	
	public int getIncrementAmount() {
		return 2*ItemOther.getIncrementAmount(sellIn);
	}

	public void updateQuality() {
		incrementQuality(getIncrementAmount());
		incrementDaysToExpire();
	}

}

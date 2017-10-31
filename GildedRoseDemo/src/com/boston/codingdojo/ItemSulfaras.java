package com.boston.codingdojo;

public class ItemSulfaras extends ItemExtended {
	String s = ItemUtil.ITEM_PASS;

	public ItemSulfaras(int sellIn, int quality) {
		super(ItemUtil.ITEM_SULFARAS, sellIn, quality);
	}
	
	public int getIncrementAmount() {
		return 0;
	}
	
	public void updateQuality() {
		// do nothing
		// incrementQuality(getIncrementAmount());
		// incrementDaysToExpire();
	}

}

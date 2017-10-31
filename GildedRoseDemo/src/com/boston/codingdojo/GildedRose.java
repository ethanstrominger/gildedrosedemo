package com.boston.codingdojo;

public class GildedRose {

	public static final String ITEM_PASS = "Backstage passes to a TAFKAL80ETC concert";
	public static final String ITEM_BRIE = "Aged Brie";
	public static final String ITEM_SULFARAS = "Sulfuras, Hand of Ragnaros";
	
	public Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		int increment = 0;
		for (int i = 0; i < items.length; i++) {
			((ItemExtended)items[i]).updateQuality();
		}
	}
}
package com.boston.codingdojo;

public class GildedRose {

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
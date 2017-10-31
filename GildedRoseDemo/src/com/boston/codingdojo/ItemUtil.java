package com.boston.codingdojo;


public class ItemUtil {

	public Item createItem (String name, int sellIn, int quality) {
		switch (name) {
		case GildedRose.ITEM_BRIE: 
			return new ItemBrie (sellIn, quality);
		case GildedRose.ITEM_PASS:
			return new ItemPass (sellIn, quality);
			//do nothing			
		case GildedRose.ITEM_SULFARAS:
			return new ItemSulfaras (sellIn, quality);
			//do nothing			
		default:
			return new ItemOther (name, sellIn, quality);
		}
	}

}

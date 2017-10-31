package com.boston.codingdojo;


public class ItemUtil {

	public static final String ITEM_PASS = "Backstage passes to a TAFKAL80ETC concert";
	public static final String ITEM_BRIE = "Aged Brie";
	public static final String ITEM_SULFARAS = "Sulfuras, Hand of Ragnaros";

	public Item createItem (String name, int sellIn, int quality) {
		switch (name) {
		case ItemUtil.ITEM_BRIE: 
			return new ItemBrie (sellIn, quality);
		case ItemUtil.ITEM_PASS:
			return new ItemPass (sellIn, quality);
			//do nothing			
		case ItemUtil.ITEM_SULFARAS:
			return new ItemSulfaras (sellIn, quality);
			//do nothing			
		default:
			return new ItemOther (name, sellIn, quality);
		}
	}

}

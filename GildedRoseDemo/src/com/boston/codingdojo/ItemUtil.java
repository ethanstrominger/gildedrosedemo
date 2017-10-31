package com.boston.codingdojo;


public class ItemUtil {

	public static final String ITEM_PASS = "Backstage passes to a TAFKAL80ETC concert";
	public static final String ITEM_BRIE = "Aged Brie";
	public static final String ITEM_SULFARAS = "Sulfuras, Hand of Ragnaros";
	public static final String ITEM_CONJURED = "Conjured thing";

	public Item createItem (String name, int sellIn, int quality) {		
		return new Item (name, sellIn, quality);
//      Copied tests from completed kata that included classes
//      May want to use these later
//		switch (name) {
//		case ItemUtil.ITEM_BRIE: 
//			return new ItemBrie (sellIn, quality);
//		case ItemUtil.ITEM_CONJURED:
//			return new ItemConjured (sellIn, quality);
//		case ItemUtil.ITEM_PASS:
//			return new ItemPass (sellIn, quality);
//		case ItemUtil.ITEM_SULFARAS:
//			return new ItemSulfaras (sellIn, quality);
//		default:
//			return new ItemOther (name, sellIn, quality);
//		}
	}

}

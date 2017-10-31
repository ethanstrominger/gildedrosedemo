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
        	switch (items[i].name) {
        	case ITEM_SULFARAS:
        		continue;
        	case ITEM_BRIE:
        		if (items[i].sellIn > 0) {
        			increment = 1;
        		}
        		else {
        			increment = 2;
        		}
        		if (items[i].quality < 50) {
        			items[i].quality += increment;
        			if (items[i].quality > 50) {
        				items[i].quality = 50;
        			}
        		}
        		items[i].sellIn --;
        		continue;
        	case ITEM_PASS:
        		if (items[i].sellIn > 10) {
        			increment = 1;
        		}
        		else if (items[i].sellIn > 5) {
        			increment = 2;
        		}
        		else if (items[i].sellIn > 0) {
        			increment = 3;
        		}
        		// increment <= 0
        		else {
        			increment = -items[i].quality;
        		}
        			
        		if (items[i].quality < 50) {
        			items[i].quality += increment;
        			if (items[i].quality > 50) {
        				items[i].quality = 50;
        			}
        		}
        		items[i].sellIn --;
        		continue;
        	default:
        		if (items[i].sellIn > 0) {
        			increment = -1;
        		}
        		else {
        			increment = -2;
        		}
        		if (items[i].quality > 0) {
        			items[i].quality += increment;
        			if (items[i].quality < 0) {
        				items[i].quality = 0;
        			}
        		}
        		items[i].sellIn --;
        		continue;
        }
        	
//        	if (!items[i].name.equals(ITEM_BRIE)
//                    && !items[i].name.equals(ITEM_PASS)) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals(ITEM_SULFARAS)) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals(ITEM_PASS)) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
////            }
//
//            if (!items[i].name.equals(ITEM_SULFARAS)) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals(ITEM_BRIE)) {
//                    if (!items[i].name.equals(ITEM_PASS)) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals(ITEM_SULFARAS)) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
        }
}
}
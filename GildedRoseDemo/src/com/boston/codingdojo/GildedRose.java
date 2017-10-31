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
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
			if (itemIsNotBrieOrPass(item)) {
                if (item.quality > 0) {
                    if (itemIsNotSulfaras(item)) {
                        item.quality = item.quality - 1;
                    }
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (itemIsPass(item)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }

            if (itemIsNotSulfaras(item)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (itemIsNotBrie(item)) {
                    if (itemIsNotPass(item)) {
                        if (item.quality > 0) {
                            if (itemIsNotSulfaras(item)) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

	/**
	 * @param item
	 * @return
	 */
	public boolean itemIsNotPass(Item item) {
		return !itemIsPass(item);
	}

	/**
	 * @param item
	 * @return
	 */
	public boolean itemIsNotBrie(Item item) {
		return !item.name.equals(ITEM_BRIE);
	}

	/**
	 * @param item
	 * @return
	 */
	public boolean itemIsPass(Item item) {
		return item.name.equals(ITEM_PASS);
	}

	/**
	 * @param item
	 * @return
	 */
	public boolean itemIsNotSulfaras(Item item) {
		return !item.name.equals(ITEM_SULFARAS);
	}

	/**
	 * @param item
	 * @return
	 */
	public boolean itemIsNotBrieOrPass(Item item) {
		return itemIsNotBrie(item)
		        && itemIsNotPass(item);
	}
}
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
			switch (item.name) {
			case ItemUtil.ITEM_SULFARAS:
				continue;
			case ItemUtil.ITEM_BRIE:
				updateQualityBrie(item);
				break;
			case ItemUtil.ITEM_PASS:
				updateQualityPass(item);
				break;
			default:
				updateQualityOther(item);
				break;
			}

			decreaseSellinExcludesSulfaras(item);
		}

	}

	/**
	 * @param item
	 * @return
	 */
	public boolean itemIsExpired(Item item) {
		return item.sellIn <= 0;
	}

	/**
	 * @param item
	 */
	public void decreaseSellinExcludesSulfaras(Item item) {
		item.sellIn = item.sellIn - 1;
	}

	public void incrementItem(Item item, int incrementAmount) {
		if (incrementAmount > 0) {
			if (item.quality < 50) {
				item.quality = item.quality + incrementAmount;
				if (item.quality > 50) {
					item.quality = 50;
				}
			}
		} else if (incrementAmount < 0) {
			if (item.quality > 0) {
				item.quality = item.quality + incrementAmount;
				if (item.quality < 0) {
					item.quality = 0;
				}
			}
		}
	}

	public void updateQualityBrie(Item item) {
		if (itemIsExpired(item)) {
			incrementItem(item, 2);
		} else {
			incrementItem(item, 1);
		}
	}

	/**
	 * @param item
	 */
	public void updateQualityPass(Item item) {
		if (item.sellIn > 10) {
			incrementItem(item, 1);
		} else if (item.sellIn > 5) {
			incrementItem(item, 2);
		} else if (item.sellIn > 0) {
			incrementItem(item, 3);
		} else {
			incrementItem(item, -item.quality);
		}
	}

	/**
	 * @param item
	 */
	public void updateQualityOther(Item item) {
		if (item.quality > 0) {
			if (itemIsExpired(item)) {
				incrementItem (item, -2);
			} else {
				incrementItem (item, -1);
			}
		}
	}

}
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

	public void updateQualityBrie(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;
		}
		if (itemIsExpired(item)) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}
		}
	}

	/**
	 * @param item
	 */
	public void updateQualityPass(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;

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
		if (itemIsExpired(item)) {
			item.quality = item.quality - item.quality;
		}
	}

	/**
	 * @param item
	 */
	public void updateQualityOther(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
		if (itemIsExpired(item) && item.quality > 0) {
			item.quality = item.quality - 1;
		}
	}

}
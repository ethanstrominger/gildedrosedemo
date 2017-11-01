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
			if (itemIsSulfaras(item)) {
				continue;
			}
			if (itemIsNotBrieOrPass(item)) {
				updateQualityOther(item);
			} else if (item.name.equals(ItemUtil.ITEM_BRIE)) {
				updateQualityBrie(item);
			} else if (item.name.equals(ItemUtil.ITEM_PASS)) {
				updateQualityPass(item);
			}

			if (itemIsExpired(item)) {
				extraUpdateQualityWhenExpired(item);
			}

			decreaseSellinExcludesSulfaras(item);

		}
	}

	private boolean itemIsSulfaras(Item item) {
		if (item.name.equals(ItemUtil.ITEM_SULFARAS)) {
			return true;
		} else {
			return false;
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
	public void extraUpdateQualityWhenExpired(Item item) {
		if (itemIsPass(item)) {
			item.quality = item.quality - item.quality;
		} else if (itemIsBrie(item)) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}
		}
	}

	private boolean itemIsBrie(Item item) {
		if (item.name.equals(ITEM_BRIE)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param item
	 */
	public void decreaseSellinExcludesSulfaras(Item item) {
		if (itemIsNotSulfaras(item)) {
			item.sellIn = item.sellIn - 1;
		}
	}

	public void updateQualityBrie(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;
		}
	}

	/**
	 * @param item
	 */
	public void updateQualityPass(Item item) {
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
		return itemIsNotBrie(item) && itemIsNotPass(item);
	}
}
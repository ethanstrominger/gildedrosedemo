package com.boston.codingdojo;

import static org.junit.Assert.assertEquals;

public class TestGildedRoseUtil {

	Item[] items = {new ItemUtil().createItem("A",1,2)};

	public static void testQuality(String itemName, int daysToExpire, int quality, int expectedQuality) {
		Item[] items = {new ItemUtil().createItem(itemName,daysToExpire,quality)};
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals (expectedQuality, gildedRose.items[0].quality);
	}

	public static void testDaysToExpire(String itemName, int daysToExpire, int quality, int expectedDaysToExpire) {
		Item[] items = {new ItemUtil().createItem(itemName,daysToExpire,quality)};
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals (expectedDaysToExpire, gildedRose.items[0].sellIn);
	}

}

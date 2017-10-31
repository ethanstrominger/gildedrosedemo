package com.boston.codingdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSulfaras {

	@Test
	public void testQualityDoesNotChange() {
		// last three params are sellIn, quality, expected quality
		testQuality(GildedRose.ITEM_SULFARAS, 5, 80, 80);
	}

	@Test
	public void testErrorQualityNot50() {
		// last three params are sellIn, quality, expected quality
		testQuality(GildedRose.ITEM_SULFARAS, 8, 55, 55);
		testQuality(GildedRose.ITEM_SULFARAS, 4, 45, 45);
	}

	@Test
	public void testErrorQualityZeroOrNegative() {
		// last three params are sellIn, quality, expected quality
		testQuality(GildedRose.ITEM_SULFARAS, 7, 0, 0);
		testQuality(GildedRose.ITEM_SULFARAS, 2, 45, 45);
	}

	public void testQuality(String itemName, int daysToExpire, int quality, int expectedQuality) {
		Item[] items = {new Item(itemName,daysToExpire,quality)};
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals (expectedQuality, gildedRose.items[0].quality);
	}

}

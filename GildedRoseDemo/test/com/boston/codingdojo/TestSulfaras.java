package com.boston.codingdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSulfaras {

	@Test
	public void testQualityDoesNotChange() {
		String itemName = GildedRose.ITEM_SULFARAS;
		int daysToExpire = 5;
		int quality = 80;
		int expectedQuality = 80;
		Item[] items = {new Item(itemName,daysToExpire,quality)};
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals (expectedQuality, gildedRose.items[0].quality);
	}

	@Test
	public void testQualityNot50() {
		String itemName = GildedRose.ITEM_SULFARAS;
		
		// Test for 55
		int daysToExpire = 8;
		int quality = 55;
		int expectedQuality = 55;
		Item[] items = {new Item(itemName,daysToExpire,quality)};
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals (expectedQuality, gildedRose.items[0].quality);
		
		// Test for 45
		daysToExpire = 4;
		quality = 45;
		expectedQuality = 45;
		items[0] = new Item(itemName,daysToExpire,quality);
		gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals (expectedQuality, gildedRose.items[0].quality);
	}

}

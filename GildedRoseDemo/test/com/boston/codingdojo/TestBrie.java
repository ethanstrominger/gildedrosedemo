package com.boston.codingdojo;

import org.junit.Test;

public class TestBrie {

	@Test
	public void testQualityIncreaseByOneWhenNotExpired() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_BRIE, 5, 40, 41);
	}

	@Test
	public void testQualityIncreaseByTwoWhenExpiredZero() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_BRIE, 0, 35, 37);
	}

	@Test
	public void testQualityIncreaseByTwoWhenExpired() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_BRIE, -1, 40, 42);
	}

	@Test
	public void testQualityAt50DoesNotChange() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_BRIE, 4, 50, 50);
	}

	@Test
	public void testBadQualityAbove50DoesNotChange() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_BRIE, 8, 53, 53);
	}

	@Test
	public void testQualityAt49ChangesTo50EvenWhenExpired() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_BRIE, -1, 49, 50);
	}

	@Test
	public void testDaysToExpireDecreasesByOneWhenQuality55_45_0_negative() {
		// last three params are sellIn, quality, expected sellIn
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_BRIE, 7, 55, 6);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_BRIE, 0, 45, -1);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_BRIE, -3, 0, -4);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_BRIE, 4, -10, 3);
	}

}

package com.boston.codingdojo;

import org.junit.Test;

public class TestPass {

	@Test
	public void testQualityIncreaseByOneWhenDaysToExpireInMoreThan10() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 13, 40, 41);
	}

	@Test
	public void testQualityIncreaseByTwoWhenDaysToExpireBetween10And6() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 10, 37, 39);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 9, 34, 36);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 6, 30, 32);
	}

	@Test
	public void testQualityIncreaseByTwoWhenDaysToExpireBetween5And1() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 5, 38, 41);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 4, 33, 36);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 1, 37, 40);
	}
	
	@Test
	public void testQualityGoesToZeroWhenDaysToExpireZeroOrNeg() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 0, 38, 0);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, -1, 33, 0);
	}
	
	@Test
	public void testQualityAt50DoesNotChange() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 4, 50, 50);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 6, 50, 50);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 11, 50, 50);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 10, 50, 50);
	}

	@Test
	public void testQualityDoesNotIncreasesAbove50() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 8, 49, 50);
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 2, 49, 50);
	}

	@Test
	public void testBadQualityAbove50DoesNotChange() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(GildedRose.ITEM_PASS, 8, 53, 53);
	}

	@Test
	public void testDaysToExpireDecreasesByOneWhenQuality55_45_0_negative() {
		// last three params are sellIn, quality, expected sellIn
		TestGildedRoseUtil.testDaysToExpire(GildedRose.ITEM_PASS, 7, 55, 6);
		TestGildedRoseUtil.testDaysToExpire(GildedRose.ITEM_PASS, 0, 45, -1);
		TestGildedRoseUtil.testDaysToExpire(GildedRose.ITEM_PASS, -3, 0, -4);
		TestGildedRoseUtil.testDaysToExpire(GildedRose.ITEM_PASS, 4, -10, 3);
	}

}

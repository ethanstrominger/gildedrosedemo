package com.boston.codingdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOther {

	private static String ITEM_OTHER = "An arbitrary string";

	@Test
	public void testQualityChangeByOneWhenDaysToExpirePositive() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ITEM_OTHER, 5, 40, 39);
	}

	@Test
	public void testQualityChangeByTwoWhenDaysToExpireZeroOrNeg() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ITEM_OTHER, 0, 40, 38);
		TestGildedRoseUtil.testQuality(ITEM_OTHER, 0, 34, 32);
	}

	@Test
	public void testQualityDoesNotChangeWhenQualityZeroOrNegative() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ITEM_OTHER, 7, 0, 0);
	}

	@Test
	public void testBadQualityAboveAndAt50Decreases() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ITEM_OTHER, 8, 53, 52);
		TestGildedRoseUtil.testQuality(ITEM_OTHER, 4, 50, 49);
	}

	@Test
	public void testBadQualityDoesNotChangeWhenNegative() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ITEM_OTHER, 7, -3, -3);
	}

	@Test
	public void testDaysToExpireDecreasesByOneWhenQuality55_45_0_negative() {
		// last three params are sellIn, quality, expected sellIn
		TestGildedRoseUtil.testDaysToExpire(ITEM_OTHER, 7, 55, 6);
		TestGildedRoseUtil.testDaysToExpire(ITEM_OTHER, 0, 45, -1);
		TestGildedRoseUtil.testDaysToExpire(ITEM_OTHER, -3, 0, -4);
		TestGildedRoseUtil.testDaysToExpire(ITEM_OTHER, 4, -10, 3);
	}

}

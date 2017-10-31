package com.boston.codingdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConjured {

	@Test
	public void testQualityChangeByTwoWhenDaysToExpirePositive() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, 5, 40, 38);
	}

	@Test
	public void testQualityDecreaseByFourWhenDaysToExpireZeroOrNeg() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, 0, 40, 36);
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, 0, 34, 30);
	}

	@Test
	public void testQualityOfOneDoesNotGoesNegativeWhenDecreaseBy() {
	// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, -1, 1, 0);
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, -1, 3, 0);
	}

	@Test
	public void testQualityDoesNotChangeWhenQualityZeroOrNegative() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, 7, 0, 0);
	}

	@Test
	public void testBadQualityAboveAndAt50Decreases() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, 8, 53, 51);
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, 4, 50, 48);
	}

	@Test
	public void testBadQualityDoesNotChangeWhenNegative() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_CONJURED, 7, -3, -3);
	}

	@Test
	public void testDaysToExpireDecreasesByOneWhenQuality55_45_0_negative() {
		// last three params are sellIn, quality, expected sellIn
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_CONJURED, 7, 55, 6);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_CONJURED, 0, 45, -1);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_CONJURED, -3, 0, -4);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_CONJURED, 4, -10, 3);
	}

}

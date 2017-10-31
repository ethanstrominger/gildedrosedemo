package com.boston.codingdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSulfaras {

	@Test
	public void testQualityDoesNotChange() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_SULFARAS, 5, 80, 80);
	}

	@Test
	public void testErrorQualityNot50() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_SULFARAS, 8, 55, 55);
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_SULFARAS, 4, 45, 45);
	}

	@Test
	public void testErrorQualityZeroOrNegative() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_SULFARAS, 7, 0, 0);
		TestGildedRoseUtil.testQuality(ItemUtil.ITEM_SULFARAS, 2, 45, 45);
	}

	@Test
	public void testDaysToExpireDoesNotChange() {
		// last three params are sellIn, quality, expected quality
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_SULFARAS, 7, 80, 7);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_SULFARAS, 0, 80, 0);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_SULFARAS, -3, 80, -3);
		TestGildedRoseUtil.testDaysToExpire(ItemUtil.ITEM_SULFARAS, 4, 45, 4);
	}

}

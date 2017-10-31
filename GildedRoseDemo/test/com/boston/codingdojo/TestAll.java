package com.boston.codingdojo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
  TestBrie.class,
  TestOther.class,
  TestPass.class,
  TestSulfaras.class
})

public class TestAll {


	public class FeatureTestSuite {
	  // the class remains empty,
	  // used only as a holder for the above annotations
	}

}

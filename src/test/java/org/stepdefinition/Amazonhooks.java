package org.stepdefinition;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Before;

public class Amazonhooks extends BaseClass {
	
	@Before
	 private void precondition4() {
     windowMaximize();
	}
@cucumber.api.java.Before
	 private void precondition8() {
      launchBrowser();
	}

	@cucumber.api.java.Before
	
	private void postcondition() {
		System.out.println("ethathu print agu");
	}
	
}

package org.test;

import org.testng.annotations.Test;

public class ClassA extends BaseClass{

	
	@Test
	public void test1() {
		launchBrowser("Chrome");
		launchUrl("https://adactinhotelapp.com/");
	}
}

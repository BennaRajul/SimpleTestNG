package org.test;

import org.testng.annotations.DataProvider;

public class Datas {
	@DataProvider(name="login")
	private Object[][] getdata(){
		return new Object[][] {
			{"BennaRajul","Benna88"},
			{"SeenivasanG","Selenium123"}
		};
		
	}

}

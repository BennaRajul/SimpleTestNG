package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonBrowser extends BaseClass{
	@BeforeClass
	private void beforeclass(){
		launchBrowser("Chrome");
		launchUrl("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMIupWLqdL47wIVZdOWCh0S2wTtEAAYASAAEgKdUPD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIupWLqdL47wIVZdOWCh0S2wTtEAAYASAAEgKdUPD_BwE");
		
	}
	@Test
	private void test1() {
		Amazon a=new Amazon();
		fillTextBox(a.getSearchbox(),"iphone");	
		btnClick(a.getSubmit());
		List<WebElement> y=a.getFirstpage();
		for (WebElement e: y)  
		{          
			 
		      System.out.println(e.getAttribute("innerText"));    
		}
	}
	
	
 
}

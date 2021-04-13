package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon<WebElements> extends BaseClass {
	public Amazon() {
		PageFactory.initElements(driver, this);
	}
@FindBy (id="twotabsearchtextbox")
private WebElement searchbox;
public WebElement getSearchbox() {
	return searchbox;
}
@FindBy(id="nav-search-submit-button")
private WebElement Submit;
public WebElement getSubmit() {
	return Submit;
}
@FindBy(className="sg-col-inner")
private List <WebElement> firstpage;
public List<WebElement> getFirstpage() {
	
	return firstpage;
}

}

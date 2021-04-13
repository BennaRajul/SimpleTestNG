package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardDetails extends BaseClass {

	public CardDetails() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="first_name")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(name="last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(name="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	@FindBy(name="cc_num")
	private WebElement cardno;

	public WebElement getCardno() {
		return cardno;
	}
	@FindBy(name="cc_type")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}
	@FindBy(name="cc_exp_month")
	private WebElement cardexpmonth;
	public WebElement getCardexpmonth() {
		return cardexpmonth;
	}

	@FindBy(name="cc_exp_year")
	private WebElement cardexpyear;

	public WebElement getCardexpyear() {
		return cardexpyear;
	}
	@FindBy(name="cc_cvv")
	private WebElement cvvno;

	public WebElement getCvvno() {
		return cvvno;
	}
	@FindBy(name="book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
}

package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingAdactin extends BaseClass {
	public BookingAdactin() {
		PageFactory.initElements(driver, this);
	}
@FindBy (name="location")
private WebElement location;
public WebElement getLocation() {
	return location;
}

@FindBy(name="hotels")
private WebElement hotel;
public WebElement getHotel() {
	return hotel;
}
@FindBy(name="room_type")
private WebElement roomtype;
public WebElement getRoomtype() {
	return roomtype;
}


}

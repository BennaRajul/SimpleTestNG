package org.test;


import org.testng.annotations.*;

public class AdactinBrowser extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		launchBrowser("Chrome");
		launchUrl("https://adactinhotelapp.com/");
 
	}
	
@Test(dataProvider="login",dataProviderClass=Datas.class)
private void test1(String user,String pass){

	
	
	Adactinuserlogin l=new Adactinuserlogin();
	fillTextBox(l.getUser(), user);
	  fillTextBox(l.getPass(), pass);
		btnClick(l.getLogin());
		
		BookingAdactin b=new BookingAdactin();
		selectByIndex(b.getLocation(),2 );
		selectByIndex(b.getHotel(), 3);
		selectByIndex(b.getRoomtype(), 3);
		selectByIndex(b.getRoomno(), 4);
		b.getDatepickin().clear();
		fillTextBox(b.getDatepickin(), "25/04/2021");
		b.getDatepickout().clear();
		fillTextBox(b.getDatepickout(), "27/04/2021");
		selectByIndex(b.getAdultroom(), 1);
		selectByIndex(b.getChildroom(), 0);
		btnClick(b.getSubmit());
		btnClick(b.getRadiobutton());
	    btnClick(b.getCont());
		 
	    CardDetails c=new CardDetails();
	    fillTextBox(c.getFirstname(), "Selva");
	    fillTextBox(c.getLastname(), "Benina");
	    fillTextBox(c.getAddress(), "3/FB,Jain Alpine Meadows,Chennai");
	    fillTextBox(c.getCardno(), "20182 01920 202020");
	    selectByIndex(c.getCardtype(), 3);
	    selectByIndex(c.getCardexpmonth(), 4);
	    selectByIndex(c.getCardexpyear(), 4);
	    fillTextBox(c.getCvvno(), "016");
	    btnClick(c.getBooknow());
	    
	    Thread.sleep(9000);
	   System.out.println(getAttribute(c.getOrderno()));

	}


	@DataProvider(name="login")
	private Object[][] getdata(){
		return new Object[][] {
			{"BennaRajul","Benna88"}
			//{"","Selenium123"}
		};
		

}
}

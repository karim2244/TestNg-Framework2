package Regression;

import org.testng.annotations.Test;

import Commoncode.baseclass;
import Pages.Signup;

public class NewTest1 extends baseclass {
  @Test
  public void f() throws InterruptedException {
	  Signup ob = new Signup(driver);
	  ob.myaccountclick();
	  Thread.sleep(9000);
	  ob.registerclick();
	  Thread.sleep(9000);
	  ob.selectclick();
	  Thread.sleep(9000);
	  ob.emailfield("abc@gmail.com");
	  Thread.sleep(9000);
	  ob.passfield("476475475Ab#");
	  Thread.sleep(9000);
	  ob.zip("10001");
	  Thread.sleep(9000);
	  ob.phonenumber("1 01786557544");
	  Thread.sleep(9000);
	  ob.createanaccount();
	  Thread.sleep(9000);
	 
	  
  }
}

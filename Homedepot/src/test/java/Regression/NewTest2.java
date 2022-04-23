package Regression;

import org.testng.annotations.Test;

import Commoncode.baseclass;
import Pages.fbhome;

import org.testng.annotations.DataProvider;

public class NewTest2 extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String pass) throws InterruptedException {
	  fbhome ob = new fbhome(driver);
	  ob.emailfield(email);
	  Thread.sleep(5000);
	  ob.passfield(pass);
	  Thread.sleep(5000);
	  ob.login();
	  driver.navigate().back();
	  Thread.sleep(5000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@gmail.com", "aaaaaaa" },
      new Object[] { "def@gmail.com", "bbbbbbb" },
      new Object[] { "ghk@gmail.com", "ccccccc" },
      new Object[] { "klm@gmail.com", "ddddddd" },
      new Object[] { "nop@gmail.com", "eeeeeee" },
    };
  }
}

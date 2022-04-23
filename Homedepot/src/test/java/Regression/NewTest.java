package Regression;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@gmail.com", "aaaaaaaa" },
      new Object[] { "def@gamil.com", "bbbbbbbb" },
      new Object[] { "ijk@gamil.com", "cccccc" },
      new Object[] { "lmn@gamil.com", "ddddddd" },
      new Object[] { "bnm@gamil.com", "eeeeeee" },
    };
  }
}

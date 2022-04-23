package Commoncode;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass implements ITestListener{
	 @Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
		 this.driver= ((baseclass)result.getInstance()).driver;
		 try {
			shots("Passed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			this.driver= ((baseclass)result.getInstance()).driver;
			try {
				shots("Failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	public WebDriver driver;
	  
	  @BeforeTest
	  @Parameters({"brow","url"})
		  public void browser(String brow, String url) throws InterruptedException {
				
				if(brow.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Bootcam\\Homedepot\\Drivers\\chromedriver.exe ");
					driver = new ChromeDriver();
					driver.get(url);
					driver.manage().window().maximize();
					Thread.sleep(5000);
				}
				else if(brow.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Bootcam\\Homedepot\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.get(url);
					driver.manage().window().maximize();
					Thread.sleep(5000);
				}
				else {
					 
					System.setProperty("webdriver.edge.driver", " C:\\Users\\Lenovo\\Bootcam\\Homedepot\\Drivers\\msedgedriver.exe");
					driver = new EdgeDriver();
					driver.get(url);
					driver.manage().window().maximize();
					Thread.sleep(5000);
				}
	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.close();
	  }
	  public void shots(String folder) throws IOException {
		  Date dt = new Date();
		  String strdate = dt.toString().replace(" ", "-").replace(":", "-");
		  System.out.println(strdate);
		  File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshotFile, new File ("C:\\Users\\Lenovo\\Bootcam\\Homedepot\\Screenshots\\"+folder+"\\"+strdate+".png"));
		 
		  }
	  
	  }

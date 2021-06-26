package sourav_final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {
	  @BeforeClass
	    void setUpClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe\\");
	  }
	  @Test
	    public void imagess() throws InterruptedException {
	        ChromeDriver driver =new ChromeDriver();
// to check images
	        driver.get("http://thedemosite.co.uk/");
	        List<WebElement> list_Images = driver.findElements(By.tagName("img"));
	        int no_images = 0;
	        for (WebElement image : list_Images){
	            if ( image.isDisplayed()){
	                no_images++;
	            }
	        }
	        System.out.println("TOTAL NUMBER OF IMAGES: " + no_images);
	        
	        // to check buttons
	        List<WebElement> list_Buttons = driver.findElements(By.tagName("button"));

	        int no_button = 0;
	        for (WebElement button : list_Buttons) {
	            if(button.getText().equals("buttonName")) {
	            	no_button++;
	            }
	        }
	        System.out.println("TOTAL NUMBER OF BUTTONS " + no_button);

	        driver.close();
	  }
	


	}
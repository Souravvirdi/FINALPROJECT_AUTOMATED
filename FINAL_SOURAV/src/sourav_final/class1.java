package sourav_final;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test; class Automated {

	

    @Test
    public void test_logo_sourav(){
    	//To Open with Chrome Driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe\\");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
    //to check title
        String actual_Title = "Google";
        Assert.assertEquals(driver.getTitle(), actual_Title );
        
       // to check logo 
       WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")  );
      Assert.assertEquals(true, logo.isDisplayed());
        System.out.println("TEST LOGO PASS");
        driver.close();
}
    
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_Static {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C://MyPrograms//webdrivers//chromedriver.exe");
    ChromeOptions chrome_options = new ChromeOptions();
    chrome_options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(chrome_options); 
    
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.manage().window().maximize();
    
    //Static dropdown

      WebElement dropdowncurrency= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       
      Select dropdown=new Select(dropdowncurrency);
      dropdown.selectByIndex(2);
      Thread.sleep(3000);
      System.out.println(dropdown.getFirstSelectedOption().getText());
      
      dropdown.selectByValue("INR");
      Thread.sleep(3000);
      System.out.println(dropdown.getFirstSelectedOption().getText());
    
      dropdown.selectByVisibleText("USD");
      Thread.sleep(3000);
      System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}

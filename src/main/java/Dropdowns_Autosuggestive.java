
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdowns_Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C://MyPrograms//webdrivers//chromedriver.exe");
    ChromeOptions chrome_options = new ChromeOptions();
    chrome_options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(chrome_options); 
    
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.manage().window().maximize();
    
    //Auto suggestive dropdown
    
    driver.findElement(By.id("autosuggest")).sendKeys("Ind");
    Thread.sleep(3000);
   
    List<WebElement>  options=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
    
    for(WebElement option : options)
    {
    	if(option.getText().equalsIgnoreCase("India"))
    	{
    		option.click();
    		Thread.sleep(3000);
    	}
    }
    
 	}

}

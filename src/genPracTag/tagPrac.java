/**
 * 
 */
package genPracTag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Miah
 *
 */
public class tagPrac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		 
        System.setProperty("webdriver.firefox.marionette","C:\\Users\\Miah\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
       
        // if above property is not working or not opening the application in browser then try below property

       //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");

      WebDriver driver = new FirefoxDriver();

      driver.get("http://www.facebook.com");

      System.out.println("Application title is ============="+driver.getTitle());

      driver.quit();

}

}

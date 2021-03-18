import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class calendar {

	@Test
	void calendar1() {
		WebDriver driver = null;
        String browser = "chrome";

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\GuYeti\\Desktop\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get("http://localhost/Calculator/Inputcalender.php");
        driver.manage().window().setSize(new Dimension(520, 554));
        driver.findElement(By.name("month")).click();
        driver.findElement(By.name("month")).click();
        {
          WebElement dropdown = driver.findElement(By.name("month"));
          dropdown.findElement(By.xpath("//option[. = 'May']")).click();
        }
        driver.findElement(By.name("month")).click();
        driver.findElement(By.name("day")).click();
        {
          WebElement dropdown = driver.findElement(By.name("day"));
          dropdown.findElement(By.xpath("//option[. = '4']")).click();
        }
        driver.findElement(By.name("day")).click();
        driver.findElement(By.cssSelector("button")).click();
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Tuesday",result);
        
	}
	@Test
	void calendar2() {
		WebDriver driver = null;
        String browser = "chrome";

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\GuYeti\\Desktop\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get("http://localhost/Calculator/Inputcalender.php");
        driver.manage().window().setSize(new Dimension(520, 554));
        driver.findElement(By.name("month")).click();
        {
          WebElement dropdown = driver.findElement(By.name("month"));
          dropdown.findElement(By.xpath("//option[. = 'June']")).click();
        }
        driver.findElement(By.name("month")).click();
        driver.findElement(By.name("day")).click();
        {
          WebElement dropdown = driver.findElement(By.name("day"));
          dropdown.findElement(By.xpath("//option[. = '7']")).click();
        }
        driver.findElement(By.name("day")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.id("result")).click();
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Monday",result);
	}
	@Test
	void calendar3() {
		WebDriver driver = null;
        String browser = "chrome";

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\GuYeti\\Desktop\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get("http://localhost/Calculator/Inputcalender.php");
        driver.manage().window().setSize(new Dimension(520, 556));
        driver.findElement(By.name("month")).click();
        {
          WebElement dropdown = driver.findElement(By.name("month"));
          dropdown.findElement(By.xpath("//option[. = 'February']")).click();
        }
        driver.findElement(By.name("month")).click();
        driver.findElement(By.name("day")).click();
        {
          WebElement dropdown = driver.findElement(By.name("day"));
          dropdown.findElement(By.xpath("//option[. = '2']")).click();
        }
        driver.findElement(By.name("day")).click();
        driver.findElement(By.cssSelector("button")).click();
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Tuesday",result);
	}

}

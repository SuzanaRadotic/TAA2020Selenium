import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTest {

    @Test
    public void simpleTest(){
        System.out.println("This is the first test");

        System.setProperty("webdriver.chrome.driver", "C:\\sourceCode\\TAA2020CE1\\TAA2020Selenium\\src\\main\\resources\\chromedriver.exe");
     //   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

        driver.get(baseUrl);  // to open url
        driver.manage().window().maximize();

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        if(driver.findElement(By.id("user-message")).isDisplayed()){
            driver.findElement(By.id("user-message")).sendKeys("Hello World!");
        }
        
        System.out.println(driver.getTitle()); // prints title of the page displayed in the <head> html tag
        driver.findElement(By.linkText("Table")).click();
        driver.findElement(By.linkText("Table Pagination")).click();

        List<WebElement> listOfElements = driver.findElements(By.cssSelector("#myTable > tr:nth-child(1) > td"));

        for (WebElement element: listOfElements) {
            System.out.println(element.getText());
        }

        //  driver.close();

    }

}

package se.iths.expleotests.problemtwo;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class FindAllLinks  {

    public static void main(String[] args) {
        findLinks();
    }


    public static void findLinks(){

        ChromeDriver driver = new ChromeDriver();
        //WebDriver driver = new RemoteWebDriver("http://localhost:9090", DesiredCapabilities.chrome());

        driver.get("http://www.google.com");

        List<WebElement> links = driver.findElements(By.tagName("<a"));

        String url = "";

        for (WebElement we: links) {
           url = we.getAttribute("href");
            System.out.println(url);

        }

    }

}

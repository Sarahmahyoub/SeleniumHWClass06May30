package HWCLASS06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='save']")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='First-Name']")));

        WebElement text= driver.findElement(By.xpath("//div[@id='First-Name']"));

        System.out.println(text.getText());


    }

}

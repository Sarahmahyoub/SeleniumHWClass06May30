package HWCLASS06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW1 {

    public static void main(String[] args) {

        //goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
        //click on start
        //print the text  "welcome syntax technologies "on console (edited)

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//button[@id='startButton']")).click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@style='padding: 10%;']")));

        WebElement text= driver.findElement(By.xpath("//h4[@style='padding: 10%;']"));

        System.out.println(text.getText());

    }

}

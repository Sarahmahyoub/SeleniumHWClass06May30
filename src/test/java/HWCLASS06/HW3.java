package HWCLASS06;

import DropDownMethod.DropDownM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 extends DropDownM {
    public static void main(String[] args) {

        //HW3:
        //develop a function in common methods to select from dropdown(single select)

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/jquery-dropdown-search-demo.php");
        driver.manage().window().maximize();


        WebElement drop=driver.findElement(By.xpath("//select[@id='country']"));

        String text="Denmark";
        dropDown(drop,text);

    }

}

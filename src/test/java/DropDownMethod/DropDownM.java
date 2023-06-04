package DropDownMethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownM {

    public static void dropDown(WebElement element, String text ){

        Select sel = new Select(element);
        sel.selectByVisibleText(text);


    }
}

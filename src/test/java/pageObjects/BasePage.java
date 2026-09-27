package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//constructor, this is a parent of all the page object class 
public class BasePage {
WebDriver driver;

public  BasePage(WebDriver driver)
{
	this .driver=driver;
	PageFactory.initElements(driver, this);
}
}

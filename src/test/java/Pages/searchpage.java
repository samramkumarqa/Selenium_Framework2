package Pages;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Library.functionalLibrary;
import Repository.pageElements;

public class searchpage extends functionalLibrary{
	WebDriver driver;
	HashMap<String, String> data;
	
	/*
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement submit;
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	WebElement searchdrpdwn;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbx;
	*/
	
	
	public searchpage(WebDriver driver, HashMap<String, String> data) {
		// TODO Auto-generated constructor stub
		super(driver, data);
		this.driver = driver;
		this.data = data;
		PageFactory.initElements(driver, this);
	}
	
	public void searchText() throws IOException, InterruptedException
	{
		//Select se = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		//Select se = new Select(searchdrpdwn);
		//se.selectByVisibleText(data.get("Value2"));
		//searchbx.sendKeys(data.get("Value1"));
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data.get("Value1"));
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//submit.click();
		customselect(searchdrpdwn, data.get("Value2"));
		customsettext(searchbx, data.get("Value1"));
		customclick(submit);
	}

}

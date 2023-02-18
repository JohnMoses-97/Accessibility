package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessibilityPage {
	
	@FindBy(xpath = "//ul//li[@id='mostrecent_li']")
	private WebElement recentLawsuits;
	
	@FindBy(xpath = "//ul//li[@id='mostrecent_li']//following::div[@class='equal_content']")
	private List<WebElement> plaintiffAndDefendantNames;
	
	
	public WebElement getRecentLawsuits() {
		return recentLawsuits;
	}
	
	public List<WebElement> getPlaintiffAndDefendantNames() {
		return plaintiffAndDefendantNames;
	}
	
	public AccessibilityPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}

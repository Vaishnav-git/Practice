package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// home page
	
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement singInButton ;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public  void ClickOnSignIn() {
		
		singInButton.click();
	}
	
}

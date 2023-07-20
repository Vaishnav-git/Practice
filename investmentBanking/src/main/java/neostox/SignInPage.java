package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	@FindBy(css = "input#MainContent_signinsignup_txt_mobilenumber") private WebElement MobileNo;
	@FindBy(css = "a#lnk_signup1") private WebElement signButton2;
	
	public SignInPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterMobNo() {
		MobileNo.sendKeys("7775878098");
		System.out.println("succefully enter Mobile no.");

		
	}
	
	public void ClickSignButton2() {
		signButton2.click();
		System.out.println("succefully click on signButton2");
	}
	
}

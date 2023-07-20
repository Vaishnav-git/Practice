package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {

	@FindBy(css = "input#txt_accesspin") private WebElement pwd;
	@FindBy(css = "a[id=lnk_submitaccesspin]") private WebElement submitButton;
	
	public PasswordPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPassword() throws InterruptedException {
		Thread.sleep(100);
		pwd.sendKeys("2827");
		System.out.println("Succesfully enter password ");
	}
	public void ClickOnSubmit() {
		submitButton.click();
		System.out.println(" Succesfully enter password and click on submit button");
	}
}

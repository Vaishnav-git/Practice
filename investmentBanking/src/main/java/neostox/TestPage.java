package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {

	@FindBy(xpath = "(//a[@id='navbarDropdown']//span)[3]") private WebElement accountName; 
	@FindBy(css = "a#lnk_logout") private WebElement logOutButton;
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUp1;
	@FindBy(xpath = "(//a[@class='close'])[27]//span") private WebElement popUp2;
	
	public TestPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void ClickOnAccountName() {
		accountName.click();
		System.out.println("click on account name");
	}
	public void CheckAccountName() {
		String ActualResult = accountName.getText();
		System.out.println("Account name shown as "+ActualResult );
		String ExpectedResult="Hi Vaish T";
		
		if(ActualResult.equals(ExpectedResult)) {
			
			System.out.println("Account Name is Verifed");
		}
		else {
			System.out.println("Account Name is not correct");
		}
	}
	public void ClickOnLogOut() {
		
		logOutButton.click();
		System.out.println(" click on out");
		
	}
	public void ClickOnOkPopUp1() {
		
		popUp1.click();
		System.out.println("Succsefully handling PopUp1");
	}
	public void ClosePopUp2() {
		popUp2.click();
		System.out.println("Succsefully handling PopUp2");
	}
	
	
}

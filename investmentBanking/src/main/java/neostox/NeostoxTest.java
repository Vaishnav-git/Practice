package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		//System.set.property("webDriver.chrome.driver","path");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://neostox.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		HomePage Hp=new HomePage(driver);
		SignInPage Sp=new SignInPage(driver);
		PasswordPage Pp =new PasswordPage(driver);
		TestPage tp= new TestPage(driver); 
		
		Hp.ClickOnSignIn();
		
		Sp.EnterMobNo();
		Sp.ClickSignButton2();
		Pp.EnterPassword();
		Pp.ClickOnSubmit();
		
		Thread.sleep(1000); 
		tp.ClickOnOkPopUp1();
		tp.ClosePopUp2();
		driver.navigate().refresh();
		tp.ClosePopUp2();
		
		
		tp.ClickOnAccountName();
		tp.CheckAccountName();
		tp.ClickOnLogOut();
	

		

		
	}

}

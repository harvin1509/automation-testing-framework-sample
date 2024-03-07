package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

//rahulonlinetutor@gmail.com
public class LoginPage {
	public WebDriver driver;
	
	By emailTxt =By.cssSelector("[name='username']");
	By passwordTxt =By.cssSelector("[name='password']");
	By loginBtn =By.xpath("//*[@type='submit']");

	public LoginPage(WebDriver driver) {
				this.driver=driver;
	}
	public WebElement getEmailTxt()
	{
		return driver.findElement(emailTxt);
	}

	public WebElement getPasswordTxt()
	{
		return driver.findElement(passwordTxt);
	}
	
	public WebElement getLoginBtn()
	{
		return driver.findElement(loginBtn);
	}

	public void loginToApplication(String url, String username, String password) throws IOException {
		driver.get(url);
		driver.findElement(emailTxt).sendKeys(username);
		driver.findElement(passwordTxt).sendKeys(password);
		getLoginBtn().click();

	}
}

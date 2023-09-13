package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(tagName = "button")
	private WebElement login;
	
	@FindBy(xpath ="//span[@class='alert']")
	private WebElement error;

	public WebElement getError() {
		WebElement error=driver.findElement(By.xpath("\"//span[@class='alert']\""));
		error.getText();
		return error;
	}

	public void setError(WebElement error) {
		this.error = error;
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebDriver getDriver() {
		return driver;
	} 
	
}

package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactFormRepository {
	
	
	public ContactFormRepository(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	@FindBy(id="input-name")
	WebElement fieldName;

	@FindBy(id="input-email")
	WebElement fieldEmail;

	@FindBy(id="input-enquiry")
	WebElement fieldDescription;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	WebElement submitButton;

	@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
	WebElement continueButton;


	public WebElement fieldNameElement() {
		return fieldName;
	}

	public WebElement fieldEmailElement() {
		return fieldEmail;
	}
	
	public WebElement fieldDescriptionElement() {
		return fieldDescription;
	}
	
	public WebElement submitButtonElement() {
		return submitButton;
	}

	public WebElement continueButtonElement() {
		return continueButton;
	}

}

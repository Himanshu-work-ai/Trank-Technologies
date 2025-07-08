package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verticals {
	
	private WebDriver driver;
	
	
	public verticals(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="/html/body/header/div[2]/ul/li[1]/a")
	WebElement vertical;
	

	public void gotovertical() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(vertical).perform();
		Thread.sleep(2000);	
	}
	
	
	@FindBy (xpath="//strong[normalize-space()='Trading']")
	WebElement trading;
	
	@FindBy (xpath="//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']")
	WebElement stocktrading;

		public void gototrading() throws InterruptedException {
			Actions a = new Actions(driver);
			a.moveToElement(trading).perform();
			a.moveToElement(stocktrading).click().perform();
			Thread.sleep(2000);
		}
		
		
		
		@FindBy (xpath="//div[@class='cm-form-field cm-half-field']//input[@placeholder='Your Name']")
		WebElement firstname;
		public void firstName(String fn)  {
			firstname.sendKeys(fn);
		}
		
		@FindBy (xpath="//div[@class='cm-form-field cm-half-field']//input[@placeholder='Your Mail']")
		WebElement urmail;
		public void urmail(String em) {
			urmail.sendKeys(em);
		}
		
		
		@FindBy (xpath="//div[@class='cm-form-field cm-wd-100']//input[@placeholder='Your Company']")
		WebElement urcompany;
		public void yourcompany(String uc) {
			urcompany.sendKeys(uc);
		}
		
		@FindBy (xpath="//div[@class='cm-form-field cm-select-pop-field cm-half-field']//select[@name='service']")
		WebElement service;
		
		@FindBy (xpath="//form[@id=\"get_in_touch_body\"]/div[4]/select/option[3]")
		WebElement ecoomselect;
		
		public void services() {
			service.click();
			ecoomselect.click();
		}
		
		
			
		@FindBy (xpath="//strong[normalize-space()='Retail and Ecommerce']")
		WebElement retailandecommerce;
		
		@FindBy (xpath="//div[@id='retailEcommerce']//li[1]//a[1]")
		WebElement ecomwebsite;
		
		
		public void gotoretailandecom() throws InterruptedException {
		Actions a1 = new Actions(driver);
		a1.moveToElement(vertical).perform();
		Thread.sleep(2000);
		 a1.moveToElement(retailandecommerce).click().perform();
		 a1.moveToElement(ecomwebsite).click().perform();
		
		}
		
		
		
		
		@FindBy (xpath="//strong[normalize-space()='Healthcare']")
		WebElement healthcare;
		
		
		@FindBy (xpath="//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Diet &')]")
		WebElement dietandnutrition;
		
		public void gotoheatlhcare() throws InterruptedException {
		Actions a2= new Actions(driver);
		a2.moveToElement(vertical).perform();
		Thread.sleep(2000);
		a2.moveToElement(healthcare).perform();		
		a2.moveToElement(dietandnutrition).click().perform();
		}
		
		
		@FindBy (xpath="//strong[normalize-space()='Fintech']")
		WebElement fintech;
		
		@FindBy (xpath="//ul[@class='cm-flex cm-flex-wrap']//a[contains(text(),'Pos Software')]")
		WebElement psd;
		
		public void gotofintech() throws InterruptedException {
			Actions a3 = new Actions(driver);
			a3.moveToElement(vertical).perform();
			Thread.sleep(2000);
			a3.moveToElement(fintech).perform();
			a3.moveToElement(psd).click().perform();
		}
		
		
		@FindBy (xpath="//strong[normalize-space()='Custom App']")
		WebElement customapp;
		
		@FindBy (xpath="//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Travel']")
		WebElement travel;
		
		
		public void gotocustomapp() throws InterruptedException {
			Actions a4 = new Actions(driver);
			a4.moveToElement(vertical).perform();
			Thread.sleep(2000);
			a4.moveToElement(customapp).click().perform();
			a4.moveToElement(travel).click().perform();
		}
		
	}
	
	
	
	



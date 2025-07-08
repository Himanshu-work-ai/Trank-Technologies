package Test;

import org.testng.annotations.Test;

import base.basetest;
import pages.RegisterPage;

public class TestRegister extends basetest{
	
	@Test
	void registerTest() throws InterruptedException {
		RegisterPage r = new RegisterPage(driver);
		r.firstName("Monika");
		r.lastName("Sarwaiya");
		r.type_address("ABC");
		r.typeEmail("abc@gmail.com");
		r.typePhoneNum("1234567891");
		r.selectGender();
		r.hobbies();
		//r.selectlang("English");
		r.typeSkills("SQL");
		r.selectCountry("India");
		r.selectCountry2("India");
		r.selectYear("2000");
		r.selectMonth("May");
		r.selectDay("20");
		r.enterPwd("123456");
		r.confirmPassword("123456");
		r.enterSubmit();
		Thread.sleep(5000);
	}

}

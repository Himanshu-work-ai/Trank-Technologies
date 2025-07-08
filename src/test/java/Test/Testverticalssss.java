package Test;

import org.testng.annotations.Test;

import base.basetest;
import pages.verticals;

public class Testverticalssss extends basetest {
	
	@Test
	void verticle () throws InterruptedException {
	verticals v = new verticals(driver);
	v.gotovertical();
	v.gototrading();
	v.firstName("Himanshu");
	v.urmail("himanshu202312@yopmail.com");
	v.yourcompany("inazume");
	v.services();
//	v.gotoretailandecom();
//	v.gotoheatlhcare();
//	v.gotofintech();
//	v.gotocustomapp();
	}
	
	

}

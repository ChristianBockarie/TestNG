package com.Class03;

import org.openqa.selenium.By;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class TaskOne extends CommonMethods {
	@BeforeGroups({"Smoke", "Regression1", "Rgression2"})
	public void setUp() {
		setUpDriver("chrome", "https://www.saucedemo.com/");
	}

	@Test(groups = "Smoke")
	public void userOne() {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
		sendText(driver.findElement(By.cssSelector("input.form_input")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

	@Test(groups = "Regression1")
	public void userTwo() {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "problem_user");
		sendText(driver.findElement(By.cssSelector("input.form_input")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

	@Test(groups = "Regression2")
	public void userThree() {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "performance_glitch_user");
		sendText(driver.findElement(By.cssSelector("input.form_input")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

	@AfterGroups({"Smoke", "Regression1", "Rgression2"})
	public void tearDown() {
		driver.close();
	}
}

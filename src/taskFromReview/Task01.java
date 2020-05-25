package taskFromReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.utils.CommonMethods;

public class Task01 extends CommonMethods {
	/*
	 * go to https://www.saucedemo.com sign in verify the products text appears quit
	 */

	/*
	 * go to https://www.saucedemo.com sign in on the sorting dropdown select Price
	 * (low to high) verify product Sauce Labs One is appears first
	 */

	@BeforeMethod
	public void openBroserAndNavigate() {
		setUp();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		wait(3);
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
	@Test
	public void productTextAppear() {
		
		String expect = "Products";
		WebElement text = driver.findElement(By.xpath("//div[text()='Products']"));
		String actualText = text.getText();
		Assert.assertEquals(actualText, expect);
		wait(3);
	}

	@Test
	public void productSortLowToHigh() {
		
		WebElement dd = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		wait(3);
		selectDdValue(dd, "Price (low to high)");
		wait(3);

	}

}

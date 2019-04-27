package firstmaven;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestMaven {

	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cars.com/");
	}

	@Test
	public void test1() {
<<<<<<< HEAD
=======


>>>>>>> 3fcf6540f4a3d154a7cb817b7f979b9e85f04eef
		Assert.assertTrue(driver.getTitle().contains("New Cars"));
		System.out.println(driver.getTitle());
		WebElement selectAstockType = driver.findElement(By.xpath("//select[@name='stockType']"));
		WebElement selectAmake = driver.findElement(By.xpath("//select[@name='makeId']"));
		WebElement selectAmodel = driver.findElement(By.xpath("//select[@name='modelId']"));
		selectBytext(selectAstockType, "New Cars");
		selectBytext(selectAmake, "Audi");
		selectBytext(selectAmodel, "S5");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = driver.findElement(By.xpath("//input[@class='NZE2g']"));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		String expectedHeader = "New Audi S5 for Sale";
		String actualHeader = driver.findElement(By.xpath("//h1[@class='srp-header']")).getText();
		Assert.assertEquals(expectedHeader, actualHeader);

	

<<<<<<< HEAD
	public static void selectByText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
=======


	}
	
	public static void selectBytext(WebElement element, String visibleText) {
		Select select =  new Select(element);
		select.selectByVisibleText(visibleText);

>>>>>>> 3fcf6540f4a3d154a7cb817b7f979b9e85f04eef
	}

	@After
	public void tearDown() {
<<<<<<< HEAD
//		driver.quit();
=======


		//driver.quit();

>>>>>>> 3fcf6540f4a3d154a7cb817b7f979b9e85f04eef
	}
}

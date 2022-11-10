import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test_swaglabs_Elemants {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\C-ROAD\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.saucedemo.com");
		String user_name = "standard_user";
		String password = "secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		List<WebElement> myListOptions = driver.findElements(By.className("btn"));
		for (int i = 0; i <= myListOptions.size(); i++) {
			myListOptions.get(i).click();

		}

		int expected_value = 6;
		String actual_value = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
		int realActualValue = Integer.parseInt(actual_value);

		Assert.assertEquals(realActualValue, expected_value);

	}

}

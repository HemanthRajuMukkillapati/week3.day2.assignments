package week3.day2.assignments;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		// Driver Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1.get url
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// 2. In the search box, type as "bags" and press enter
		// driver.findElement(By.xpath("//div[@class='modal-content']/div")).click();
		driver.findElement(By.xpath("//div[@class='searchbar-view']//input[@name='searchVal']")).sendKeys("bags",
				Keys.ENTER);

		// 3. To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[@for='Men']")).click();
		Thread.sleep(2000);

		// 4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);

		// 5. Print the count of the items Found.
		List<WebElement> findElements = driver.findElements(By.className("items"));
		System.out.println("No of Items - " + findElements.size());

		// 6. Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> brands = driver.findElements(By.className("brand"));
		System.out.println("Brands availble:----");
		for (WebElement webElement : brands) {
			String text = webElement.getText();
			System.out.println(text);
		}

		// 7. Get the list of names of the bags and print it
		List<WebElement> names = driver.findElements(By.xpath(
				"//div[@class='items']//div[contains(@class,'ReactVirtualized__Grid__innerScrollContainer')]/div/a/div[@class='preview']//div[@class='nameCls']"));
		System.out.println("Names:----");
		for (WebElement webElement : names) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}

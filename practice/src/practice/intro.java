package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\selenium-java\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("ipracticeselj");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("whsOnd")).sendKeys("password");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("img.Hq")).click();
		driver.findElement(By.cssSelector("input.agP")).sendKeys("adithyankumar.92@gmail.com");
		String body;   
		body = "hi System.setProperty(\"Webdriver.chrome.driver\", \"D:\\\\selenium-java\\\\chromedriver\\\\chromedriver.exe\");\r\n"
				+ "		WebDriver driver = new ChromeDriver();\r\n"
				+ "		\r\n"
				+ "		driver.get(\"https://www.google.com/intl/en-GB/gmail/about/\");\r\n"
				+ "		driver.findElement(By.linkText(\"Sign in\")).click();\r\n"
				+ "		driver.manage().window().maximize();\r\n"
				+ "		driver.findElement(By.cssSelector(\"input#identifierId\")).sendKeys(\"ipracticeselj\");\r\n"
				+ "		driver.findElement(By.xpath(\"//span[text()='Next']\")).click();\r\n"
				+ "		Thread.sleep(5000);\r\n"
				+ "		driver.findElement(By.className(\"whsOnd\")).sendKeys(\"seleniumjava\");\r\n"
				+ "		driver.findElement(By.xpath(\"//span[text()='Next']\")).click();\r\n"
				+ "		Thread.sleep(10000);\r\n"
				+ "		driver.findElement(By.xpath(\"//div[@class='T-I T-I-KE L3']\")).click();\r\n"
				+ "		Thread.sleep(5000);\r\n"
				+ "		driver.findElement(By.cssSelector(\"img.Hq\")).click();\r\n"
				+ "		driver.findElement(By.cssSelector(\"input.agP\")).sendKeys(\"adithyankumar.92@gmail.com\");\r\n"
				+ "		String body;   \r\n"
				+ "		body = \r\n"
				+ "				\r\n"
				+ "		\r\n"
				+ "		\r\n,"
				+ "		driver.findElement(By.cssSelector(\"div[id=':9d']\")).sendKeys(body);\r\n"
				+ "		driver.findElement(By.cssSelector(\"div[id=':7u']\")).click();";
				
		
		
		driver.findElement(By.cssSelector("div[id=':9d']")).sendKeys(body);
		driver.findElement(By.cssSelector("div[id=':7u']")).click();

		

	}

}

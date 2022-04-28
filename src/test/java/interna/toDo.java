package interna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toDo {

	String url;
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		url = "https://www.bancointer.com.br/";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
	}

	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.cssSelector("#gatsby-focus-wrapper > div > header > div > div > div.header-items > div > button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.id("nome")).sendKeys(Keys.chord("justino peres"));
		Thread.sleep(3000);
		driver.findElement(By.id("celular")).sendKeys(Keys.chord("88888888888"));
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(Keys.chord("justino@peres.com.br"));
		Thread.sleep(3000);
		driver.findElement(By.id("cpf")).sendKeys(Keys.chord("07592011026"));
		Thread.sleep(3000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dataNascimento")).sendKeys(Keys.chord("30121994"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"body > div.modal-container > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"body > div.modal-container > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > button"))
				.click();
		Thread.sleep(3000);
		String to = driver.findElement(By.cssSelector("body > div.modal-container > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
		System.out.println(to);
		assertEquals("Prontinho! Recebemos os seus dados.",to);
	}

}

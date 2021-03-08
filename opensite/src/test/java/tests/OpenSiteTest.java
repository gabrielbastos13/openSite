package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenSiteTest {
	
	private WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		String url;
		url = "https://gabrielbastos-ecommerce.netlify.app/";
		driver.get(url);
		assertTrue("Titulo da pagina difere do esperado", driver.getTitle().contentEquals("Store Recording"));
		Thread.sleep(5000);
		}

}

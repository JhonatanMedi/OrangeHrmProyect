package OrangeHrm.Steps;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conexion {

	private WebDriver driver;

	@Before
	@Step
	public WebDriver openBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		return this.driver;

	}
	

}

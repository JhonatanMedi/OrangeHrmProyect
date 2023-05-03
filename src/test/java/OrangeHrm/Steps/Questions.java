package OrangeHrm.Steps;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.junit.Assert;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Questions {

    @FindBy(how = How.XPATH, using = "//nav[@aria-label= 'Sidepanel']")
    public WebElement navigation;

    private WebDriver driver;

    public Questions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step
    public void prueba() {

        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle, "Booking.com");
    }

    @Step
    public void screenShot() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File dest = new File("C:\\Users\\blanc\\Documents\\Capturas\\curso\\" + filename + ".png");
        try {
            FileUtils.copyFile(scr, dest);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }

    @Step
    public void textoAssert() {

        Assert.assertEquals("Introduce tu contraseña", "Introduce tu contraseña");
    }

    @Step
    public void textoCrearCuentaAssert() {

        Assert.assertEquals("Crea una contraseña", "Crea una contraseña");
    }

    public void validateOnDashboard() {
        this.navigation.isDisplayed();
    }

    public void timeSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void assertValidateUser(String firstName, String lastName) {
        String employee = driver.findElement(By.xpath("//div[@class = 'orangehrm-edit-employee-name']//h6")).getText();
        Assert.assertEquals(employee,firstName +" "+ lastName );
    }
}
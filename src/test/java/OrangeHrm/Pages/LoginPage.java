package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private ButtonPages buttonPages;
    private Questions questions;
    @FindBy(how = How.XPATH, using = "//input[@placeholder = 'Username']")
    public WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    public void fillOutLogin(String userName, String password) {
        this.txtUser.isDisplayed();
        this.txtUser.sendKeys(userName);
        this.txtPassword.sendKeys(password);
        this.buttonPages.btnLogin();
    }

    public void validateDashboard() {
        this.questions.validateOnDashboard();
        this.questions.screenShot();
    }

}

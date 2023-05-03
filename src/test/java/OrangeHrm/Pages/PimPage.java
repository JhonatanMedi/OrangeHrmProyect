package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;
    private Questions questions;

    @FindBy(how = How.NAME, using = "firstName")
    public WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "lastName")
    public WebElement txtLastName;

    @FindBy(how = How.XPATH, using = "//label[text()='Username']//..//..//div//input")
    public WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//label[text()='Password']//..//..//div//input")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//label[text()='Confirm Password']//..//..//div//input")
    public WebElement txtConfirmPassword;

    public PimPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    public void addEmployee(String firstName, String lastName) {
        this.buttonPages.btnPim();
        this.buttonPages.btnAdd();
        this.txtFirstName.sendKeys(firstName);
        this.txtLastName.sendKeys(lastName);
        this.questions.timeSecond(1);

    }

    public void newUser(String user, String pass, String confirmPass) {
        this.buttonPages.btnRadioButton();
        this.txtUserName.sendKeys(user);
        this.txtPassword.sendKeys(pass);
        this.txtConfirmPassword.sendKeys(confirmPass);
    }

    public void validateUserNew(String firstName, String lastName) {
        this.questions.timeSecond(6);
        this.questions.assertValidateUser(firstName, lastName);
    }
}

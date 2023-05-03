package OrangeHrm.Definitions;

import OrangeHrm.Pages.LeavePage;
import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.PimPage;
import OrangeHrm.Steps.ButtonPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private PimPage pimPage = new PimPage(driver);
    private ButtonPages buttonPages = new ButtonPages(driver);
    private LeavePage leavePage = new LeavePage(driver);

    //prueba git

    @Given("^the user open browser$")
    public void openBroswer() {
        this.conexion = new Conexion();
        this.driver = this.conexion.openBrowser();

    }

    @When("^the user fill out user (.*) password (.*)$")
    public void fillOutLogin(String userName, String password) {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, password);
    }

    @Then("^the user is on the page dashboard$")
    public void validateDashboard() {
        this.loginPage = new LoginPage(driver);
        this.loginPage.validateDashboard();
    }

    @When("^the user fill out new employee first name (.*) last name (.*)$")
    public void addEmployee(String firstName, String lastName) {
        this.pimPage = new PimPage(driver);
        this.pimPage.addEmployee(firstName, lastName);
    }

    @When("^the user create user (.*) password (.*) confirm password (.*)$")
    public void newUser(String user, String pass, String confirmPass) {
        this.pimPage = new PimPage(driver);
        this.pimPage.newUser(user, pass, confirmPass);
        this.buttonPages = new ButtonPages(driver);
        this.buttonPages.btnSave();
    }

    @Then("^the user validate new employee (.*) (.*)$")
    public void validateUserNew(String firstName, String lastName) {
        this.pimPage = new PimPage(driver);
        this.pimPage.validateUserNew(firstName, lastName);
    }

    @When("^the user select from list leave (.*)$")
    public void searchEmployee(String typesLeave) {
        this.leavePage = new LeavePage(driver);
        this.leavePage.searchEmployee(typesLeave);
    }
}
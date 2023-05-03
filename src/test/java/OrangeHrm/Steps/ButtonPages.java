package OrangeHrm.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//li//a//span[text()= 'PIM']")
    public WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
    public WebElement btnAdd;

    @FindBy(how = How.XPATH, using = "//label//input[@type='checkbox']//following::span")
    public WebElement btnRadioButton;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//li//a//span[text()= 'Leave']")
    public WebElement btnLeave;
    public ButtonPages(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void btnLogin(){
        btnLogin.isDisplayed();
        btnLogin.click();
    }

    public void btnPim(){
        this.btnPim.isSelected();
        this.btnPim.click();
    }

    public void btnAdd(){
        this.btnAdd.isSelected();
        this.btnAdd.click();
    }

    public void btnRadioButton(){
        this.btnRadioButton.isDisplayed();
        this.btnRadioButton.click();
    }

    public void btnSave(){
        this.btnSave.isEnabled();
        this.btnSave.click();
    }

    public void btnLeave(){
        this.btnLeave.isSelected();
        this.btnLeave.click();
    }
}

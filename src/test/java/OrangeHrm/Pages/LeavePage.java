package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListPages;
import org.openqa.selenium.WebDriver;

public class LeavePage {

    private ButtonPages buttonPages;
    private ListPages listPages;

    public LeavePage(WebDriver driver) {
        this.buttonPages = new ButtonPages(driver);
        this.listPages = new ListPages(driver);

    }

    public void searchEmployee(String typesLeave) {
        this.buttonPages.btnLeave();
        this.listPages.leaveType(typesLeave);
    }

}

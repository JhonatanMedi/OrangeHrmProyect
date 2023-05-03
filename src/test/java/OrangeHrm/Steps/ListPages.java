package OrangeHrm.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPages {

    private WebDriver driver;

    public ListPages(WebDriver driver) {
        this.driver = driver;
    }

    public void leaveType(String typesLeave){

        WebElement list = driver.findElement(By.xpath("//div[@class = 'oxd-select-wrapper']//div//div[2]"));
        list.click();

        WebElement typeLeave = list.findElement(By.xpath("//*[text()='"+typesLeave+"']"));
        typeLeave.click();
    }
}

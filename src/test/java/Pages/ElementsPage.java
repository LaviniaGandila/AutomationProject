package Pages;

import LoggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTablesField;

    public void navigateToWebTablePage (){
        webTablesField.click();
        LoggerUtility.infoTestCase("The user clicks on windowFiled element");
    }
}

package Pages;

import LoggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{
    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceFormField;

    public void navigateToPracticeFormsPage () {
        elementMethods.clickElement(practiceFormField);
        LoggerUtility.infoTestCase("The user clicks on web table element");
    }

}

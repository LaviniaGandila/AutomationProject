package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{
    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement webForms;

    public void navigateToFormsPage () {
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(webForms);

    }

}

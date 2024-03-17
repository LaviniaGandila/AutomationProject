package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{

    public WebTablePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id="addNewRecordButton")
    private WebElement addButton;

    @FindBy (id ="firstName")
    private WebElement firstNameField;

    @FindBy (id ="lastName")
    private WebElement lastNameField;

    @FindBy (id ="userEmail")
    private WebElement userEmailField;

    @FindBy (id ="age")
    private WebElement ageField;

    @FindBy (id ="salary")
    private WebElement salaryField;

    @FindBy (id ="department")
    private WebElement departmentField;

    @FindBy (id ="submit")
    private WebElement submitButton;

    public void addNewEntry (String firstNameValue, String lastNameValue, String userEmailValue, String ageValue,
                             String salaryValue, String departmentValue) {
        addButton.click();
        elementMethods.fillElement(firstNameField, firstNameValue);
        elementMethods.fillElement(lastNameField, lastNameValue);
        elementMethods.fillElement(userEmailField, userEmailValue);
        elementMethods.fillElement(ageField, ageValue);
        elementMethods.fillElement(salaryField, salaryValue);
        elementMethods.fillElement(departmentField, departmentValue);
        submitButton.click();
    }
}

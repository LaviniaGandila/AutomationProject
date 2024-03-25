package Pages;

import ObjectData.WebTableObject;
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

    @FindBy (id ="edit-record-4")
    private WebElement editButton;

    @FindBy (id="delete-record-4")
    private WebElement deleteButton;

    public void addNewEntry (WebTableObject webTableObject) {
        addButton.click();
        elementMethods.fillElement(firstNameField, webTableObject.getFirstNameValue());
        elementMethods.fillElement(lastNameField, webTableObject.getLastNameValue());
        elementMethods.fillElement(userEmailField, webTableObject.getUserEmailValue());
        elementMethods.fillElement(ageField, webTableObject.getAgeValue());
        elementMethods.fillElement(salaryField, webTableObject.getSalaryValue());
        elementMethods.fillElement(departmentField, webTableObject.getDepartmentValue());
        submitButton.click();
    }

    public void modifyEntry (WebTableObject webTableObject) {
        elementMethods.clickElement(editButton);
        elementMethods.refillElement(firstNameField, webTableObject.getFirstNameValue());
        elementMethods.refillElement(ageField, webTableObject.getAgeValue());
        submitButton.click();
    }

    public void deleteEntry () {
        deleteButton.click();
    }
}

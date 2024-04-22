package Pages;

import LoggerUtility.LoggerUtility;
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
        LoggerUtility.infoTestCase("The user add first name value");
        elementMethods.fillElement(lastNameField, webTableObject.getLastNameValue());
        LoggerUtility.infoTestCase("The user add last name value");
        elementMethods.fillElement(userEmailField, webTableObject.getUserEmailValue());
        LoggerUtility.infoTestCase("The user add email value");
        elementMethods.fillElement(ageField, webTableObject.getAgeValue());
        LoggerUtility.infoTestCase("The user add age value");
        elementMethods.fillElement(salaryField, webTableObject.getSalaryValue());
        LoggerUtility.infoTestCase("The user add salary value");
        elementMethods.fillElement(departmentField, webTableObject.getDepartmentValue());
        LoggerUtility.infoTestCase("The user add department value");
        submitButton.click();
        LoggerUtility.infoTestCase("The user clicks submit button");
    }

    public void modifyEntry (WebTableObject webTableObject) {
        elementMethods.clickElement(editButton);
        LoggerUtility.infoTestCase("The user clicks edit button");
        elementMethods.refillElement(firstNameField, webTableObject.getFirstNameValue());
        LoggerUtility.infoTestCase("The user add first name value");
        elementMethods.refillElement(ageField, webTableObject.getAgeValue());
        LoggerUtility.infoTestCase("The user adds age value");
        submitButton.click();
        LoggerUtility.infoTestCase("The user clicks submit button");
    }

    public void deleteEntry () {
        deleteButton.click();
        LoggerUtility.infoTestCase("The user clicks delete button");
    }
}

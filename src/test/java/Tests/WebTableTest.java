package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePage;
import Pages.WebTablePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTableTest extends SharedData {

    @Test
    public void metodaTest () {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();




        //identificam un element
//        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
//        elementMethods.clickElement(consentField);

//        WebElement elementsField = getWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
//        elementMethods.clickElement(elementsField);

//        WebElement webTablesField = getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
//        elementMethods.clickElement(webTablesField);

        String firstNameValue = "Laura";
        String lastNameValue = "LastName";
        String userEmailValue = "laura@yahoo.com";
        String ageValue = "110";
        String salaryValue = "1100";
        String departmentValue = "Happiness";

        WebTablePage webTablePage = new WebTablePage(getWebDriver());
        webTablePage.addNewEntry(firstNameValue, lastNameValue, userEmailValue, ageValue, salaryValue, departmentValue);

//        WebElement addButton = getWebDriver().findElement(By.id("addNewRecordButton"));
//        elementMethods.clickElement(addButton);
//
//        WebElement firstNameField = getWebDriver().findElement(By.id("firstName"));
//        String firstNameValue = "Laura";
//        elementMethods.fillElement(firstNameField, firstNameValue);
//
//        WebElement lastNameField = getWebDriver().findElement(By.id("lastName"));
//        String lastNameValue = "LastName";
//        elementMethods.fillElement(lastNameField, lastNameValue);
//
//        WebElement userEmailField = getWebDriver().findElement(By.id("userEmail"));
//        String userEmailValue = "laura@yahoo.com";
//        elementMethods.fillElement(userEmailField, userEmailValue);
//
//        WebElement ageField = getWebDriver().findElement(By.id("age"));
//        String ageValue = "110";
//        elementMethods.fillElement(ageField, ageValue);
//
//        WebElement salaryField = getWebDriver().findElement(By.id("salary"));
//        String salaryValue = "1100";
//        elementMethods.fillElement(salaryField, salaryValue);
//
//        WebElement departmentField = getWebDriver().findElement(By.id("department"));
//        String departmentValue = "Happiness";
//        elementMethods.fillElement(departmentField, departmentValue);
//
//        WebElement submitButton = getWebDriver().findElement(By.id("submit"));
//        elementMethods.clickElement(submitButton);


//        //modificam entry-ul inregistrat mai sus
//        WebElement editField = getWebDriver().findElement(By.id("edit-record-4"));
//        elementMethods.clickElement(editField);
//
//        WebElement firstNameModifyField = getWebDriver().findElement(By.id("firstName"));
//        String firstNameModifyValue = "Vlad";
//        elementMethods.refillElement(firstNameModifyField, firstNameModifyValue);
//
//        WebElement userAgeModifyField = getWebDriver().findElement(By.id("age"));
//        String userAgeModifyValue = "29";
//        elementMethods.refillElement(userAgeModifyField, userAgeModifyValue);
//
//        WebElement submitModifyButton = getWebDriver().findElement(By.id("submit"));
//        elementMethods.clickElement(submitModifyButton);
//
//        //stergem entry-ul adaugat
//        WebElement deleteButton = getWebDriver().findElement(By.id("delete-record-4"));
//        elementMethods.clickElement(deleteButton);
//
//
//        //inchidem un browser cu quit()
//        //inchidem un tab dintr-un browser cu close()
    }
}

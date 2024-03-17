package Tests;

import HelperMethods.ElementMethods;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest () {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToFormsPage();




        String firstNameWebFormsValue = "Bogdan";
        String lastNameWebFormsValue = "Vlad";
        String userEmailWebFormsValue = "lavinia@yahoo.com";
        String userMobileValue = "0123456789";
        String dateOfBirthFinal = "17 March,1950";
        String monthValue = "March";
        String yearValue = "1950";
        String dayValue = "17";
        String genderValue = "Female";
        List<String> hobbies = Arrays.asList("Sports", "Music");
        String subjectValue = "Economics";
        String filePath = "src/test/resources/2024-01-29_18h28_37.png";
        String currentAddressValue = "Timisoara";
        String stateValue = "NCR";
        String cityValue = "Delhi";



        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());
        practiceFormPage.fillFirstName(firstNameWebFormsValue);
        practiceFormPage.fillLastName(lastNameWebFormsValue);
        practiceFormPage.fillEmailValue(userEmailWebFormsValue);
        practiceFormPage.fillMobileValue(userMobileValue);
        practiceFormPage.pickBirthDayDate(monthValue, yearValue,dayValue);
        practiceFormPage.pickGender(genderValue);
        practiceFormPage.pickHobbies(hobbies);
        practiceFormPage.pickSubjects(subjectValue);
        practiceFormPage.uploadPicture(filePath);
        practiceFormPage.pickAdress(currentAddressValue);
        practiceFormPage.pickState(stateValue);
        practiceFormPage.pickCity(cityValue);
        practiceFormPage.clickSubmit();
        practiceFormPage.validatePracticeFormTable (firstNameWebFormsValue, lastNameWebFormsValue, userEmailWebFormsValue,
                genderValue, userMobileValue, dateOfBirthFinal, subjectValue, hobbies, filePath, currentAddressValue, stateValue,
                cityValue);





//
//
//
//
//        //facem un algoritm care sa imi selecteze valorile ce ma intereseaza
//        List<String> Hobbies = Arrays.asList("Sports", "Music");
//        List<WebElement> HobbiesList = getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
//        for(Integer index = 0; index<HobbiesList.size(); index++) {
//            String CurrentElementText = HobbiesList.get(index).getText();
//            if (Hobbies.contains(CurrentElementText)) {
//                HobbiesList.get(index).click();
//            }
//        }
//
//        String SubjectValue = "Economics";
//        WebElement subjectsField = getWebDriver().findElement(By.id("subjectsInput"));
//        elementMethods.fillPressElement(subjectsField, SubjectValue, Keys.ENTER);
//
//
//        WebElement pictureField = getWebDriver().findElement(By.id("uploadPicture"));
//        String FilePath = "src/test/resources/2024-01-29_18h28_37.png";
//        elementMethods.fillElement(pictureField, new File(FilePath).getAbsolutePath());
//
//        WebElement currentAddressField = getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
//        String currentAddressValue = "Timisoara";
//        elementMethods.fillElement(currentAddressField, currentAddressValue);
//
//        elementMethods.scrollElementByPixel(0, 350);
//        WebElement stateField = getWebDriver().findElement(By.xpath("//div[text()='Select State']"));
//
//        String StateValue = "NCR";
//        WebElement stateInput = getWebDriver().findElement(By.id("react-select-3-input"));
//        elementMethods.fillPressElement(stateInput, StateValue, Keys.ENTER);
//
//        WebElement selectCity = getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
//        String CityValue = "Delhi";
//        WebElement cityInput = getWebDriver().findElement(By.id("react-select-4-input"));
//        elementMethods.fillPressElement(cityInput, CityValue, Keys.ENTER);
//
//        WebElement submitButton2 = getWebDriver().findElement(By.id("submit"));
//        elementMethods.clickElemForce(submitButton2);
//
//
//        //validam tabelul cu valori
//        List<WebElement> LabelFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
//        List<WebElement> ValueFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));
//
//        Assert.assertEquals(LabelFields.get(0).getText(), "Student Name");
//        Assert.assertEquals(ValueFields.get(0).getText(), firstNameWebFormsValue + " " + lastNameWebFormsValue);
//
//        Assert.assertEquals(LabelFields.get(1).getText(), "Student Email");
//        Assert.assertEquals(ValueFields.get(1).getText(), userEmailWebFormsValue);
//
//        Assert.assertEquals(LabelFields.get(2).getText(), "Gender");
//        Assert.assertEquals(ValueFields.get(2).getText(), genderValue);
//
//        Assert.assertEquals(LabelFields.get(3).getText(), "Mobile");
//        Assert.assertEquals(ValueFields.get(3).getText(), userMobileValue);
//
//        Assert.assertEquals(LabelFields.get(4).getText(), "Date of Birth");
//        Assert.assertEquals(ValueFields.get(4).getText(), dateOfBirthFinal);
//
//        Assert.assertEquals(LabelFields.get(5).getText(), "Subjects");
//        Assert.assertEquals(ValueFields.get(5).getText(), SubjectValue);
//
//        Assert.assertEquals(LabelFields.get(6).getText(), "Hobbies");
//        for (Integer index = 0; index<Hobbies.size(); index++) {
//            Assert.assertTrue(ValueFields.get(6).getText().contains(Hobbies.get(index)));
//        }
//
//        Assert.assertEquals(LabelFields.get(7).getText(), "Picture");
//        String[] ArrayFile = FilePath.split("/");
//        Integer DesiredIndex = ArrayFile.length-1;
//        Assert.assertEquals(ValueFields.get(7).getText(), ArrayFile[DesiredIndex]);
//
//
//        Assert.assertEquals(LabelFields.get(8).getText(), "Address");
//        Assert.assertEquals(ValueFields.get(8).getText(), currentAddressValue);
//
//        Assert.assertEquals(LabelFields.get(9).getText(), "State and City");
//        Assert.assertEquals(ValueFields.get(9).getText(), StateValue + " " + CityValue);
//
////
////        WebElement closeButton = webDriver.findElement(By.id("closeLargeModal"));
////        js.executeScript("arguments[0].click();", closeButton);

    }
}

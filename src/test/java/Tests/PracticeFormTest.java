package Tests;

import ObjectData.PracticeFormObject;
import ObjectData.WebTableObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest () {

        PropertyUtility propertyUtility = new PropertyUtility("PracticeFormData");
        PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeFormsPage();

        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());


        //fill entire form
        practiceFormPage.fillEntireForm(practiceFormObject);


        //assert validari
        practiceFormPage.validatePracticeFormTable(practiceFormObject);

    }
}

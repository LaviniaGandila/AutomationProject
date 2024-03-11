package Tests;

import HelperMethods.ElementMethods;
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
        //facem un scrol pe pagina
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0, 450);

        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement formsField = getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        elementMethods.clickElement(formsField);

        elementMethods.scrollElementByPixel(0, 450);
        WebElement webForms = getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickElement(webForms);

        WebElement firstNameWebFormsField = getWebDriver().findElement(By.id("firstName"));
        String firstNameWebFormsValue = "Bogdan";
        elementMethods.fillElement(firstNameWebFormsField, firstNameWebFormsValue);

        //The RELATIVE XPATH - It starts with a double forward-slash (//). e cel mai bine de folosit. cel ABSOLUT identifica
            //elementul pornind de la root element, deci orice modificare in pagina il va face inutilizabil.
        //la css tag - atribut - valoare
        //ca sa transformi din css in xpath trebuie sa pui doua backslash-uri in fatza. si apoi la atribut pui un @in fatza.
        //diferenta intre css si xpath - structura - css e mai simplu
                                    //viteza - css e mai rapid
                                    //mentenanta - css e mai usor de intretinut
                                    //xpath merge de jos in sus sau de sus in jos, dar css merge doar de sus in jos
                                    //textul functioneaza doar pe xpath, pe css nu functioneaza, css nu stie sa gaseasca acele elemente



        WebElement lastNameWebFormsField = getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameWebFormsValue = "Vlad";
        elementMethods.fillElement(lastNameWebFormsField, lastNameWebFormsValue);

        WebElement userEmailWebFormsField = getWebDriver().findElement(By.id("userEmail"));
        String userEmailWebFormsValue = "lavinia@yahoo.com";
        elementMethods.fillElement(userEmailWebFormsField, userEmailWebFormsValue);

        String genderValue = "Female";
        WebElement genderFormsField = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-2']"));
        elementMethods.clickElement(genderFormsField);

        WebElement userMobileField = getWebDriver().findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String userMobileValue = "0123456789";
        elementMethods.fillElement(userMobileField, userMobileValue);


        //date of birth
        String dateOfBirthFinal = "17 March,1950";
        WebElement dateOfBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        elementMethods.clickElement(dateOfBirth);

        WebElement monthOfBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
        String monthValue = "March";
        elementMethods.selectTextElement(monthOfBirth, monthValue);

        WebElement yearOfBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
        String yearValue = "1950";
        elementMethods.selectValueElement(yearOfBirth, yearValue);


        List<WebElement> dayOfBirthField = getWebDriver().findElements(By.xpath("//div[not (contains (@class,'react-datepicker__day--outside-month')) and contains(@class,'react-datepicker__day react-datepicker__day')]"));
        String dayValue = "17";
        for (Integer i=0; i<dayOfBirthField.size(); i++){
               if(dayOfBirthField.get(i).getText().equals(dayValue)){
                   dayOfBirthField.get(i).click();
                    break;
               }
        }

        //WebElement userHobby = webDriver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        //userHobby.click();

        //facem un algoritm care sa imi selecteze valorile ce ma intereseaza
        List<String> Hobbies = Arrays.asList("Sports", "Music");
        List<WebElement> HobbiesList = getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
        for(Integer index = 0; index<HobbiesList.size(); index++) {
            String CurrentElementText = HobbiesList.get(index).getText();
            if (Hobbies.contains(CurrentElementText)) {
                HobbiesList.get(index).click();
            }
        }

        String SubjectValue = "Economics";
        WebElement subjectsField = getWebDriver().findElement(By.id("subjectsInput"));
        elementMethods.fillPressElement(subjectsField, SubjectValue, Keys.ENTER);


        WebElement pictureField = getWebDriver().findElement(By.id("uploadPicture"));
        String FilePath = "src/test/resources/2024-01-29_18h28_37.png";
        elementMethods.fillElement(pictureField, new File(FilePath).getAbsolutePath());

        WebElement currentAddressField = getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String currentAddressValue = "Timisoara";
        elementMethods.fillElement(currentAddressField, currentAddressValue);

        elementMethods.scrollElementByPixel(0, 350);
        WebElement stateField = getWebDriver().findElement(By.xpath("//div[text()='Select State']"));

        String StateValue = "NCR";
        WebElement stateInput = getWebDriver().findElement(By.id("react-select-3-input"));
        elementMethods.fillPressElement(stateInput, StateValue, Keys.ENTER);

        WebElement selectCity = getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
        String CityValue = "Delhi";
        WebElement cityInput = getWebDriver().findElement(By.id("react-select-4-input"));
        elementMethods.fillPressElement(cityInput, CityValue, Keys.ENTER);

        WebElement submitButton2 = getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElemForce(submitButton2);


        //validam tabelul cu valori
        List<WebElement> LabelFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> ValueFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        Assert.assertEquals(LabelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(ValueFields.get(0).getText(), firstNameWebFormsValue + " " + lastNameWebFormsValue);

        Assert.assertEquals(LabelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(ValueFields.get(1).getText(), userEmailWebFormsValue);

        Assert.assertEquals(LabelFields.get(2).getText(), "Gender");
        Assert.assertEquals(ValueFields.get(2).getText(), genderValue);

        Assert.assertEquals(LabelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(ValueFields.get(3).getText(), userMobileValue);

        Assert.assertEquals(LabelFields.get(4).getText(), "Date of Birth");
        Assert.assertEquals(ValueFields.get(4).getText(), dateOfBirthFinal);

        Assert.assertEquals(LabelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(ValueFields.get(5).getText(), SubjectValue);

        Assert.assertEquals(LabelFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index<Hobbies.size(); index++) {
            Assert.assertTrue(ValueFields.get(6).getText().contains(Hobbies.get(index)));
        }

        Assert.assertEquals(LabelFields.get(7).getText(), "Picture");
        String[] ArrayFile = FilePath.split("/");
        Integer DesiredIndex = ArrayFile.length-1;
        Assert.assertEquals(ValueFields.get(7).getText(), ArrayFile[DesiredIndex]);


        Assert.assertEquals(LabelFields.get(8).getText(), "Address");
        Assert.assertEquals(ValueFields.get(8).getText(), currentAddressValue);

        Assert.assertEquals(LabelFields.get(9).getText(), "State and City");
        Assert.assertEquals(ValueFields.get(9).getText(), StateValue + " " + CityValue);

//
//        WebElement closeButton = webDriver.findElement(By.id("closeLargeModal"));
//        js.executeScript("arguments[0].click();", closeButton);

    }
}

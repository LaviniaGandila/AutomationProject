package Pages;

import LoggerUtility.LoggerUtility;
import ObjectData.PracticeFormObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import java.io.File;
import java.util.List;



public class PracticeFormPage extends BasePage{
    public PracticeFormPage (WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "firstName")
    private WebElement firstNameWebFormsField;

    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameWebFormsField;

    @FindBy(id = "userEmail")
    private WebElement userEmailWebFormsField;


    @FindBy(css = "label[for='gender-radio-2']")
    private WebElement genderField;

    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement userMobileField;

    @FindBy(css = ".react-datepicker__input-container")
    private WebElement dateOfBirth;

    @FindBy(css = ".react-datepicker__month-select")
    private WebElement monthOfBirth;

    @FindBy(css = ".react-datepicker__year-select")
    private WebElement yearOfBirth;

    @FindBy(xpath = "//div[not (contains (@class,'react-datepicker__day--outside-month')) and contains(@class,'react-datepicker__day react-datepicker__day')]")
    private List<WebElement> dayOfBirth;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private List<WebElement> HobbiesList;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsField;

    @FindBy(id = "uploadPicture")
    private WebElement pictureField;

    @FindBy(css = "textarea[placeholder='Current Address']")
    private WebElement currentAddressField;

    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement selectState;

    @FindBy(id = "react-select-3-input")
    private WebElement stateInput;

    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement selectCity;

    @FindBy(id = "react-select-4-input")
    private WebElement cityInput;

    @FindBy(id = "submit")
    private WebElement submitButton2;

    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private List<WebElement> rowsLabel;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> rowsValue;





    public void fillFirstName (String firstNameWebFormsValue) {
        elementMethods.fillElement(firstNameWebFormsField, firstNameWebFormsValue);
        LoggerUtility.infoTestCase("The user filled first name field");
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtility.infoTestCase("The user scrolls down");
}

    public void fillLastName (String lastNameWebFormsValue) {
        elementMethods.fillElement(lastNameWebFormsField, lastNameWebFormsValue);
        LoggerUtility.infoTestCase("The user filled last name field");
    }

    public void fillEmail(String userEmailWebFormsValue) {
       elementMethods.fillElement(userEmailWebFormsField, userEmailWebFormsValue);
        LoggerUtility.infoTestCase("The user filled email field");
    }

    public void pickGender (String genderValue){
        elementMethods.clickElement(genderField);
        LoggerUtility.infoTestCase("The user selects the gender");
    }

    public void fillMobile(String userMobileValue) {
        elementMethods.fillElement(userMobileField, userMobileValue);
        LoggerUtility.infoTestCase("The user filled mobile number field");
    }

    public void pickBirthDayDate (String dayValue, String monthValue, String yearValue) {
        elementMethods.scrollElementByPixel(0,250);
        LoggerUtility.infoTestCase("The user scrolls down");
        elementMethods.clickElement(dateOfBirth);
        LoggerUtility.infoTestCase("The user clicks on date picker");
        elementMethods.selectTextElement(monthOfBirth, monthValue);
        LoggerUtility.infoTestCase("The user selects month");
        elementMethods.selectTextElement(yearOfBirth, yearValue);
        LoggerUtility.infoTestCase("The user selects year");

        for (Integer i = 0; i < dayOfBirth.size(); i++) {
            if (dayOfBirth.get(i).getText().equals(dayValue)) {
                dayOfBirth.get(i).click();
                break;
            }
        }
    }


    public void pickHobbies (List<String> hobbies) {
        for(Integer index = 0; index<HobbiesList.size(); index++) {
            String CurrentElementText = HobbiesList.get(index).getText();
            if (hobbies.contains(CurrentElementText)) {
                elementMethods.clickElemForce(HobbiesList.get(index));
            }
        }
        LoggerUtility.infoTestCase("The user selects hobbies");
    }

    public void pickSubjects (String subjectsValue) {
        elementMethods.fillPressElement(subjectsField, subjectsValue, Keys.ENTER);
        LoggerUtility.infoTestCase("The user selects subject");
    }

    public void uploadPicture (String filePath) {
        elementMethods.fillElement(pictureField, new File(filePath).getAbsolutePath());
        LoggerUtility.infoTestCase("The user uploads picture");
    }

    public void fillAdress(String currentAddressValue) {
        elementMethods.fillElement(currentAddressField, currentAddressValue);
        LoggerUtility.infoTestCase("The user filled current address");
    }

    public void pickState (String stateValue) {
        elementMethods.clickElemForce(selectState);
        elementMethods.fillPressElement(stateInput, stateValue, Keys.ENTER);
        LoggerUtility.infoTestCase("The user selects state");
  }

    public void pickCity (String cityValue) {
        elementMethods.fillPressElement(cityInput, cityValue, Keys.ENTER);
        LoggerUtility.infoTestCase("The user selects city");
    }

    public void clickSubmit () {
        elementMethods.clickElemForce(submitButton2);
        LoggerUtility.infoTestCase("The user clicks submit button");
    }


    public void fillEntireForm(PracticeFormObject practiceFormObject) {
        fillFirstName(practiceFormObject.getFirstNameValue());
        fillLastName(practiceFormObject.getLastNameValue());
        fillEmail(practiceFormObject.getUserEmailValue());
        pickGender(practiceFormObject.getGenderValue());
        fillMobile(practiceFormObject.getUserMobileValue());
        pickBirthDayDate(practiceFormObject.getDobDayValue(), practiceFormObject.getDobMonthValue(),
                practiceFormObject.getDobYearValue());
        pickHobbies(practiceFormObject.getHobbies());
        uploadPicture(practiceFormObject.getFilePath());
        fillAdress(practiceFormObject.getCurrentAddressValue());
        pickSubjects(practiceFormObject.getSubjectValue());
        pickState(practiceFormObject.getStateValue());
        pickCity(practiceFormObject.getCityValue());
        clickSubmit();
    }

    public void validatePracticeFormTable (PracticeFormObject practiceFormObject) {


        Assert.assertEquals(rowsLabel.get(0).getText(), "Student Name");
        Assert.assertEquals(rowsValue.get(0).getText(), practiceFormObject.getFirstNameValue() + " " + practiceFormObject.getLastNameValue());
        LoggerUtility.infoTestCase("The user validates the first name and last name values");

        Assert.assertEquals(rowsLabel.get(1).getText(), "Student Email");
        Assert.assertEquals(rowsValue.get(1).getText(), practiceFormObject.getUserEmailValue());
        LoggerUtility.infoTestCase("The user validates the email value");

        Assert.assertEquals(rowsLabel.get(2).getText(), "Gender");
        Assert.assertEquals(rowsValue.get(2).getText(), practiceFormObject.getGenderValue());
        LoggerUtility.infoTestCase("The user validates the gender value");

        Assert.assertEquals(rowsLabel.get(3).getText(), "Mobile");
        Assert.assertEquals(rowsValue.get(3).getText(), practiceFormObject.getUserMobileValue());
        LoggerUtility.infoTestCase("The user validates the mobile value");

        Assert.assertEquals(rowsLabel.get(5).getText(), "Subjects");
        Assert.assertEquals(rowsValue.get(5).getText(), practiceFormObject.getSubjectValue());
        LoggerUtility.infoTestCase("The user validates the subject value");

        Assert.assertEquals(rowsLabel.get(6).getText(), "Hobbies");
        for (Integer index = 0; index < practiceFormObject.getHobbies().size(); index++) {
            Assert.assertTrue(rowsValue.get(6).getText().contains(practiceFormObject.getHobbies().get(0)));
            LoggerUtility.infoTestCase("The user validates the hobbies value");
        }

        Assert.assertEquals(rowsLabel.get(7).getText(), "Picture");
        String[] arrayFile = practiceFormObject.getFilePath().split("/");
        Integer desireIndex = arrayFile.length -1;
        Assert.assertEquals(rowsValue.get(7).getText(), arrayFile[desireIndex]);
        LoggerUtility.infoTestCase("The user validates the picture value");

        Assert.assertEquals(rowsLabel.get(8).getText(), "Address");
        Assert.assertEquals(rowsValue.get(8).getText(), practiceFormObject.getCurrentAddressValue());
        LoggerUtility.infoTestCase("The user validates the address value");

        Assert.assertEquals(rowsLabel.get(9).getText(), "State and City");
        Assert.assertEquals(rowsValue.get(9).getText(), practiceFormObject.getStateValue() + " " + practiceFormObject.getCityValue());
        LoggerUtility.infoTestCase("The user validates the state and city values");

        /*elementMethods.validateExpectedElement(rowsLabel.get(0), "Student Name");
        elementMethods.validateExpectedElement(rowsValue.get(0), practiceFormObject.getFirstNameValue() + " "
                + practiceFormObject.getLastNameValue());

        //1 validate student email
        elementMethods.validateExpectedElement(rowsLabel.get(1), "Student Email");
        elementMethods.validateExpectedElement(rowsValue.get(1), practiceFormObject.getUserEmailValue());

        //2 validate gender
        elementMethods.validateExpectedElement(rowsLabel.get(2), "Gender");
        elementMethods.validateExpectedElement(rowsValue.get(2), practiceFormObject.getGenderValue());

        //3 validate mobile
        elementMethods.validateExpectedElement(rowsLabel.get(3), "Mobile");
        elementMethods.validateExpectedElement(rowsValue.get(3), practiceFormObject.getUserMobileValue());

        //4 validate date of birth
        String dobDayValueFormatted;
        if (Integer.parseInt(practiceFormObject.getDobDayValue()) >= 1 && Integer.parseInt(practiceFormObject.getDobDayValue()) <= 9) {
            dobDayValueFormatted = "0" + practiceFormObject.getDobDayValue();
        } else {
            dobDayValueFormatted = practiceFormObject.getDobDayValue();
        }
        elementMethods.validateExpectedElement(rowsLabel.get(4), "Date of Birth");
        elementMethods.validateExpectedElement(rowsValue.get(4), dobDayValueFormatted + " " + practiceFormObject.getDobMonthValue() + ","
                + practiceFormObject.getDobYearValue());

        //5 validate subjects
        elementMethods.validateExpectedElement(rowsLabel.get(5), "Subjects");
        elementMethods.validateExpectedElement(rowsValue.get(5), practiceFormObject.getSubjectValue());

        //6 validate hobbies
        elementMethods.validateExpectedElement(rowsLabel.get(6), "Hobbies");
        for (String hobby : practiceFormObject.getHobbies()) {
            elementMethods.validateElementTextSpecial(rowsValue.get(6),hobby);
        }

        //7 validate picture
        elementMethods.validateExpectedElement(rowsLabel.get(7), "Picture");
        String[] arrayFileName = practiceFormObject.getFilePath().split("/");
        Integer desireIndex = arrayFileName.length - 1;
        elementMethods.validateExpectedElement(rowsValue.get(7),arrayFileName[desireIndex]);

        //8 validate address
        elementMethods.validateExpectedElement(rowsLabel.get(8), "Address");
        elementMethods.validateExpectedElement(rowsValue.get(8), practiceFormObject.getCurrentAddressValue());

        //9 validate state and city
        elementMethods.validateExpectedElement(rowsLabel.get(9), "State and City");
        elementMethods.validateExpectedElement(rowsValue.get(9), practiceFormObject.getStateValue() + " " + practiceFormObject.getCityValue());
    */
    }
}

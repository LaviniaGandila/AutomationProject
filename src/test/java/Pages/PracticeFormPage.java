package Pages;

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
    private List<WebElement> dayOfBirthField;

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
    private List<WebElement> labelFields;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> labelValues;





    public void fillFirstName (String firstNameWebFormsValue) {
        elementMethods.fillElement(firstNameWebFormsField, firstNameWebFormsValue);
        elementMethods.scrollElementByPixel(0, 450);
}

    public void fillLastName (String lastNameWebFormsValue) {
        elementMethods.fillElement(lastNameWebFormsField, lastNameWebFormsValue);
    }

    public void fillEmailValue (String userEmailWebFormsValue) {
       elementMethods.fillElement(userEmailWebFormsField, userEmailWebFormsValue);
    }

    public void pickGender (String genderValue){
        elementMethods.clickElement(genderField);
    }

    public void fillMobileValue (String userMobileValue) {
        elementMethods.fillElement(userMobileField, userMobileValue);
    }

    public void pickBirthDayDate (String monthValue, String yearValue, String dayValue) {
        elementMethods.clickElement(dateOfBirth);
        elementMethods.selectTextElement(monthOfBirth, monthValue);
        elementMethods.selectValueElement(yearOfBirth, yearValue);

        for (Integer i = 0; i < dayOfBirthField.size(); i++) {
            if (dayOfBirthField.get(i).getText().equals(dayValue)) {
                dayOfBirthField.get(i).click();
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
    }

    public void pickSubjects (String subjectsValue) {
        elementMethods.fillPressElement(subjectsField, subjectsValue, Keys.ENTER);
    }

    public void uploadPicture (String filePath) {
        elementMethods.fillElement(pictureField, new File(filePath).getAbsolutePath());
    }

    public void pickAdress (String currentAddressValue) {
        elementMethods.fillElement(currentAddressField, currentAddressValue);
    }

 public void pickState (String stateValue) {
     elementMethods.clickElemForce(selectState);
     elementMethods.fillPressElement(stateInput, stateValue, Keys.ENTER);
  }

    public void pickCity (String cityValue) {
        elementMethods.fillPressElement(cityInput, cityValue, Keys.ENTER);
    }

    public void clickSubmit () {
        elementMethods.clickElemForce(submitButton2);
    }


    public void validatePracticeFormTable (String firstNameWebFormsValue, String lastNameWebFormsValue, String userEmailWebFormsValue, String genderValue,
                                          String userMobileValue, String dateOfBirthFinal, String SubjectValue,
                                           List<String> hobbies, String filePath, String currentAddressValue, String StateValue, String CityValue) {

        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(labelValues.get(0).getText(), firstNameWebFormsValue + " " + lastNameWebFormsValue);

        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(labelValues.get(1).getText(), userEmailWebFormsValue);

        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        Assert.assertEquals(labelValues.get(2).getText(), genderValue);

        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(labelValues.get(3).getText(), userMobileValue);

        Assert.assertEquals(labelFields.get(4).getText(), "Date of Birth");
        Assert.assertEquals(labelValues.get(4).getText(), dateOfBirthFinal);

        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(labelValues.get(5).getText(), SubjectValue);

        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index<hobbies.size(); index++) {
            Assert.assertTrue(labelValues.get(6).getText().contains(hobbies.get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] ArrayFile = filePath.split("/");
        Integer DesiredIndex = ArrayFile.length-1;
        Assert.assertEquals(labelValues.get(7).getText(), ArrayFile[DesiredIndex]);


        Assert.assertEquals(labelFields.get(8).getText(), "Address");
        Assert.assertEquals(labelValues.get(8).getText(), currentAddressValue);

        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
        Assert.assertEquals(labelValues.get(9).getText(), StateValue + " " + CityValue);


//        WebElement closeButton = webDriver.findElement(By.id("closeLargeModal"));
//        js.executeScript("arguments[0].click();", closeButton);
    }
}

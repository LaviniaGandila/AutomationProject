package ObjectData;

import java.util.List;
import java.util.Map;

public class PracticeFormObject extends GeneralObject{
    private String firstNameValue;
    private String lastNameValue;
    private String userEmailValue;
    private String genderValue;
    private String userMobileValue;
    private String dobDayValue;
    private String dobMonthValue;
    private String dobYearValue;
    private String SubjectValue;
    private List<String> hobbies;
    private String filePath;
    private String currentAddressValue;
    private String StateValue;
    private String CityValue;

    public PracticeFormObject (Map<String,String> testData) {
        prepareObject(testData);
    }

    private void prepareObject (Map<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "firstNameWebFormsValue":
                    setFirstNameValue(testData.get(key));
                    break;

                case "lastNameWebFormsValue":
                    setLastNameValue(testData.get(key));
                    break;

                case "userEmailWebFormsValue":
                    setUserEmailValue(testData.get(key));
                    break;

                case "userMobileValue":
                    setUserMobileValue(testData.get(key));
                    break;

                case "dobDayValue":
                    setDobDayValue(testData.get(key));
                    break;

                case "dobMonthValue":
                    setDobMonthValue(testData.get(key));
                    break;

                case "dobYearValue":
                    setDobYearValue(testData.get(key));
                    break;

                case "genderValue":
                    setGenderValue(testData.get(key));
                    break;

                case "hobbies":
                    hobbies=getPreparedValue(testData.get(key));
                    break;

                case "subjectValue":
                    setSubjectValue(testData.get(key));
                    break;

                case "filePath":
                    setFilePath(testData.get(key));
                    break;

                case "currentAddressValue":
                    setCurrentAddressValue(testData.get(key));
                    break;


                case "stateValue":
                    setStateValue(testData.get(key));
                    break;

                case "cityValue":
                    setCityValue(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public String getUserEmailValue() {
        return userEmailValue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public String getUserMobileValue() {
        return userMobileValue;
    }

    public String getDobDayValue() {
        return dobDayValue;
    }

    public String getDobMonthValue() {
        return dobMonthValue;
    }

    public String getDobYearValue() {
        return dobYearValue;
    }

    public String getSubjectValue() {
        return SubjectValue;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getCurrentAddressValue() {
        return currentAddressValue;
    }

    public String getStateValue() {
        return StateValue;
    }

    public String getCityValue() {
        return CityValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public void setUserEmailValue(String userEmailValue) {
        this.userEmailValue = userEmailValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public void setUserMobileValue(String userMobileValue) {
        this.userMobileValue = userMobileValue;
    }

    public void setDobDayValue(String dobDayValue) {
        this.dobDayValue = dobDayValue;
    }

    public void setDobMonthValue(String dobMonthValue) {
        this.dobMonthValue = dobMonthValue;
    }

    public void setDobYearValue(String dobYearValue) {
        this.dobYearValue = dobYearValue;
    }

    public void setSubjectValue(String subjectValue) {
        SubjectValue = subjectValue;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setCurrentAddressValue(String currentAddressValue) {
        this.currentAddressValue = currentAddressValue;
    }

    public void setStateValue(String stateValue) {
        StateValue = stateValue;
    }

    public void setCityValue(String cityValue) {
        CityValue = cityValue;
    }
}
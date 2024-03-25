package ObjectData;

import java.util.Map;

public class WebTableObject {
    private String firstNameValue;
    private String lastNameValue;
    private String userEmailValue;
    private String ageValue;
    private String salaryValue;
    private String departmentValue;

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public String getUserEmailValue() {
        return userEmailValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public String getDepartmentValue() {
        return departmentValue;
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

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public void setDepartmentValue(String departmentValue) {
        this.departmentValue = departmentValue;
    }


    //facem o metoda care sa mapeze datele din fisierul de resursa cu reprezentarea acestui obiect
    public WebTableObject (Map<String,String> testData) {
        prepareObject(testData);
    }

    private void prepareObject (Map<String, String> testData) {
        for (String key: testData.keySet()){
            switch (key) {
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;

                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;

                case "userEmailValue":
                    setUserEmailValue(testData.get(key));
                    break;

                case "ageValue":
                    setAgeValue(testData.get(key));
                    break;

                case "salaryValue":
                    setSalaryValue(testData.get(key));
                    break;

                case "departmentValue":
                    setDepartmentValue(testData.get(key));
                    break;

//                case "firstNameModifyValue":
//                    setFirstNameModifyValue(testData.get(key));
//                    break;
//
//                case "userAgeModifyValue":
//                    setUserAgeModifyValue(testData.get(key));
//                    break;
            }
        }
    }
}

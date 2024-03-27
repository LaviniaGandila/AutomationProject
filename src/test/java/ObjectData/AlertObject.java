package ObjectData;

import java.util.Map;

public class AlertObject extends GeneralObject{
    private String inputAlert;

    public AlertObject (Map<String,String> testData){
        prepareObject(testData);

    }

    private void prepareObject (Map<String,String> testData){
        for (String key: testData.keySet()){
            switch (key) {
                case "inputAlert":
                    setInputAlert(testData.get(key));
                    break;
            }
        }
    }

    public String getInputAlert() {
        return inputAlert;
    }

    public void setInputAlert(String inputAlert) {
        this.inputAlert = inputAlert;
    }

}

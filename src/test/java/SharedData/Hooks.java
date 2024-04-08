package SharedData;

import SharedData.Hooks;
import LoggerUtility.LoggerUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData {
    private String testName;

    @BeforeMethod
    public void prepareEnvironment () {
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName);
        prepareDriver();
        LoggerUtility.infoTestCase("The driver is opened with succes");
    }

    @AfterMethod
    public void clearEnvironment () {
        clearDriver();
        LoggerUtility.infoTestCase("The driver is closed with succes");
        LoggerUtility.finishTestCase(testName);
    }
}

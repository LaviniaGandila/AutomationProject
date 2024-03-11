package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import HelperMethods.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class FrameTest extends SharedData {

    @Test
    public void windowMethod () {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        FrameMethods frameMethods = new FrameMethods(getWebDriver());
        WindowMethods windowMethods = new WindowMethods(getWebDriver());

        //facem un scrol pe pagina
        elementMethods.scrollElementByPixel(0, 450);


        //identificam un element
        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement alertFrameWindowsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(alertFrameWindowsField);

        elementMethods.scrollElementByPixel(0, 450);
        WebElement frames = getWebDriver().findElement(By.xpath("//span[text()='Frames']"));
        elementMethods.clickElement(frames);


        //interactionam cu un iframe
        frameMethods.switchSpecificIframe("frame1");
        WebElement frame1Element = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame1Element);

        //specificam sa revina la frame-ul curent
        frameMethods.switchToParentFrame();

        frameMethods.switchSpecificIframe("frame2");
        WebElement frame2Element = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame2Element);

        windowMethods.closeCurrentWindow();
    }
}

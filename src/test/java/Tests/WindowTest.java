
//asta inca nu l-am facut
package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {

    @Test
    public void windowMethod (){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        WindowMethods windowMethods = new WindowMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0,450);

        //identificam un element
        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement alertFrameWindowsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(alertFrameWindowsField);

        elementMethods.scrollElementByPixel(0,450);
        WebElement browserWindow = getWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
        elementMethods.clickElement(browserWindow);

        WebElement newTabButton = getWebDriver().findElement(By.id("tabButton"));
        elementMethods.clickElement(newTabButton);


        //trebuie sa identificam numarul de taburi deschise
        windowMethods.switchToSpecificTabWindow(1);

        //ca sa inchidem tabul curent = close
        //inchidem browserul = quit
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificTabWindow(0);

        WebElement newWindowButton = getWebDriver().findElement(By.id("windowButton"));
        elementMethods.clickElement(newWindowButton);
        windowMethods.switchToSpecificTabWindow(1);

        //ca sa inchidem tabul curent = close
        //inchidem browserul = quit
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificTabWindow(0);


    }
}

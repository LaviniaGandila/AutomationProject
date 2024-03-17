package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import HelperMethods.WindowMethods;
import Pages.AlertWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
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

        AlertWindowFramePage alertWindowFramePage= new AlertWindowFramePage(getWebDriver());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        FramePage framePage = new FramePage(getWebDriver());
        framePage.dealWithIframe();

    }
}

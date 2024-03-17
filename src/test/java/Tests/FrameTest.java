package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import HelperMethods.WindowMethods;
import Pages.AlertWindowFramePage;
import Pages.FramePage;
import SharedData.SharedData;
import org.testng.annotations.Test;

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

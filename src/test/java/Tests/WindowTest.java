package Tests;

import org.testng.annotations.Test;
import Pages.AlertWindowFramePage;
import Pages.WindowPage;
import Pages.HomePage;
import SharedData.SharedData;


public class WindowTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToWindowPage();
//tab
        WindowPage windowPage = new WindowPage(getWebDriver());

        windowPage.interactWithNewTab();
//window
        windowPage.interactWithNewWindow();

//window message
        windowPage.interactWithNewWindowMsgButton();
    }
}
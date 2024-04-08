package Tests;

import org.testng.annotations.Test;
import Pages.AlertWindowFramePage;
import Pages.WindowPage;
import Pages.HomePage;
import SharedData.Hooks;


public class WindowTest extends SharedData.Hooks {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToWindowPage();

        WindowPage windowPage = new WindowPage(getWebDriver());

//tab
        windowPage.interactWithNewTab();

//window
        windowPage.interactWithNewWindow();

//window message
        //windowPage.interactWithNewWindowMsgButton();
    }
}
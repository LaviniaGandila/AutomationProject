package HelperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
    private WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void switchToSpecificTabWindow (Integer index) {
        List<String> TabsOpen = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(TabsOpen.get(index));
        System.out.println("Tabul curent are numele " + webDriver.getCurrentUrl());
    }

    public void closeCurrentWindow () {
        webDriver.close();
    }


}

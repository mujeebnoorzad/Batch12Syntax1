package com.class25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new FirefoxDriver();
        webDriver.openBrowser();
        webDriver.findElement();
        webDriver.maximizeWindow();
        webDriver.closeBrowser();

        WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver w:webDrivers
        ) {
            w.openBrowser();
            w.findElement();
            w.maximizeWindow();
            w.closeBrowser();
        }
    }
}

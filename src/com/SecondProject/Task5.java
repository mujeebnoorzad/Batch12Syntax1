package com.SecondProject;

public class Task5 {
    public static void main(String[] args) {
        RemoteWebDriver[] obj= {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for(RemoteWebDriver o:obj){
            o.open();
            o.close();
            o.getTitle();
            o.getScreenShot();
            o.navigate();
        }
    }
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface TakesScreenShot{
    void getScreenShot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenShot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver {
    public void open() {
        System.out.println("Open ChromeDriver");
    }
    public void close() {
        System.out.println("Close ChromeDriver");
    }
    public String getTitle() {
        return "Get Title";
    }
    public void getScreenShot() {
        System.out.println("Take a Screenshot");
    }
    public void navigate() {
        System.out.println("Navigate to ChromeDriver");
    }
}
class FirefoxDriver implements RemoteWebDriver{

    public void open() {
        System.out.println("Open FirefoxDriver");
    }
    public void close() {
        System.out.println("Close FirefoxDriver");
    }
    public String getTitle() {
        return "Get Title";
    }
    public void getScreenShot() {
        System.out.println("Take a Screenshot");
    }
    public void navigate() {
        System.out.println("Navigate to FirefoxDriver");
    }
}
class SafariDriver implements RemoteWebDriver{

    public void open() {
        System.out.println("Open SafariDriver");
    }
    public void close() {
        System.out.println("Close SafariDriver");
    }
    public String getTitle() {
        return "Get Title";
    }
    public void getScreenShot() {
        System.out.println("Take a Screenshot");
    }
    public void navigate() {
        System.out.println("Navigate to SafariDriver");
    }
}

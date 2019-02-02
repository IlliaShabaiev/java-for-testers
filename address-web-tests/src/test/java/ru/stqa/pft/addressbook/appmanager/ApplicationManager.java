package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.BrowserType;

import sun.plugin2.main.client.WDonatePrivilege;



import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;
  WebDriverWait wait;

  private ContactHelper contactHelper;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private DataHelper dataHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {

    if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    }else if (browser.equals (BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    }else if (browser.equals(BrowserType.IE)) {

      wd = new InternetExplorerDriver();
    }



   wait = new WebDriverWait(wd,30);
   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   wd.get("http://localhost/addressbook/");
   groupHelper = new GroupHelper(wd, wait);
   navigationHelper = new NavigationHelper(wd, wait);
   sessionHelper = new SessionHelper(wd, wait);
   contactHelper = new ContactHelper(wd, wait);
   dataHelper = new DataHelper();

  sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public DataHelper getDataHelper() {
    return dataHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
}

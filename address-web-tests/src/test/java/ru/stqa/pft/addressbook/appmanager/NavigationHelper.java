package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd, WebDriverWait wait) {
  super(wd, wait);
  }


  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}

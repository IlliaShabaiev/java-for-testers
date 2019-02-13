package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.name;
import static org.openqa.selenium.By.xpath;

public class NavigationHelper extends HelperBase {
  public NavigationHelper(WebDriver wd, WebDriverWait wait) {
    super(wd, wait);
  }


  public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(name("new"))) {
      return;
    }
    click(By.linkText("groups"));
  }



  public void returnToHomePage() {
      if (isElementPresent(By.id("maintable"))) {
        return;
    }
     click(By.linkText("home"));
    }
  }

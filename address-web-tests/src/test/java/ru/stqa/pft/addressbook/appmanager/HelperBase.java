package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HelperBase {
  protected WebDriver wd;
  protected WebDriverWait wait;

  public HelperBase(WebDriver wd, WebDriverWait wait) {

    this.wd = wd;
    this.wait = wait;
  }


  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }
//  public boolean isAlertPresent() {
//    try {
//      wd.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }

  public void waitUntilUrContains(String stringWhichUrlMustContain){
    try{
      wait.until(ExpectedConditions.urlContains(stringWhichUrlMustContain));
      System.out.println("Url contains: " + stringWhichUrlMustContain);
    }catch (Exception ex){
      System.out.println("Url does not contain: " + stringWhichUrlMustContain);
      ex.printStackTrace();
    }
  }

  public void waitUntilTitleContains(String stringWhichTitleMustContain){
    try{
      wait.until(ExpectedConditions.titleContains(stringWhichTitleMustContain));
      System.out.println("Title contains: " + stringWhichTitleMustContain);
    }catch (Exception ex){
      System.out.println("Title does not contain: " + stringWhichTitleMustContain);
      ex.printStackTrace();
    }
  }

  public String getValueOfAttributeByXpath(String xpathValue, String attributeName){
    String value = null;
    try {
      value = wd.findElement(By.xpath(xpathValue)).getAttribute(attributeName);
    }catch (Exception e){
      e.printStackTrace();
    }
    return value;
  }

  public String getValueOfAttributeByXpath(String xpath){
    String value = null;
    try{
      value = wd.findElement(By.xpath(xpath)).getText();
    }catch (Exception ex){
      ex.printStackTrace();
    }
    return value;
  }

      public boolean isElementPresent(String xpath){
      boolean present = false;
      try{
        wd.findElement(By.xpath(xpath));
        present = true;
      }catch (Exception ex){
        System.out.println("Element located at xpath: " + xpath + " is not present");
      }
      return present;
      }

  public void sleep(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException e) {
      e.printStackTrace();
      }
    }
  }


package ru.stqa.pft.addressbook.appmanager;

import org.apache.commons.lang.math.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.NewContactData;
import java.util.Random;



import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd, WebDriverWait wait) {
    super(wd, wait);
  }


  public void clickOnAddNewContactPage() {
    click(By.linkText("add new"));
  }

  public void fillOutContactForm(NewContactData newContactData, boolean creation) {
    type(By.name("firstname"), newContactData.getFirstName());
    type(By.name("lastname"), newContactData.getLastName());
    type(By.name("company"), newContactData.getCompany());
    type(By.name("address"), newContactData.getAddress());
    type(By.name("home"), newContactData.getHomeNumber());
    type(By.name("mobile"), newContactData.getMobileNumber());
    type(By.name("email"), newContactData.getEmail());
   // click(By.xpath("//*[@id='content']//*[@type='submit'][1]"));
//    if (creation) {
//      Select select = new Select(wd.findElement(By.name("new_group")));
//      select.selectByVisibleText(newContactData.getGroup());
//      //new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(NewContactData.getGroup());
//    } else {
//      Assert.assertFalse(isElementPresent(By.name("new_group")));
//  }
}

  public void submit() {
    click(By.xpath("//*[@type='submit']"));
  }


  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  /*public Map<String, String> getAdditionaltDetailsofContactBeingDeleted() {
    Map<String, String> additionalDetails = new HashMap<>();
    String detailsUrl = getValueOfAttributeByXpath("//*[@id='maintable']/tbody/tr[2]/td[7]/a", "href");
    String id = fetchIdFromUrl(detailsUrl);
    additionalDetails.put("id", id);
    return additionalDetails;
  }*/



  public void editContact() {

    Random rand = new Random();
    int numberOfResults = Integer.valueOf(wd.findElement(By.xpath("//*[@id='search_count']")).getText());
    int rand_int1 = (int)(Math.random() * ((numberOfResults - 1) + 1)) + 1;
    rand_int1 += 1;

    click(By.xpath(String.format("//*[@id='maintable']/tbody/tr[%d]/td[8]", rand_int1)));
  }

  public void clickUpdate() {
    click(By.xpath("//*[@id='content']/form[1]/input[22]"));
  }

  public void initNewContactDeletion() {
    click(By.xpath("//*[@value='Delete']"));
  }

  public void waitForMessage() {
    WebDriverWait wait = new WebDriverWait(wd, 15);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div")));

  }

  public void alertText() {
    wd.switchTo().alert().accept();
  }

/*  public String fetchIdFromUrl(String url) {
    String id;
    if (url.contains("id")) {
      id = url.substring(url.indexOf("?id=") + 4);
    } else {
      throw new IllegalArgumentException("String: " + url + " doesn't contain 'id'");
    }
    return id;
  } */


/*  public String getMessageBoxContent() {
    String value = null;
    try {
      value = getValueOfAttributeByXpath("//*[@id=\"content\"]//*[@class=\"msgbox\"]");
    } catch (Exception e) {
      System.out.println("Couldn't find Message Box");
      e.printStackTrace();
    }
    return value;
  }*/

  public void isMessageBoxPresent() {
    click(By.xpath("//*[@id=\"content\"]//*[@class=\"msgbox\"]"));

  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//*[@type='checkbox']"));
  }

  public int getNumberOfContacts(){
    WebElement element = findWebElement(By.xpath("//*[@id='search_count']"));
    System.out.println(String.format("Found %s records", element.getText()));

    int a = Integer.valueOf(element.getText());
    System.out.println();
    return a;
  }
}

package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.pft.addressbook.model.NewContactData;

import java.util.HashMap;
import java.util.Map;


public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd, WebDriverWait wait) {
    super(wd, wait);
  }


  public void clickOnAddNewContactPage() {
    click(By.linkText("add new"));
  }

  public void fillOutColntactForm(NewContactData newContactData) {
    type(By.name("firstname"), newContactData.getFirstName());
    type(By.name("lastname"), newContactData.getLastName());
    type(By.name("company"), newContactData.getCompany());
    type(By.name("address"), newContactData.getAddress());
    type(By.name("home"), newContactData.getHomeNumber());
    type(By.name("mobile"), newContactData.getMobileNumber());
    type(By.name("email"), newContactData.getEmail());
  }

  public void submit() {
    click(By.name("submit"));
  }


  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void selectContact() {
    click(By.xpath("//*[@id='maintable']/tbody/tr[2]/td[1]"));
  }

  public String getMessageBoxContent(){
      String value = null;
      try{
        value = getValueOfAttributeByXpath("//*[@id=\"content\"]//*[@class=\"msgbox\"]");
      }catch (Exception e){
        System.out.println("Couldn't find Message Box");
        e.printStackTrace();
      }
    return value;
  }

  public boolean isMessageBoxPresent(){
    String msgBoxXpath = "//*[@id=\"content\"]//*[@class=\"msgbox\"]";
    return isElementPresent(msgBoxXpath);
  }

  public Map<String, String> getAdditionaltDetailsofContactBeingDeleted(){
    Map<String, String> additionalDetails = new HashMap<>();
    String detailsUrl = getValueOfAttributeByXpath("//*[@id='maintable']/tbody/tr[2]/td[7]/a", "href");
    String id = fetchIdFromUrl(detailsUrl);
    additionalDetails.put("id", id);
    return additionalDetails;
  }

  public void eidtContact() {
    click(By.xpath("//*[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void clickUpdate() {
    click(By.xpath("//*[@id='content']/form[1]/input[22]"));
  }

  public void initNewContactDeletion() {
    click(By.xpath("//*[@value='Delete']"));
  }
  public void waitForMessage() {
    WebDriverWait wait = new WebDriverWait(wd, 30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div")));

  }

  public void alertText() {
    wd.switchTo().alert().accept();
  }
  public String fetchIdFromUrl(String url){
    String id;
    if (url.contains("id")){
      id = url.substring(url.indexOf("?id=") + 4);
    }else{
      throw new IllegalArgumentException("String: " + url + " doesn't contain 'id'");
    }
    return id;
  }

}

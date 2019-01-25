package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.pft.addressbook.model.NewContactData;



public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
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
}

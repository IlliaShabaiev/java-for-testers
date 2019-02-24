package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupHelper extends HelperBase {


  public GroupHelper(WebDriver wd, WebDriverWait wait) {
    super(wd, wait);
  }


  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }




  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void submitGroupCreation() {
    click(By.xpath("//*[@id='content']/form/input[2]"));
  }

  public void initGroupCreation() {
    click(By.xpath("//*[@id='content']/form/input[1]"));
  }

  public void deleteSelectedGroup() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(new GroupData("test 1", null, null, null));
    submitGroupCreation();
    returnToGroupPage();
  }


  public boolean isThereAGroup() {
    return isElementPresent(By.className("group")); }
}
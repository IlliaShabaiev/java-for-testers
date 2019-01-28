package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;


public class NewContactDeletionTests extends TestBase {
  @Test
  public void NewContactDeletion() {

    app.getContactHelper().returnToHomePage();
    app.getContactHelper().selectContact();
    Map<String,String> detailsOfContactBeingDeleted = app.getContactHelper().getAdditionaltDetailsofContactBeingDeleted();
    app.getContactHelper().initNewContactDeletion();
    app.getContactHelper().alertText();
    app.getContactHelper().waitUntilUrContains("delete.php?part=" + detailsOfContactBeingDeleted.get("id"));
    app.getContactHelper().waitUntilTitleContains("Delete");
    Assert.assertEquals(app.getContactHelper().isMessageBoxPresent(), true);
    String actualContentDeletedSucessfullyMessage = app.getContactHelper().getMessageBoxContent();
    Assert.assertEquals(actualContentDeletedSucessfullyMessage, "Record successful deleted");
  }
}
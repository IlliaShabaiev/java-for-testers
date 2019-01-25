package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactDeletionTests extends TestBase {
  @Test
  public void NewContactDeletion() {

    app.getContactHelper().returnToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initNewContactDeletion();
    app.getContactHelper().alertText();
    app.getContactHelper().waitForMessage();

  }
}
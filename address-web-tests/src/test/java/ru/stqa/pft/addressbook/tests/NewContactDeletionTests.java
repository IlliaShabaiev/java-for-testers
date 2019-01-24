package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactDeletionTests extends TestBase {
  @Test
  public void NewContactDeletion() {
    NewContactData contactData = new NewContactData("Ilya", "Shabaev", "Sidley", "1212  Granville", "123456789", "8728003751", "ilyashabaev2209@gmail.com");
    app.getContactHelper().clickOnAddNewContactPage();
    app.getContactHelper().fillOutColntactForm(contactData);
    app.getContactHelper().submit();
    app.getContactHelper().returnToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initGroupDeletion();
    app.getContactHelper().closeAlertWindow();

  }
}
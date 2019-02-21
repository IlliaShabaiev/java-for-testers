package ru.stqa.pft.addressbook.tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;


public class NewContactDeletionTests extends TestBase {
  @Test
  public void NewContactDeletion() {
    int numberOfRecords = app.getContactHelper().getNumberOfContacts();
    if (numberOfRecords == 0) {
      app.getContactHelper().clickOnAddNewContactPage();
      app.getContactHelper().fillOutContactForm(new NewContactData("Ilya", "Shabaev", "blue", "123 street", "3234434", "23322323", "idk@gmail.com", null), true);
      app.getContactHelper().submit();
      app.getContactHelper().returnToHomePage();
      numberOfRecords = app.getContactHelper().getNumberOfContacts();
    }
    if (numberOfRecords == 0) {
      throw new IllegalArgumentException("Couldn't create a new contact");
    } else {
      app.getContactHelper().selectContact();
      app.getContactHelper().initNewContactDeletion();
      app.getContactHelper().alertText();
      app.getContactHelper().isMessageBoxPresent();
      app.getContactHelper().returnToHomePage();
    }

  }
}
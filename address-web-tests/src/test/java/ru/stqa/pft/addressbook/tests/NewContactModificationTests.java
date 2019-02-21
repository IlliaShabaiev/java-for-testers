package ru.stqa.pft.addressbook.tests;

import com.github.javafaker.Faker;
import okhttp3.Address;
import org.apache.commons.lang.ObjectUtils;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactModificationTests extends TestBase {
  @Test
  public void NewContactModification() {
    Faker faker = new Faker();
    int numberOfRecords = app.getContactHelper().getNumberOfContacts();
    if (numberOfRecords == 0)  {
      app.getContactHelper().clickOnAddNewContactPage();
      app.getContactHelper().fillOutContactForm(new NewContactData(faker.firstName(), faker.lastName(), faker.country(), "234 bever st", faker.phoneNumber(), faker.phoneNumber(), "123@mail.com", null), false);
      app.getContactHelper().submit();
      app.getContactHelper().returnToHomePage();
      numberOfRecords = app.getContactHelper().getNumberOfContacts();
    }
    if (numberOfRecords == 0) {
      throw new IllegalArgumentException ("Couldn't create a new contact");
    } else {
      app.getContactHelper().editContact();
      app.getContactHelper().fillOutContactForm(new NewContactData("Bob", "Ivanov", "google", "444 newbury", "12333443", "32344423", "iluas@gmail.com", null), false);
      app.getContactHelper().clickUpdate();
    }
  }
}
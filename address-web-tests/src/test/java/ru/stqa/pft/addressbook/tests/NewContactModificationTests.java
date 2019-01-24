package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactModificationTests extends TestBase{
  @Test
public void NewContactModification() {
    NewContactData contactData = new NewContactData("Bob", "Johnson", "Sidley", "1111  Brooklyn", "123456789", "999 999 999", "ilyashabaev2209@gmail.com");
    app.getContactHelper().selectContact();
    app.getContactHelper().eidtContact();
    app.getContactHelper().fillOutColntactForm(contactData);
    app.getContactHelper().clickUpdate();


  }
}

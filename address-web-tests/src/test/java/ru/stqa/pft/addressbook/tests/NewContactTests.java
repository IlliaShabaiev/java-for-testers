package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.NewContactData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class NewContactTests extends TestBase {


  @Test
  public void testNewContact()  {

    NewContactData contactData = new NewContactData("Ilya", "Shabaev", "Sidley", "1212 Granville", "123456789", "8728003751", "ilyashabaev2209@gmail.com");
    app.getContactHelper().clickOnAddNewContactPage();
    app.getContactHelper().fillOutColntactForm(contactData);
    app.getContactHelper().submit();
    /*EnterNewContactInformation(new NewContactData("Ilya", "Shabaev", "Sidley", "1212 Granville", "123456789", "8728003751", "ilyashabaev2209@gmail.com"));
    SubmitNewContactCreation();
    reutrnToTheHomePage();
    LogOut();*/

  }


}

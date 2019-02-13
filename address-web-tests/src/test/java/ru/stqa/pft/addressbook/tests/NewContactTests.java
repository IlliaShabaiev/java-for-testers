package ru.stqa.pft.addressbook.tests;

import com.github.javafaker.Faker;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.NewContactData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class NewContactTests extends TestBase {


  @Test
  public void testNewContact() {

   /* for (int i = 0; i<10; i++){
      Faker faker = new Faker();
      String firstName = faker.firstName();
      String lastName = faker.lastName();
      String email = firstName + "." + lastName + "@testgmail.com";
      String company = app.getDataHelper().getCompanies().get(
              app.getDataHelper().getRandomInteger(
                      0, app.getDataHelper().getCompanies().size()-1));

      NewContactData contactData = new NewContactData(
              firstName,
              lastName,
              company,
              faker.streetAddress(true),
              faker.phoneNumber(),
              faker.phoneNumber(),
              email
      );*/

    app.getContactHelper().clickOnAddNewContactPage();
    app.getContactHelper().fillOutContactForm(new NewContactData("Ilya", "Shabaev", "test1"), true);
    app.getContactHelper().submit();

  }
}
    //    NewContactData contactData = new NewContactData(
//            "Ilya",
//            "Shabaev",
//            "Sidley",
//            "1212 Granville",
//            "123456789",
//            "8728003751",
//            "ilyashabaev2209@gmail.com");





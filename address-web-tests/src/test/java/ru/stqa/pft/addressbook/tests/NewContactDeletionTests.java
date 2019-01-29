package ru.stqa.pft.addressbook.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

import java.util.Map;


public class NewContactDeletionTests extends TestBase {
  @Test
  public void NewContactDeletion() {

      Faker faker = new Faker();
      String firstName = faker.firstName();
      String lastName = faker.lastName();
      String email = firstName + "." + lastName + "@testgmail.com";
      String company = app.getDataHelper().getCompanies().get(
              app.getDataHelper().getRandomInteger(
                      0, app.getDataHelper().getCompanies().size() - 1));
      NewContactData contactData = new NewContactData(
              firstName,
              lastName,
              company,
              faker.streetAddress(true),
              faker.phoneNumber(),
              faker.phoneNumber(),
              email
      );

      app.getContactHelper().returnToHomePage();
      app.getContactHelper().clickOnAddNewContactPage();
      app.getContactHelper().fillOutColntactForm(contactData);
      app.getContactHelper().submit();
      app.getContactHelper().returnToHomePage();
      app.getContactHelper().selectContact();
      Map<String, String> detailsOfContactBeingDeleted = app.getContactHelper().getAdditionaltDetailsofContactBeingDeleted();
      app.getContactHelper().initNewContactDeletion();
      app.getContactHelper().alertText();
      app.getContactHelper().waitUntilUrContains("delete.php?part=" + detailsOfContactBeingDeleted.get("id"));
      app.getContactHelper().waitUntilTitleContains("Delete");
      Assert.assertEquals(app.getContactHelper().isMessageBoxPresent(), true);
      String actualContentDeletedSucessfullyMessage = app.getContactHelper().getMessageBoxContent();
      Assert.assertEquals(actualContentDeletedSucessfullyMessage, "Record successful deleted");

    }
  }

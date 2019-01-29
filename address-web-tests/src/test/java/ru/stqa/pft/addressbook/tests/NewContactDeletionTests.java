package ru.stqa.pft.addressbook.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

import java.util.Map;


public class NewContactDeletionTests extends TestBase {
    @Test
    public void NewContactDeletion() {
        NewContactData contactData = new NewContactData("Bob", "Johnson", "Sidley", "1111  Brooklyn", "123456789", "999 999 999", "ilyashabaev2209@gmail.com");

        app.getContactHelper().returnToHomePage();
        app.getContactHelper().clickOnAddNewContactPage();
        app.getContactHelper().fillOutColntactForm(contactData);
        app.getContactHelper().submit();
        app.getContactHelper().returnToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initNewContactDeletion();
        app.getContactHelper().alertText();
        app.getContactHelper().isMessageBoxPresent();


    }
}


package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;



public class NewContactDeletionTests extends TestBase {
    @Test
    public void NewContactDeletion() {
        NewContactData contactData = new NewContactData("Bob", "Johnson", "Sidley");
        app.getContactHelper().clickOnAddNewContactPage();
        app.getContactHelper().fillOutContactForm (contactData,true);
        app.getContactHelper().submit();
        app.getContactHelper().returnToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initNewContactDeletion();
        app.getContactHelper().alertText();
        app.getContactHelper().isMessageBoxPresent();
        app.getContactHelper().returnToHomePage();
    }
}
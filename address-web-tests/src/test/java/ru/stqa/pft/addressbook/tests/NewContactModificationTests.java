package ru.stqa.pft.addressbook.tests;

import org.apache.commons.lang.ObjectUtils;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactModificationTests extends TestBase{
  @Test
public void NewContactModification() {

    app.getContactHelper().selectContact();
    app.getContactHelper().eidtContact();
    app.getContactHelper().fillOutContactForm(new NewContactData ("Ilya", "Shabaev", null ), false);
    app.getContactHelper().clickUpdate();


  }
}

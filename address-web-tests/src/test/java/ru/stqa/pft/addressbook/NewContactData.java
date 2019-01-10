package ru.stqa.pft.addressbook;

public class NewContactData {
  private final String firstName;
  private final String lastName;
  private final String company;
  private final String address;
  private final String homeNumber;
  private final String mobileNumber;
  private final String email;

  public NewContactData(String FirstName, String LastName, String Company, String Address, String HomeNumber, String MobileNumber, String Email) {
    firstName = FirstName;
    lastName = LastName;
    company = Company;
    address = Address;
    homeNumber = HomeNumber;
    mobileNumber = MobileNumber;
    email = Email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomeNumber() {
    return homeNumber;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public String getEmail() {
    return email;
  }
}

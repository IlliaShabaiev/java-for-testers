package ru.stqa.pft.addressbook.model;

public class NewContactData {
  private final String firstName;
  private final String lastName;
  private final String company;
  private final String address;
  private final String homeNumber;
  private final String mobileNumber;
  private final String email;

  public NewContactData(String firstName, String lastName, String company, String address, String homeNumber, String mobileNumber, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.homeNumber = homeNumber;
    this.mobileNumber = mobileNumber;
    this.email = email;
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

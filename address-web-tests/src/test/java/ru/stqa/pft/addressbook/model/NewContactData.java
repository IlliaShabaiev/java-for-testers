package ru.stqa.pft.addressbook.model;

public class NewContactData {
  private String firstName;
  private String lastName;
  private String company;
  private String address;
  private String homeNumber;
  private String mobileNumber;
  private String email;
  private String group;

  public NewContactData(String firstName, String lastName, String company, String address, String homeNumber, String mobileNumber, String email, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.homeNumber = homeNumber;
    this.mobileNumber = mobileNumber;
    this.email = email;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}



package ru.stqa.pft.addressbook.model;

import java.security.acl.Group;

public class NewContactData {
   private final String firstName;
  private final String lastName;
  //private final String company;
  //private final String address;
  //private final String homeNumber;
  //private final String mobileNumber;
  //private final String email;
  private final String group;




  public NewContactData(String firstName, String lastName, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
    // this.company = company;
    //this.address = address;
    //this.homeNumber = homeNumber;
    // this.mobileNumber = mobileNumber;


  }

  public String getGroup() {
    return group;
  }

  public String getfirstName() {
  return firstName;
  }

  public String getlastName() {
  return lastName;
  }
}

 /* public String getCompany() {
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
  }*/


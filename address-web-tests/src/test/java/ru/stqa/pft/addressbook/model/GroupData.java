package ru.stqa.pft.addressbook.model;
public class GroupData {
  private String name;
  private String header;
  private String footer;
  private String group;

  public GroupData(String name, String header, String footer, String group) {
    this.name = name;
    this.header = header;
    this.footer = footer;
    this.group = group;
  }

  /*public GroupData(String s, Object o, Object o1) {
  }*/

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }
}

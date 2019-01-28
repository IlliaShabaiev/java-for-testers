package ru.stqa.pft.addressbook.appmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataHelper {

  public DataHelper() {
    loadCompanies();
  }

  private List<String> companies;

  public void loadCompanies() {
    Class clazz = DataHelper.class;
    InputStream inputStream = clazz.getResourceAsStream("/companies.txt");
    List<String> companies = new ArrayList<>();
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      String line = reader.readLine();
      while (line != null) {
        line = reader.readLine();
        companies.add(line);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    this.companies = companies;
  }

  public List<String> getCompanies() {
    return companies;
  }

  public int getRandomInteger(int min, int max){
    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }
}

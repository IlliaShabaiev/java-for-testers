package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  public void validateThatDistanceIsEqualToBigNumber() {
    Point p1 = new Point(11, 12);
    Point p2 = new Point(12, 13);
    double currentDistance = p1.distance(p2);
    double expectedDistance = 1.4142135623730951;
    printExpectedAndActual(expectedDistance, currentDistance);
    Assert.assertEquals(currentDistance, expectedDistance);
    }

  public void validateThatDistanceIsEqualToZero() {
    Point p1 = new Point(11, 12);
    Point p2 = new Point(11, 12);
    double actualDistance = p1.distance(p2);
    double expectedDistance = 0.0;
    printExpectedAndActual(expectedDistance, actualDistance);
    Assert.assertEquals(expectedDistance, actualDistance);
  }

  public void validateThatDistanceIsCorrectForNumbersWithDecimalPoints() {
    Point p1 = new Point(11.234723, 12.123812);
    Point p2 = new Point(14.231, 7.16234);
    double actualDistance = p1.distance(p2);
    double expectedDistance = 5.796022797359668;
    printExpectedAndActual(expectedDistance, actualDistance);
    Assert.assertEquals(expectedDistance, actualDistance);
  }

  public void validateThatDistanceIsPreciseToOneHundredth() {
    Point p1 = new Point(11, 11);
    Point p2 = new Point(11, 11.01);
    double actualDistance = p1.distance(p2);
    double expectedDistance = 0.009999999999999787;
    printExpectedAndActual(expectedDistance, actualDistance);
    Assert.assertEquals(expectedDistance, actualDistance);
  }

  public void printExpectedAndActual(double expected, double actual){
    System.out.println("Expected distance: " + expected);
    System.out.println("Actual distance: " + actual);
  }

}


package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void validateThatDistanceIsEqualToBigNumber() {
    Point p1 = new Point(11, 12);
    Point p2 = new Point(12, 13);
    Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
    }

  @Test
  public void validateThatDistanceIsEqualToZero() {
    Point p1 = new Point(11, 12);
    Point p2 = new Point(11, 12);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void validateThatDistanceIsCorrectForNumbersWithDecimalPoints() {
    Point p1 = new Point(11.234723, 12.123812);
    Point p2 = new Point(14.231, 7.16234);
    Assert.assertEquals(p1.distance(p2), 5.796022797359668);
  }

  @Test
  public void validateThatDistanceIsPreciseToOneHundredth() {
    Point p1 = new Point(11, 11);
    Point p2 = new Point(11, 11.01);
    Assert.assertEquals(p1.distance(p2), 0.009999999999999787);
  }

}


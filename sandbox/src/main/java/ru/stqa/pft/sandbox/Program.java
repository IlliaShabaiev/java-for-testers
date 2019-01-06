package ru.stqa.pft.sandbox;

import sun.security.util.Length;

class Program {
  public static void main(String[] args) {
    Point p1 = new Point(11, 12);
    Point p2 = new Point(12, 13);
    p1.distance(p2);
    System.out.println(p1.distance(p2));
    System.out.println("Hello world!");
  }
}



//
//
//    Square s = new Square(5);
//    System.out.println("Площадь квадрата со стороной" + s.l + " = " + s.area());
//
//    Rectangle r = new Rectangle(4,6);
//    System.out.println("Площадь квадрата со стороной "+ r.a + " и " + r.b + " = " + r.area());
//  }
//}


 //public static double area(Square s) {
//return s.l * s.l;
//Square s = new Square(5);
//System.out.println("Площадь квадрата со стороной" + s.1 + " = " + area(s));
//
//public static double area(Square s) {
//return s.l * s.l;
//
//}

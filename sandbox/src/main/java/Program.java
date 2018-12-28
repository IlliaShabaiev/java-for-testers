class Program {
    public static void main(String[] args) {
      Point p1 = new Point(11, 12);
      Point p2 = new Point(12, 13);
      p1.distance(p2);
        System.out.println(String.format("%.2f", p1.distance(p2)));
        System.out.println("Hello world!");
      }
    }

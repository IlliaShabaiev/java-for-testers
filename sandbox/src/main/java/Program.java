class Program {
    public static void main(String[] args) {
        Point one = new Point(5,22.34);
        Point two = new Point(14.5,17);
        System.out.println(String.format("%.2f",Point.distance(one, two)));
        System.out.println("Hello world!");
    }
}

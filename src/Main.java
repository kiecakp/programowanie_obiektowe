public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(100, 100);

        Segment segment = new Segment(point1, point2);

        System.out.println(segment.toSvg());

        //Point[] points = new Point[10];  tablica punktow
    }
}
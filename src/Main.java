public class Main {
    public static void main(String[] args) {
        Point point = new Point(40,20);
        Point point1 = new Point(200,150);
        Segment segment = new Segment(point, point1);
        Style style = new Style("lime", "red", 3.0);
        Polygon polygon = Polygon.square(segment, style);
        System.out.println(polygon.toSvg());

    }
}
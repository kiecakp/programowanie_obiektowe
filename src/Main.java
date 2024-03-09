public class Main {
    public static void main(String[] args) {
        Point point = new Point(50,40);
        Point point1 = new Point(200,150);
        Style style = new Style("lime", "red", 3.0);
        Segment segment = new Segment(point, point1);
        Ellipse ellipse = new Ellipse(style, point, 50.0, 100.0);

        Shape shape = new Ellipse(style, point1, 50.0, 100.0);
        Shape shape1 = Polygon.square(segment, style);

        System.out.println(shape.toSvg());
        System.out.println(shape1.toSvg());
    }
}
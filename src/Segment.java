import java.util.Locale;

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Point getStartPoint() {
        return startPoint;
    }
    public Point getEndPoint() {
        return endPoint;
    }
    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double lengh(){
        double a = Math.pow((endPoint.x - startPoint.x), 2);
        double b = Math.pow((endPoint.y - startPoint.y), 2);
        return Math.sqrt(a + b);
        // return Math.hypot(endPoint.x - startPoint.x, endPoint.y - startPoint.y);
    }
    public String toSvg(){
        return String.format(Locale.ENGLISH, "<line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style=\"stroke:red;stroke-width:2\" />", startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }

    static Segment[] perpenSegment(Point point, Segment segment) {
        double a = -1 / ((segment.endPoint.y - segment.startPoint.y) / (segment.endPoint.x - segment.startPoint.x));
        double b = point.y - (a * point.x);
        double tempX = point.x + (segment.lengh() / Math.sqrt(1 + Math.pow(a, 2)));
        double tempY = tempX * a + b;

        Point firstPoint = new Point(tempX, tempY);
        tempX = point.x - (segment.lengh() / Math.sqrt(1 + Math.pow(a, 2)));
        tempY = tempX * a + b;

        Point secondPoint = new Point(tempX, tempY);

        return new Segment[]{
                new Segment(point, firstPoint),
                new Segment(point, secondPoint)
        };
    }


}

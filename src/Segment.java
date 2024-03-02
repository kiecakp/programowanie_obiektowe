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
}

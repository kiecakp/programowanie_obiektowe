import java.util.Locale;

public class Ellipse extends Shape{
    private Point centerPoint;
    private double lengthX;
    private double lengthY;

    public Ellipse(Style style, Point centerPoint, double lengthX, double lengthY) {
        super(style);
        this.centerPoint = centerPoint;
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }

    public String toSvg(){
        return String.format(Locale.ENGLISH,"<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\" %s", centerPoint.x, centerPoint.y, lengthX, lengthY, style.toSvg());
    }
}

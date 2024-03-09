public class Polygon extends Shape{
    private Point[] points;
    private Style style;

    public Point[] getPoints() {
        return points;
    }
    public Polygon(Point[] points, Style style) {
        super(style);
        this.points = points;
        this.style = style;
    }
    public Polygon(Polygon other){                              // konstruktor kopiujacy GLEBOKA KOPIA
        super(other.style);
        this.points = new Point[other.points.length];
        for(int i = 0; i < other.points.length; i++){
            this.points[i] = new Point(other.points[i].x, other.points[i].y);
        }
        this.style = other.style;
    }
   public String toSvg(){
        String code = "<polygon points=\"";
        for(Point point : points){
            code += point.x + "," + point.y + " ";
        }
        code += "\"";
        code += style.toSvg();
        return code;
   }
   public static Polygon square(Segment segment, Style style){
        Point point1 = new Point(segment.getEndPoint().x, segment.getStartPoint().y);
        Point point2 = new Point(segment.getStartPoint().x, segment.getEndPoint().y);
        Point[] points = new Point[4];
        points[0] = segment.getStartPoint();
        points[1] = point1;
        points[2] = segment.getEndPoint();
        points[3] = point2;
        return new Polygon(points, style);
   }
}

public class Polygon {
    private Point[] points;
    private Style style;

    public Point[] getPoints() {
        return points;
    }
    public Polygon(Point[] points, Style style) {
        this.points = points;
        this.style = style;
    }
    public Polygon(Polygon other){                              // konstruktor kopiujacy GLEBOKA KOPIA
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
}

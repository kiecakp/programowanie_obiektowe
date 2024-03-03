public class Polygon {
    private Point[] points;

    public Point[] getPoints() {
        return points;
    }
    public Polygon(Point[] points) {
        this.points = points;
    }
    public Polygon(Polygon other){                              // konstruktor kopiujacy GLEBOKA KOPIA
        this.points = new Point[other.points.length];
        for(int i = 0; i < other.points.length; i++){
            this.points[i] = new Point(other.points[i].x, other.points[i].y);
        }
    }

   public StringBuilder toSvg(){
        StringBuilder code = new StringBuilder();
        code.append("<polygon points=\"");
        for(Point point : points){
            code.append(point.x).append(",").append(point.y).append(" ");
        }
        code.append("\" style=\"fill:white;stroke:purple;stroke-width:3\" />");
        return code;
   }
}

public class Polygon {
    private Point[] points;

    public Point[] getPoints() {
        return points;
    }
    public Polygon(Point[] points) {
        this.points = points;
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

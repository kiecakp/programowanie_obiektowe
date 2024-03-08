public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(50,20);                        // stworzenie punktow
        Point point2 = new Point(250, 100);
        Point point3 = new Point(40, 130);
        Point point4 = new Point(30,15);

        Point[] points = new Point[4];                                  //tablica punktow
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;

        Style style = new Style(null, "red", 3.0);

        Polygon polygon = new Polygon(points, style);                          // stworzenie wielokonta z podanej tablicy punktow
        Point[] wynik = new Point[4];
        wynik = polygon.getPoints();                                    // przypisanie do tablicy wynikowej punktow wielokonta

        System.out.println(polygon.toSvg());                            // narysowanie wielokonta w svg


    }
}
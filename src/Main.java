public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(65,10);                        // stworzenie punktow
        Point point2 = new Point(300,10);
        Point point3 = new Point(250,165);
        Point point4 = new Point(10,165);

        //System.out.println(point1.x); System.out.println(point1.y);  // wypisywanie wartosci punktow
        //System.out.println(point2.x); System.out.println(point2.y);

        Segment segment = new Segment(point1, point2);                  // stworzenie odcinka

        //System.out.println(segment.lengh());                          // wypisanie dlugosci odcinka
        //System.out.println(segment.toSvg());                          // narysowanie odcinka w svg

        Point[] points = new Point[4];                                  //tablica punktow
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;

        Polygon polygon = new Polygon(points);                          // stworzenie wielokonta z podanej tablicy punktow
        Point[] wynik = new Point[4];
        wynik = polygon.getPoints();                                    // przypisanie do tablicy wynikowej punktow wielokonta

        System.out.println(polygon.toSvg());                            // narysowanie wielokonta w svg
    }
}
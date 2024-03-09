import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SvgScene {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addPolygon(Shape shape){
        shapes.add(shape);
    }
    public void saveHtml(String path){
        String image = "<svg height=\"220\" width=\"500\">";
        for(Shape shape : shapes){
            image += shape.toSvg();
        }
        image += "</svg>";

        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(image);
            fileWriter.close();
        } catch (IOException e) {
        }
    }
}

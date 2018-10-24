import Geometry.Measurable;
import Geometry.Package;
import Geometry.Rectangle;
import Geometry.WindSpeed;

public class MeasurableClient {
    public static void main(String[] args) {
        Measurable m;

        m = new Rectangle(2, 7);
        System.out.println(m.getMeasure());

        m = new Package(10, 20);
        System.out.println(m.getMeasure());

        m = new WindSpeed(10, 2);
        System.out.println(m.getMeasure());
    }
}

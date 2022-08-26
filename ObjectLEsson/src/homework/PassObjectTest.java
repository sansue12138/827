package homework;


/**
 * @author liuchang
 * @Create 2022-08-19-17:25
 */
public class PassObjectTest {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.printAreas(circle, 5);
        System.out.println("Now radius:" + circle.radius);
    }
}

class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("Radius            Area");
        int i = 1;
        for (; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "               " + c.findArea());
        }
        c.radius = i;
    }
}

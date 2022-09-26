package cs171.assignment1;

public class ShapeRunner {
    public static void main(String[] args) {
        Circle greg = new Circle(4);
        System.out.println(greg.getCircumference());

        Circle craig = new Circle(1);
        System.out.println(greg.isBiggerThan(craig));

        Circle marvin = new Circle(6, 5, 6);

        System.out.println(marvin.containsPoint(5,2));

        Circle dooley = new Circle(1.5);

        Circle swoop = new Circle(1.5);

        System.out.println(dooley.equals(swoop));

        Rectangle square = new Rectangle();

        System.out.println(square.perimeter());

        square.setLength(5);
        square.setHeight(4);
        System.out.println(square.area());

        Cylinder cyl = new Cylinder();

        System.out.println(cyl.getArea());
        System.out.println(cyl.getVolume());

        }


    }


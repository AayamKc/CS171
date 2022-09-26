package cs171.point;

public class PointTester {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.getX() + ", " + point.getY());

        Point point2 = new Point(3, 4);
        System.out.println(point2.getX() + ", " + point2.getY());

        point2.setX(100);
        point2.setY(200);

        System.out.println(point2.getX() + ", " + point2.getY());

        point2 = point;

        System.out.println(point2.getX() + ", " + point2.getY());

        point2.setY(27);

        System.out.println(point.getY());
    }
}

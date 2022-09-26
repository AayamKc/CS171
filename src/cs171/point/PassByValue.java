package cs171.point;

public class PassByValue{
    public static String change(String x){
        // Try me! ...
        x = "cd";
        // x = null;
        // Test more things here ;-)
        return x;
    }

    public static void changePoint(Point p ){
        //p.setX(300);
        p =null;
    }
    public static void main(String[] args) {
        //String x = "ab";
        //System.out.println("x contains: " + x); // "ab"
        //change(x);
        //System.out.println(change(x)); // "cd"
        //System.out.println("x contains: " + x); // ???

        Point point = new Point(3, 4);
        System.out.println(point.getX() + ", " + point.getY());
        changePoint(point);
        System.out.println(point.getX() + ", " + point.getY());
    }
}

package cs171.assignment1;

public class ShapeTester {

    public static boolean isLarger(Circle c, Rectangle r){
        return c.getArea() >= r.area();
    }

    public static double longerPerim(Circle c, Rectangle r){
        double CirclePerimeter = 2 * Math.PI * c.radius;
        return Math.max(CirclePerimeter, r.perimeter());
    }

    public static double longerPerim(Rectangle r, Circle c){
        double CirclePerimeter = 2 * Math.PI * c.radius;
        return Math.max(CirclePerimeter, r.perimeter());
    }

    public static double largerArea(Circle c, Rectangle r){
        return Math.max(c.getArea(), r.area());
    }

    public static double largerArea(Rectangle r, Circle c){
        return Math.max(c.getArea(), r.area());
    }

    public static boolean containsCenter(Circle c, Circle b){
        double [] XY = b.getCenter();
        double xCord = XY[0];
        double yCord = XY[1];

        return c.containsPoint(xCord, yCord);
    }



}

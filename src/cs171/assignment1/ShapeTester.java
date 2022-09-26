package cs171.assignment1;

/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. AAYAM KC
*/
public class ShapeTester {

    // compares the area between a circle and rectangle and returns true if rectangle is bigger
    public static boolean isLarger(Circle c, Rectangle r){
        return c.getArea() >= r.area();
    }

    // compares the perimeter of a circle and rectangle and returns the largest value
    // takes circle then rectangle
    public static double longerPerim(Circle c, Rectangle r){
        double CirclePerimeter = 2 * Math.PI * c.radius; // calculation of perimeter of a circle
        return Math.max(CirclePerimeter, r.perimeter());
    }

    //  compares the perimeter of a circle and rectangle and returns the largest value
    // takes rectangle then circle
    public static double longerPerim(Rectangle r, Circle c){
        double CirclePerimeter = 2 * Math.PI * c.radius;
        return Math.max(CirclePerimeter, r.perimeter());
    }

    //  compares the area of a circle and rectangle and returns the largest value
    // takes circle then rectangle
    public static double largerArea(Circle c, Rectangle r){
        return Math.max(c.getArea(), r.area());
    }

    //  compares the area of a circle and rectangle and returns the largest value
    // takes rectangle then circle
    public static double largerArea(Rectangle r, Circle c){
        return Math.max(c.getArea(), r.area());
    }

    // takes two circles as parameters and checks to see if the second circle's center
    // is in the first circle
    public static boolean containsCenter(Circle c, Circle b){
        double [] XY = b.getCenter(); // create array to store x and y coordinates
        double xCord = XY[0]; // stores x coordinate
        double yCord = XY[1]; // stores y coordinate

        return c.containsPoint(xCord, yCord); // calls containsPoint method from cs171.assignment1.Circle class
    }



}

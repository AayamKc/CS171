package cs171.assignment1;

public class Circle {
    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center

    // The default constructor with no argument
    public Circle(){
        // Initializing the values of the instance variables
        radius = 1.0;
        x = 0.0;
        y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
        radius = r;
        x = 0.0;
        y = 0.0;
    }

    // Parameter r should be the radius length
    // Parameter ex should be the x coordinate
    // Parameter why should be the y coordinate
    public Circle(double r, double ex, double why) {
        this.radius = r;
        this.x = ex;
        this.y = why;
    }

    // A public getter method for retrieving the radius
    public double getRadius() {
        return radius;
    }
    // A public getter method for retrieving the center coordinates
    public double[] getCenter() {
        double[] c = {this.x, this.y};
        return c;
    }
    // A public getter method for computing and returning
    // the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // compute and return the circumference of the circle
    public double getCircumference() {
        double circumference = 0; // initialize a variable to be returned later
        if(this.getRadius() <= 0){ // makes sure the circle actually exists
            return 0;
        }
        else{
            circumference = 2 * Math.PI * this.radius; // sets variable circumference equal to the equation for circumference
        }
        return circumference; //returns circumference calculated above
    }
    // A public method that compares the sizes of two circles: the circle
    // represented by the current object, and the circle passed as a parameter.
    // Example: circleA.isBiggerThan(circleB) should return true if circleA
    // has a larger area than circleB, false otherwise.
    public boolean isBiggerThan(Object o) {
        if (o instanceof Circle) {
            if (this.getArea() > ((Circle) o).getArea()) {
                return true;
            }
        }
        return false;
    }
     // A public method that takes as input an x coordinate (as a double)
    // and a y coordinate (a double), and returns true if the (x, y) coordinate
    // is inside the current circle, false otherwise.
    public boolean containsPoint(double x, double y) {
        double distanceX = Math.pow((x- this.x), 2);
        double distanceY = Math.pow((y - this.y), 2);
        if((distanceX+distanceY) <= Math.pow(this.radius, 2)){ // this method utilizes the distance formula
            return true;
        }
        return false;
    }

    //  sets this object's radius
    // based on the passed parameter (of type double).
    // The method should not return anything.
    public void setRadius(double r){
        this.radius = r;
    }
    // sets this object's center.
    // The method takes two doubles as parameters: ex and why.
    // It should set the x coordinate of the circle to ex,
    // and the y coordinate of the circle to why.
    // The method should not return anything.

    public void setCenter(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "The circle is centered at point " + this.getCenter() +
                "with radius " + this.getRadius();
    }

    @ Override
    public boolean equals(Object o){
        if(o instanceof Circle){
            if(this.getArea() == ((Circle) o).getArea()){
                return true;
            }
        }
        return false;
    }
}
   
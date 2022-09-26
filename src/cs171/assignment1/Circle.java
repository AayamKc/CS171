package cs171.assignment1;

/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. AAYAM KC
*/
public class Circle {
    protected double radius; // initializes radius of a circle
    protected double x; // initializes x coordinate of the center
    protected double y; // initializes y coordinate

    //default constructor when no parameters are used
    public Circle(){
        radius = 1.0;
        x = 0.0;
        y = 0.0;
    }

    // overload constructor when radius is passed as parameter
    public Circle(double r) {
        radius = r;
        x = 0.0;
        y = 0.0;
    }

    // overload constructor when all instance variables are passed as parameters
    public Circle(double r, double ex, double why) {
        this.radius = r;
        this.x = ex;
        this.y = why;
    }

    //returns radius of circle
    public double getRadius() {
        return radius;
    }
    public double[] getCenter() {
        double[] c = {this.x, this.y};
        return c;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }


    // returns circumference of circle
    public double getCircumference() {
        double circumference = 0; // declaration of circumference to store calculation
        if(this.getRadius() <= 0){ // checks to see if circle is real
            return 0;
        }
        else{
            circumference = 2 * Math.PI * this.radius; // calculation for circumference
        }
        return circumference;
    }

    //compares two circles to determine which is bigger based on area. true indicates that this instance is larger.
    public boolean isBiggerThan(Object o) {
        if (o instanceof Circle) {
            if (this.getArea() > ((Circle) o).getArea()) {
                return true;
            }
        }
        return false;
    }

    //checks to see if circle contains a certain point within it
    public boolean containsPoint(double x, double y) {
        double distanceX = Math.pow((x- this.x), 2);
        double distanceY = Math.pow((y - this.y), 2);
        if((distanceX+distanceY) <= Math.pow(this.radius, 2)){
            return true;
        }
        return false;
    }


    //allows changes to radius to be made in other classes
    public void setRadius(double r){
        this.radius = r;
    }


    //allows changes to the x & y coordinates to be made in other classes
    public void setCenter(double x, double y){
        this.x = x;
        this.y = y;
    }

    //overrides default toString method to return preferred texr
    @Override
    public String toString() {
        return "The circle is centered at point " + this.getCenter() +
                "with radius " + this.getRadius();
    }

    // overrides default equals method to compare area instead of address
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
   
package cs171.assignment1;

/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. AAYAM KC
*/
public class Cylinder extends Circle {
    public double height; // initializes height of cylinder

    public double z; //initializes z coordinate of cylinder


    //default constructor when no parameters are passed
    public Cylinder(){
        super(1, 0, 0);
        this.height = 1;

    }

    // overload constructor when all instance variables are passed as parameters
    public Cylinder(double x, double y, double r, double h){
        super(r, x, y);
        this.height = h;
    }

    // returns height of cylinder
    public double getHeight() {
        return this.height;
    }

    // allows changes to height parameter to be made in other classes
    public void setHeight(double h){
        this.height = h;
    }

    // overrides area method from parent class to do calculations for area of a cylinder
    @Override
    public double getArea(){
        return (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * Math.pow(this. radius, 2)); // surface ara of cylinder calculation

    }

    // returns the volume of a cylinder
    public double getVolume(){
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    } // volume of cylinder calculation
}

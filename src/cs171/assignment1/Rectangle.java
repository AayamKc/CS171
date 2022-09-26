package cs171.assignment1;

/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. AAYAM KC
*/
public class Rectangle {
    private double L; // initializes length of rectangle
    private double H; // initializes height of rectangle
    private double x; // initializes x coordinate of bottom left corner of rectangle
    private double y; // initializes y coordinate of bottom left corner of rectangle

    //default constructor when no parameters are passed
    public Rectangle(){
        this.L = 1;
        this.H = 1;
        this.x = 0;
        this.y = 0;
    }

    // overloaded constructor when all instance variables are passed as paramaters
    public Rectangle(double l, double h, double x, double y){
        this.L = l;
        this.H = h;
        this.x = x;
        this.y = y;
    }

    // returns length of rectangle
    public double getLength(){ return this.L;}

    // returns height of rectangle
    public double getHeight(){return this.H;}

    // allows changes to length to be made in other classes
    public void setLength(double l){this.L = l;}

    // allows changes to height to be made in other classes
    public void setHeight(double h){this.H = h;}

    // returns perimeter of a rectangle
    public double perimeter(){
        return (this.L * 2) + (this.H * 2);
    } // calculation of the perimeter of a rectangle

    // returns area of a rectangle
    public double area(){
        return this.L * this.H;
    } //calculation of the area of a rectangle

    // overrides default equals method to compare area instead of address
    @Override
    public boolean equals(Object o){
        if(o instanceof Rectangle){
            return this.area() == ((Rectangle) o).area();
        }
        return false;
    }

}

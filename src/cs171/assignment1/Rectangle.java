package cs171.assignment1;

public class Rectangle {
    private double L; // the length of the rectangle
    private double H; // the height of the rectangle
    private double x; // the x coordinate of the  bottom left corner of the rectangle
    private double y; // the y coordinate of the bottom left corner of the rectangle

    public Rectangle(){
        this.L = 1;
        this.H = 1;
        this.x = 0;
        this.y = 0;
    }

    public Rectangle(double l, double h, double x, double y){
        this.L = l;
        this.H = h;
        this.x = x;
        this.y = y;
    }

    public double getLength(){ return this.L;}

    public double getHeight(){return this.H;}

    public void setLength(double l){this.L = l;}

    public void setHeight(double h){this.H = h;}

    public double perimeter(){
        return (this.L * 2) + (this.H * 2);
    }

    public double area(){
        return this.L * this.H;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Rectangle){
            return this.area() == ((Rectangle) o).area();
        }
        return false;
    }

}

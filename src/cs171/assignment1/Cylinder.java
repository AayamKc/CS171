package cs171.assignment1;

public class Cylinder extends Circle{
    public double height;

    public double z;


    public Cylinder(){
        super(1, 0, 0);
        this.height = 1;

    }

    public Cylinder(double x, double y, double r, double h){
        super(r, x, y);
        this.height = h;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double h){
        this.height = h;
    }

    @Override
    public double getArea(){
        return (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * Math.pow(this. radius, 2));

    }

    public double getVolume(){
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
}

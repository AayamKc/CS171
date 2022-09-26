package cs171.point;

// Define a class that represents a cs171.point,
// with (x,y) coordinates
public class Point{
    // ---------------------------------------- //
    // Instance Variables (Member Data)
    private int x;
    private int y;
    // ---------------------------------------- //
    // Constructors
    // The "default" constructor created by Java, if you
    // don't write your own, is a no-argument constructor
    // ==> public Point(){ }  // what are the initial values
    // for the instance variables in this case? => default
    // 1) No-argument constructor (doesn't take any parameters)
    public Point(){
        // Initialize instance variables here:
        x = -1;
        y = -1;
    }
    // 2) A constructor that takes initial values
    // for (x,y) as int parameters:
    public Point(int xPoint, int yPoint){
        x = xPoint;
        y = yPoint;
    }
    // ---------------------------------------- //
    // Common operations (Instance Methods)
    // Getters:
    public int getX(){ return x; }
    public int getY(){ return y; }
    // Setters:
    public void setX(int xPoint){ x = xPoint; }
    public void setY(int yPoint){ y = yPoint; }


    // NOTE: Remember that we tested the code using
    // the main() method in another class PointTester.
    // It is important that both Point.java and PointTester.java
    // are placed in the same folder (directory).
    // We could have also tested the code by adding the main()
    // method here, in the same "Point" class.
}
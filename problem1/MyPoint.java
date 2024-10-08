package problem1;
// MyPoint.java
public class MyPoint {
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        setX(x);
        setY(y);
    }

    // Setters with validation
    public void setX(int x) {
        if (x < 0)
            throw new IllegalArgumentException("X coordinate cannot be negative.");
        this.x = x;
    }

    public void setY(int y) {
        if (y < 0)
            throw new IllegalArgumentException("Y coordinate cannot be negative.");
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

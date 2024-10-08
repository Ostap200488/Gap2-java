package problem1;
public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        setX(x);
        setY(y);
    }
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

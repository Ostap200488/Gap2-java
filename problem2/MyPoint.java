package problem2;
public class MyPoint {
    private int x, y;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public double distance(MyPoint other) {
        int dx = this.x - other.getX();
        int dy = this.y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
package problem1;

public class MyLine {
    private MyPoint start;
    private MyPoint end;
    public MyLine(MyPoint start, MyPoint end) {
        if (start.equals(end))
            throw new IllegalArgumentException("Start and end points cannot be the same.");
        this.start = start;
        this.end = end;
    }
    public MyPoint getStart() {
        return start;
    }
    public MyPoint getEnd() {
        return end;
    }
    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }
    public MyPoint midpoint() {
        return new MyPoint((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }
    @Override
    public String toString() {
        return "Line from " + start + " to " + end + " with length: " + length() + " and midpoint: " + midpoint();
    }
}

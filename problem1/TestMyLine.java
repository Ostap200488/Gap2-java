package problem1;
public class TestMyLine {
    public static void main(String[] args) {
        try {
            MyPoint point1 = new MyPoint(1, 2);
            MyPoint point2 = new MyPoint(4, 6);
            MyLine line = new MyLine(point1, point2);
            System.out.println(line);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

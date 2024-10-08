package problem2;
// TestMyRectangle.java
public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two MyPoint objects
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(5, 1);

        // Create a MyRectangle object
        MyRectangle rect = new MyRectangle(topLeft, bottomRight);

        // Test the methods
        System.out.println("Top-left corner: " + rect.getTopLeft());
        System.out.println("Bottom-right corner: " + rect.getBottomRight());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Rectangle details: " + rect);
    }
}
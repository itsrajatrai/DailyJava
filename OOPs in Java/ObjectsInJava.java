class Point {
    public int x = 0;
    public int y = 0;
	// a constructor!
    public Point(int a, int b) {
	x = a;
	y = b;
    }
}

public class ObjectsInJava{
 public static void main(String[] args) {
    Point origin = new Point(23, 94);
    System.out.println("X Position of rectTwo: " + origin.x);
    System.out.println("Y Position of rectTwo: " + origin.y);
        
    }
}
package ThisPackage;

public class Main {

    public static void main(String[] args) {
	int x = 20, y = 0, a = 20, b = 0;

	System.out.println("x = " + x + " and y = " + y);
	y = xToY(x, y);
	System.out.println("back in the main class, x = " + x + " and y = " + y);

	System.out.println("\na = " + a + " and b = " + b);
	aToB(a, b);
    System.out.println("back in the main class, a = " + a + " and b = " + b);
    }
    public static int xToY(int x, int y) {
        y = x;
        System.out.println("in the xToY class, x = " + x + " and y = " + y);
        return y;
    }
    public static void aToB(int a, int b) {
        b = a;
        System.out.println("in the aToB class, a = " + a + " and b = " + b);
    }
}

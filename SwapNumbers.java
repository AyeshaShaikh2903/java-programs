 public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5; // You can set any initial value
        int b = 10; // You can set any initial value

        System.out.println("Before swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        // Swapping without a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}
 
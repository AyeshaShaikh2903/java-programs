public class AddOne {
    public static void main(String[] args) {
        int num = 5; // we can use any integer value

        System.out.println("Original number: " + num);

        // Adding 1 using bitwise NOT and AND operators
        num = -(~num);

        System.out.println("Number after adding 1: " + num);
    }
}
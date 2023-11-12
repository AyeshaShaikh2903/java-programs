public class UppercaseToLowercase {
    public static void main(String[] args) {
        char uppercaseChar = 'A'; // we can replace this with any uppercase character

        System.out.println("Original character: " + uppercaseChar);

        // Convert uppercase to lowercase using bitwise operation
        char lowercaseChar = (char) (uppercaseChar | 32);

        System.out.println("Lowercase character: " + lowercaseChar);
    }
}
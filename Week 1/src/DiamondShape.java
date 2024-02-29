public class DiamondShape {
    public static void main(String[] args) {
        int size = 5; // Size of the diamond (number of rows in the middle)

        // Upper half of the diamond
        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the diamond
        for (int i = size - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}

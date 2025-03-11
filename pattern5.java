public class pattern5 {
    public static void main(String[] args) {
        int n = 6; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            // Print stars and spaces for hollow effect
            for (int j = 1; j <= i; j++) {
                // Print '*' at the boundary of the triangle
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Space inside the triangle
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}

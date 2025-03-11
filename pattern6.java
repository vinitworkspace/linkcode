public class pattern6 {
    public static void main(String[] args) {
        int N = 6; // Height of half-diamond

        // Upper Half
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = N - 1; i >= 1; i--) {
            for (int k = 1; k <= N - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

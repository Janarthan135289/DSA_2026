package pattern_printing;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // For reverse large to small - 8,9 whole program
        int temp=n;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= temp*2-1; j++) {

                System.out.print("*");
            }
            System.out.println();
            temp--;
        }
    }
}

package pattern_printing;

public class Pattern5 {
    public static void main(String[] args) {
        // Pattern 10
        int n = 5;
        int temp;
        for (int i = 1; i <= n * 2 - 1; i++) {
            temp = (i > n) ? (n * 2) - i   : i;
            for (int j = 1; j <= temp; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

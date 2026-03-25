package pattern_printing;

public class Pattern6 {
    public static void main(String[] args) {
        // Pattern 11
        int tempV = 0;
        for (int i = 1; i <= 5; i++) {
            tempV = (i % 2 != 0) ? 1 : 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(tempV + " ");
                tempV = (tempV == 0) ? 1 : 0;

            }

            System.out.println();
        }
    }
}

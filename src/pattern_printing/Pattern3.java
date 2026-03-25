package pattern_printing;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        // Astersik - 5
        for (int i =1; i <= n; i++) {
            for(int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Numbers - 6
        for (int i =1; i <= n; i++) {
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

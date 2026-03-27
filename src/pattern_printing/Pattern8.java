package pattern_printing;

public class Pattern8 {
    // Pattern 13
    public static void main(String[] args) {
        int n=5,temp=1;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }

        // Pattern 14 Characters
        for (int i = 1; i <= n; i++) {
            char c='a';
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
        System.out.println();


        // Pattern 15 Reverse
        for (int i = 1; i <= n; i++) {
            for(char j='A';j<='A'+n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 16 same
        char c='A';
        for (int i = 1; i <= n; i++) {

            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }
}

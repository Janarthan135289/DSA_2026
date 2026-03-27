package pattern_printing;

public class Pattern9 {
    public static void main(String[] args) {

        // Pattern 17
        int n=3;
        for (int i = 1; i <= n; i++) {
            char ch='a';
            for (int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=i*2-1;j++){
                System.out.print(ch);
                if(j<i){
                    ch++;
                }
                if(j>=i){
                    ch--;
                }

            }
            System.out.println();

        }

        // Pattern 18
        char c;
        for(int i=1;i<=n;i++){
            for(char j = (char) ('A'+(n-i)); j<='A'+n-1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

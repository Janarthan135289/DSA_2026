package pattern_printing;

public class Pattern7 {
    public static void main(String[] args) {
        // Pattern 12
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int space=1;space<=(n-i)+(n-i);space++){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}

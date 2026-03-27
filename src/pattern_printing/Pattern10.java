package pattern_printing;

public class Pattern10 {
    public static void main(String[] args) {
        // Pattern 19
        int n=5,spaces=0,temp;
        for(int i=1;i<=n*2-1;i++){
            temp=(i<=n)?i:n*2-i;
            for(int j=n-temp+1;j>=1;j--){
                System.out.print("*");
            }
            for(int space=1;space<=spaces;space++){
                System.out.print(" ");
            }
            for(int j=n-temp+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                spaces += 2;
            } else {
                spaces -= 2;
            }
        }
    }
}

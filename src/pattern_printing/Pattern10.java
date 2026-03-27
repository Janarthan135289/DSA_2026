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

        System.out.println();

        // Pattern 20
        int spaces1=n*2-2,temp1;
        for (int i = 1; i <= n*2-1 ; i++) {
            temp1=(i<n)?i:n*2-i;
            for(int j=1;j<=temp1;j++){
                System.out.print("*");
            }
            for(int space=1;space<=spaces1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=temp1;j++){
                System.out.print("*");
            }
            if(i<n){
                spaces1-=2;
            }
            else
                spaces1+=2;
            System.out.println();
        }
    }
}

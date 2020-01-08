import java.util.Scanner;

public class M3Q14b {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m=1;
        int data[][]=new int[n][n];
        for(int i=0;i<n;i++){
            if (i%2==0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(m+"\t");
                    m++;
                }
            }else {
                for (int j=n-1;j>=0;j--){
                    System.out.print(m+"\t");
                    m++;
                }
            }
            System.out.println();
        }
    }
}

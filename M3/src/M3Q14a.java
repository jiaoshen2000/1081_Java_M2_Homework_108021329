import java.util.Scanner;

public class M3Q14a {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m=1;
        int data[][]=new int[n][n];
        for(int i=0;i<n;i++){
            if (i%2==0) {
                for (int j = 0; j < n; j++) {
                    data[i][j]=m;
                    m++;
                }
            }else {
                for (int j=n-1;j>=0;j--){
                    data[i][j]=m;
                    m++;
                }
            }
        }
        for (int i1=0;i1<n;i1++){
            for (int j=0;j<n;j++){
                System.out.print(data[j][i1]+"\t");
            }
            System.out.println();}
    }
}

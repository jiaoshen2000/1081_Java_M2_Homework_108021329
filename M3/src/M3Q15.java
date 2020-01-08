import java.util.Scanner;

public class M3Q15 {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int h1=scn.nextInt(),w1=scn.nextInt();
        int h2=scn.nextInt(),w2=scn.nextInt();
        int arrA[][]=new int[h1][w1];
        int arrB[][]=new int[h2][w2];
        int arrC[][]=new int[h1][w2];
        int p=0,q=0;
        for (int i=0;i<h1;i++){
            for (int j=0;j<w1;j++){
                arrA[i][j]=scn.nextInt();
            }
        }
        for (int i=0;i<h2;i++){
            for (int j=0;j<w2;j++){
                arrB[i][j]=scn.nextInt();
            }
        }
        for (int i=0;i<h1;i++){
            for (int k=0;k<w2;k++){
                for (int j=0;j<w1;j++){
                    arrC[p][q]+=arrA[i][j]*arrB[j][k];
                }q++;
            }p++;q=0;
        }
        for (int i=0;i<h1;i++){
            for (int j=0;j<w2;j++){
                System.out.print(arrC[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class M3Q12 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int f[]=new int[n];
        int g[]=new int[m];
        for (int i=0;i<n;i++){
            f[i]=scn.nextInt();
        }
        for (int i=0;i<m;i++){
            g[i]=scn.nextInt();
        }
        int j=0,k=0,count=0;
        boolean flag=true;
        for (int i=0;i<n;i++){
            j=0;flag=true;k=0;
            while (k<i){
                if (f[i]==f[k]){
                    flag=false;
                }k++;
            }
            if (flag){
                while (j<m){
                    if (f[i]==g[j]){
                        count++;break;
                    }
                    j++;
                }
            }
        }
        System.out.println(count);
    }
}

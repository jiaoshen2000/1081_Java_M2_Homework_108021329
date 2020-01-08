import java.util.Scanner;

public class M3Q28 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(gcd(m,n));
    }
    public static int gcd(int x,int y){
        int j=Math.max(x,y);
        int k=Math.min(x,y);
        if (j%k==0){
            return k;
        }else {
            return gcd(k,j%k);
        }

        }
    }

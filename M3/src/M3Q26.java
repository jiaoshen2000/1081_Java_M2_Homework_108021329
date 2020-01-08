import java.util.Scanner;

public class M3Q26 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(power(a,n));
        System.out.println(power2(a,n));
    }
    public static int power(int x,int y){
        if (y==1){
            return x;
        }else {
            return x*power(x,y-1);
        }
    }
    public static int power2(int x,int y){
        if (y==1){
            return x;
        }else {if (y%2==0){
            return power2(x,y/2)*power2(x,y/2);
        }else {
            return x*power2(x,y-1);
        }
        }
    }
}

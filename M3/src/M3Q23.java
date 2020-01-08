import java.util.Scanner;

public class M3Q23 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        int j=0;
        for (int i=1;i<n;i++){
            if (isprim(i)){
                data[j]=i;
                j++;
            }
        }
        for (int i=2;i<j;i++){
            for (int k=i+1;k<j;k++){
                if (data[i]+data[k]==n){
                    System.out.println(data[i]+"+"+data[k]);
                }
            }
        }
    }
    public static boolean isprim(int x){
        boolean flag=true;
        int i=2;
        while (i<i/2){
            if (x%i==0){
                flag=false;
            }
            i++;
        }
        return flag;
    }
}

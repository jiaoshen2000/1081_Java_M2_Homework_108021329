import java.util.Scanner;

public class M3Q10 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        int sum=0;
        for (int i=0;i<data.length;i++){
            data[i]=scn.nextInt();
        }
        for (int i=0;i<data.length;i++){
            int tmp=1;
            for (int j=i;j<data.length;j++){
                if (tmp*data[j]<=0){
                    if (tmp>sum){
                        sum=tmp;break;
                    }else {
                        break;
                    }
                }else {
                    tmp=tmp*data[j];
                    if (tmp>sum){
                        sum=tmp;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

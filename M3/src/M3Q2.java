import java.util.Random;
import java.util.Scanner;

public class M3Q2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random rand=new Random();
        rand.setSeed(23323456);
        int[] data=new int[6];
        boolean flag=true;int i=0;
        while (i<6){
            flag=true;
            System.out.print(rand.nextInt(42)+1+",");
            for (int j=0;j<i;j++){
                if (data[i]==data[j]){
                    flag=false;break;
                }
            }
            if (flag=true){
                i++;
            }
        }
        System.out.println();
    }
}
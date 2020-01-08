import java.util.Scanner;

public class M3Q11 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String j=scn.nextLine();
        String val[]=scn.nextLine().split(" ");
        int valint[]=new int[val.length];
        for (int i=0;i<val.length;i++){
            valint[i]=Integer.valueOf(val[i]);
        }
        for (int i=0;i<valint.length;i++){
            int sum=0;String str="";
            for (int q=i;q<valint.length;q++){
                sum=valint[q]+sum;
                str=str+valint[q]+" ";
                if (sum==0){
                    System.out.print(str);
                }
            }
        }
    }
}

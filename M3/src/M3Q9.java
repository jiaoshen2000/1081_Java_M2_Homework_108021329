import java.util.Scanner;

public class M3Q9 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str[]=scn.nextLine().split(" ");
        int data[]=new int[str.length];
        for (int i=0;i<data.length;i++){
            data [i]=Integer.parseInt(str[i]);
        }
        for (int i=0;i<data.length;i++){
            for (int j=i+1;j<data.length;j++){
                if (data[i]>data[j]){
                    int tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }
}

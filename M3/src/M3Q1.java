import java.util.Scanner;

public class M3Q1 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        char[] data=scn.nextLine().toCharArray();

        //int[] data=new int[4];
//        for (int i=0;i<data.length;i++){
//            data[i]=scn.nextInt();
//        }
        //      for (int i=data.length - 1;i>=0;i--){
        //          System.out.print(data[i]+" ");
        //     }
        for (int i=str.length() - 1;i>=0;i--) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
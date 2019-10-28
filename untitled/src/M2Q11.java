import java.util.Scanner;

public class M2Q11 {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        for (int i= 1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

    }
}

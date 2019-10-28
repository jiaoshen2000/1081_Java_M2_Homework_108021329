import java.util.Scanner;

public class M2Q13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=1;
        for (int i=1;i<=n;i++){
            sum=sum*i;
        }

        System.out.println(sum);
    }
}

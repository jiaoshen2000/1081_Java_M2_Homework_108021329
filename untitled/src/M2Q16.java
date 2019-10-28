import java.util.Scanner;

public class M2Q16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            a = a*2;
            sum = sum+a;
        }
        System.out.println(sum);
    }
}

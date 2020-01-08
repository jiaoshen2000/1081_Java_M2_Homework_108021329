import java.util.Scanner;

public class M3Q4a {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int w = scn.nextInt();
        int data[][] = new int[h][w];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                data[i - 1][j - 1] = i * j;
                System.out.print(data[i - 1][j - 1] + "\t");
            }
            System.out.println();
        }
    }
    }
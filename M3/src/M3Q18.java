import java.util.Scanner;

public class M3Q18 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        for (int i = 0; i < n; i++) {
            String str[] = scn.nextLine().split(" ");
            int len = str.length;
            int data[] = new int[len];
            for (int j = 0; j < len; j++) {
                switch (str[j].charAt(0)) {
                    case 'C':
                        data[j] = 0;
                        break;
                    case 'D':
                        data[j] = 13;
                        break;
                    case 'H':
                        data[j] = 26;
                        break;
                    case 'S':
                        data[j] = 39;
                        break;
                }
                data[j] += Integer.parseInt(str[j].substring(1));
            }
            for (int i1 = 0;i1<len;i1++){
                for (int j=i1+1;j<len;j++){
                    if (data[j]<data[i1]){
                        int tmp=data[i];
                        data[j]=data[i];
                        tmp=data[j];
                    }
                    System.out.print(data[i]+"\t");
                }
            }
        }
    }
}

import java.util.Scanner;

public class yanghui {
    public static void main(String[] args) {
        System.out.println("please in put n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i<=n;i++){
            int number = 1;
            for (int j=0; j<=i; j++)
            {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1); //这尼玛谁想出来的赋值公式，好牛逼
            }
            System.out.println();
        }
    }
}

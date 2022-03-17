package FirstTest;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        System.out.println("please input a number between 0-9:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int n=100; n<999;n++){
            int a = n /100;
            int b = (n-a*100)/10;
            int c =  n%10;
            while (n%x==0 && a%x==0 && b%x==0 && c%x==0){
                System.out.println(n);
                break;
            }
        }
    }
}

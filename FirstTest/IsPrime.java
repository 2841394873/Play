package FirstTest;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println("please input a number large than 6:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i =2; i<= x/2; i++)
        {
            if(IsPrime(i)&& IsPrime(x-i)){
                System.out.println(x+":"+i +"+"+(x-i));
            }
        }
    }

    public static Boolean IsPrime(int n){
        for(int i=2 ;i<n/2; i++){
            if(n%i ==0){
                return false;
            }
        }
        return  true;
    }
}

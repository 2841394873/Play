import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {

        System.out.println("input:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x>0){
            int i;
            int sum = 1;
            int result = 0;
            for(i=1; i<=x; i++){
                sum *= i;
                result +=sum;
            }
            System.out.println("1!~"+ x+"! = " +result);
        }else {
            System.out.println("input error!");
        }
    }
}

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();

        if(x>0){
            System.out.println("y = " + String.format("%.4f", Math.exp(-x)));
        }else if(x==0){
            System.out.println("y = 1");
        }else {
            System.out.println("y = " + String.format("%.4f", (-1)*Math.exp(x)));
        }
    }
}

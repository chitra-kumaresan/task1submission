import java.util.Scanner;
public class taskfive {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int amount = obj.nextInt();
        double result=0.00;
        if (amount<500){
            System.out.println("purchase amount is "+amount);
        } else if (amount>500 && amount<1000) {
            result = amount * 0.1;
            System.out.println("purchase amount is " + (amount + result));
        }else if(amount>1000){
            result=amount*0.2;
            System.out.println("purchase amount is " + (amount + result));

        }

    }
}

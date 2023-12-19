import java.util.Scanner;
public class Taskthee{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=0;
        while (n!=0){
            a=n%10;
            System.out.print(a);
            n=n/10;

        }
    }
}

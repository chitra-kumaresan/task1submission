import java.util.Scanner;
public class taskfor {
    public static void main(String[] args) {

                Scanner obj=new Scanner(System.in);
                int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a<b && a<c){
            System.out.println("a is smallest");
        } else if (b<a && b<c) {
            System.out.println("b is smallest");
        }else
            System.out.println("c is smallest");

    }
}

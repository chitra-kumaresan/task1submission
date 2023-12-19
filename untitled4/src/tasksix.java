import java.util.Scanner;
public class tasksix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       int n = obj.nextInt();

        fillmatrix(n);
    }
public static void fillmatrix(int n){
     //  int[][]arr=new int [][];
    int[][]arr=new int[n][n];
    int temp=n;
        int count=0;
        int ltop=0;
while (count<n*n) {
    for (int i = ltop; i < arr.length ; i++) {

        arr[ltop][i] = temp;
        count++;
    }
    for (int i = arr.length-1; i >ltop; i--) {
        arr[i][ltop] = temp;
        count++;
    }
    System.out.println();
    temp--;
    ltop++;


}
printmatrix(arr);


    }
    public static void printmatrix( int[][]arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println();


        }

    }



}
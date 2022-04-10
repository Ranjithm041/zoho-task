import java.util.Scanner;
import java.lang.Math;

//Question no: 4

public class spiralpattern {
    public static void pattern(int num) {
        int size = 2*num-1;
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                System.out.print(Math.max(Math.abs(i-num),Math.abs(j-num))+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");//input no 
        int num = sc.nextInt();
        System.out.println();
        pattern(num);
    }
}

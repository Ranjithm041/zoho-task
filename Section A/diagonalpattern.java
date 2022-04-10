import java.io.*;
import java.util.Scanner;

// Question no : 1

public class diagonalpattern {

    static void isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("The String is no palindrome");
                break;
            }
            i++;
            j--;
        }

        print(str);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        isPalindrome(str);
    }
    static  void  print(String str)
    {
        int num = (str.length()/2);
        int i = 1;
        while (num>=0)
        {
            for (int j = 0;j<=num-1;j++) {
                System.out.print("  ");
            }
            System.out.print(str.charAt(num));
            for (int k = 1;k<i;k++)
            {
                   System.out.print("  ");
                    if (k == i-1 )
                        System.out.print(str.charAt(num));
            }


            System.out.println();
            i +=2;
            num--;
        }
        i = str.length()-2;
        num = str.length()-(str.length()-1);
        int row = num;

        while (num<=(str.length()/2))
        {
            for (int j = 0;j<=row-1;j++) {
                System.out.print("  ");
            }
            System.out.print(str.charAt(num));
            for (int k = 1;k<i;k++)
            {
                System.out.print("  ");
                if (k == i-1 )
                    System.out.print(str.charAt(num));
            }


            System.out.println();
            i -=2;
            row++;
            num++;
        }
    }

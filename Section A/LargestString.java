import java.util.Arrays;
import java.util.Scanner;

//3rd Question

public class LargestString {

	public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of string to be entered :");
          int count = scanner.nextInt();
      scanner.nextLine();
        for (int i = 1;i<=count;i++)
        {
            System.out.print("Enter the string"+i+":");
            String s1 = scanner.nextLine();
           char[] cha =  s1.toCharArray();
            Arrays.sort(cha);
            StringBuffer sbr = new StringBuffer(String.valueOf(cha));
            sbr.reverse();
            System.out.println(sbr);

        }

    }
}


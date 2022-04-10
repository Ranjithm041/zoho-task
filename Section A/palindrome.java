import java.util.*;

// Question no : 6

public class palindrome {
    static void strr(String str, int low, int high) {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
    }
    static int maxpalindrome(String str) {
        int n = str.length();
        int maxLength = 1, start = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
                
            }
        }
        strr(str, start, start + maxLength - 1);
        
        return  maxLength;
        // return length 
    }

    //main
    public static void main(String[] args) {
        System.out.print(maxpalindrome("madameaga"));
    }
}

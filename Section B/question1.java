import java.util.Scanner;

//Question 1   _____sec - B

public class question1 {
    public static void main(String[] args)
    {
      minimunSteps();
    }
    // dr --> dungeon row         dc ---> dungeon column
    // ar --> adventurer row      ac --> adventurer column
    // gr -->gold position row    gc --> gold position column
    public static void minimunSteps(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dimensions of the dungeon Row :");
        int dr = sc.nextInt();
        System.out.println("Enter Dimensions of the dungeon Column :");
        int dc = sc.nextInt();
        System.out.println("Enter Position of adventurer Row :");
        int ar = sc.nextInt();
        System.out.println("Enter Position of adventurer Column :");
        int ac = sc.nextInt();
        System.out.println("Enter Position of gold Row :");
        int gr = sc.nextInt();
        System.out.println("Enter Position of gold Column :");
        int gc= sc.nextInt();
        int count = 0;
        count += Math.abs(ar-gr);
        count +=Math.abs(ac-gc);
        System.out.println("Minimum number of steps: "+count);
    }
}

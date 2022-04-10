import java.util.Scanner;

////Question 2   _____sec - B

public class question2{
    public static void main(String[] args){
        minimunSteps();
    }
    // dr --> dungeon row         dc ---> dungeon column
    // ar --> adventurer row      ac --> adventurer column
    // mr --> monster row         mc --> monster column
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
        System.out.println("Enter Position of Monster Row :");
        int mr = sc.nextInt();
        System.out.println("Enter Position of monster Column :");
        int mc = sc.nextInt();
        System.out.println("Enter Position of gold Row :");
        int gr = sc.nextInt();
        System.out.println("Enter Position of gold Column :");
        int gc= sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        count1 += Math.abs(ar-gr);
        count1 +=Math.abs(ac-gc);
        count2 += Math.abs(mr-gr);
        count2 +=Math.abs(mc-gc);
        if(count1<count2){
            System.out.println("Minimum number of steps: "+count1);
        }
        else if(count1==count2){
            System.out.println("Minimum number of steps: "+count1);
        }
        else{
            System.out.println("No possible solution");
        }
    }
}
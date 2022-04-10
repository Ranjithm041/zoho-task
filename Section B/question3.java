import java.util.Scanner;


//Question 1   _____sec - B


public class question3 {
    public static void main(String[] args) {
        minimunSteps();
    }
    // dr --> dungeon row         dc ---> dungeon column
    // ar --> adventurer row      ac --> adventurer column
    // mr --> monster row         mc --> monster column
    // gr -->gold position row    gc --> gold position column
    public static void minimunSteps(){
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        int ar = sc.nextInt();
        int ac = sc.nextInt();
        int mr = sc.nextInt();
        int mc = sc.nextInt();
        int gr = sc.nextInt();
        int gc= sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        count1 += Math.abs(ar-gr);
        count1 +=Math.abs(ac-gc);
        count2 += Math.abs(mr-gr);
        count2 +=Math.abs(mc-gc);
        System.out.println(ar);
        if(count1<count2){
            System.out.println("Minimum number of steps: "+count1);
        }
        else if(count1==count2){
            System.out.println("Minimum number of steps: "+count1);
        }
        else{
            System.out.println("No possible solution ");
        }
        System.out.print("Path: "+"("+ar+","+ac+") ->");
        while (ar != gr){
            if(ar>gr){
                ar--;
            System.out.print("("+ar+","+ac+")");

            }
            else {
                ar++;
                System.out.print("("+ar+","+ac+")");

            }
        }
        while (ac !=gc){
            if(ac>gc){
                ac--;
            System.out.print("("+ar+","+ac+")");

            }
            else {
                ac++;
                System.out.print("("+ar+","+ac+")");

            }
        }
    }
}

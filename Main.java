import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = 0;
        int p = 1;
        int s = 2;


        Scanner scan = new Scanner(System.in);
        Random myRand = new Random();
        int c;
        int u;
        System.out.println("0. Rock, 2. Paper or 3. Scissors?");
u = scan.nextInt();
c = myRand.nextInt();



// storing value for the character/integer


        if (u == c) //tie
        {
            System.out.println("DRAW");
        } else if ((u == r && c == s) || (u == s && c == p) || (u == p && c == r))   // user wins
        {

            System.out.println("Congrats, WIN");

        }

        else if ((u == s && c == r) || (u == p && c == s) || (u == r && c == p))   //  user lost
        {

            System.out.println("Lost, nice try");

        }
        else {
            System.out.println("invalid try agaihn");
        }




    }
}

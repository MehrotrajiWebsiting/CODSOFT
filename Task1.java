package CODSOFT;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int number = r.nextInt(high-low) + low;
        
        Scanner ob=new Scanner(System.in);
        int attempt=10;
        System.out.println("Guess the number between 1 to 100 or Enter -1 to exit");
        int guess=ob.nextInt();
        while(attempt!=1 && guess!=number && guess!=-1){
            attempt--;
            System.out.println("Wrong guess\nRemaining attempts : "+attempt);
            System.out.println("Guess again or Enter -1 to exit");
            guess=ob.nextInt();
        }
        
        if(guess!=number) System.out.println("GAME OVER\nSCORE : 0");
        else System.out.println("CONGRATULATIONS\nSCORE : "+(10+attempt));
    }
}

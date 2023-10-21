import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        // SUBJECT ASSUMED - 5
        int marks[]=new int[5];
        int total=0;

        System.out.println("ENTER MARKS OBTAINED IN EACH SUBJECT");
        for(int i=0;i<5;i++){
            marks[i]=ob.nextInt();
            if(marks[i]>100) {
                System.out.println("WRONG INPUT");
                System.exit(0);
            }
            total+=marks[i];
        }
        
        double avg=total/5.0;

        char grade;
        if(avg<30) grade='F';
        else if(avg<40) grade='E';
        else if(avg<50) grade='D';
        else if(avg<60) grade='C';
        else if(avg<80) grade='B';
        else grade='A';

        System.out.println("RESULT");
        System.out.println("TOTAL : "+total);
        System.out.println("AVERAGE PERCENTAGE : "+avg);
        System.out.println("GRADE : "+grade);
    }
}

import java.util.Scanner;

public class Avg {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        System.out.println("You will need to input 3 numbers");
        System.out.println("What is the first number? : ");
        double a = s.nextInt();

        System.out.println("What is the Second number? : ");
        double b = s.nextInt();

        System.out.println("What is the Third number? : ");
        double c = s.nextInt();

        double avg = (a+b+c)/3;
        System.out.println("The average of the numbers are: " + avg);

    }
}

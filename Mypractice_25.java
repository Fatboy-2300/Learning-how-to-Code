import java.util.Scanner;

public class Mypractice_25 {
    public static void main(String[]arg) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter mass (m) in pounds: ");
        double mass = input.nextDouble();

        System.out.print("Enter acceleration (a) in mph: ");
        double accerleration = input.nextDouble();

        double force = mass * accerleration;

        System.out.println("force (F) = " + force + "Newtons");




    }

}


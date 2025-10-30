import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14158;

        System.out.print("Enter radius (r) in inches: ");
        double radius = input.nextDouble();

        double area = PI * radius * radius;

        System.out.println("area (a) = " + area + "sqft");

        input.close();
        



    }
}

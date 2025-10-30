import java.util.Scanner;

public class Voltage_24 {
    public static void main(String[]args) {
    
    Scanner input = new Scanner(System.in); 

    System.out.print("Enter current (I) in amps: ");
    double current =  input.nextDouble();

    System.out.print("Enter resistance (R) in ohms: ");
    double resistance = input.nextDouble();

    double voltage = current * resistance;


    System.out.println("Voltage (V) = " + voltage + "volts");



      
    }
}
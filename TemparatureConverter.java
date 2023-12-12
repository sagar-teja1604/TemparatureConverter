import java.util.*;

public class TemparatureConverter {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Temparature Converter!");
        System.out.println("Enter Temparature value:");
        double temparature = sc.nextDouble();

        System.out.println("Specify unit (C for Celsius, F for Fahrenheit):");
        char unit = sc.next().charAt(0);

        if (unit == 'C' || unit == 'c') {
            double fahrenheit = (temparature * 9 / 5) + 32;
            System.out.println(temparature + " Celsius is equal to " + fahrenheit + " Fahrenheit. ");
        } else if (unit == 'F' || unit == 'f') {
            double clesius = (temparature - 32) * 5 / 9;
            System.out.println(temparature + " Fahrenheit is equal to " + clesius + " Celsius.");
        } else {
            System.out.println("Invalid unit. Please specify either C or F.");
        }
        System.out.println("Thank you");
        sc.close();
    }
}
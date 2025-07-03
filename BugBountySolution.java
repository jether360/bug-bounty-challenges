
import java.util.Scanner;

public class test {

//Working na ni siya ayaw hilabti hashashah

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperature Analyzer");

        String[] tempStrings = new String[7];
        for (int i = 0; i < tempStrings.length; i++) {
            System.out.println("Enter temperature in Celsius for day " + (i + 1) + ":");
            tempStrings[i] = scan.nextLine();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (String t : tempStrings) {
            int temp = Integer.parseInt(t); // Correctly parse string to int
            sum += temp;
            if (temp > max) {
                max = temp;
            }
        }



        double avg = (double) sum / tempStrings.length;
        System.out.printf("Average: %.1f°C%n", avg);
        System.out.println("Hottest Day: " + max + "°C");
        scan.close();
    }

}

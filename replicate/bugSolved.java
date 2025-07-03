import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bugSolved {

    // improved version of the bug.java hehe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> temperature = new ArrayList<>();

        System.out.println("Temperature Analyzer");
        System.out.println("Enter the temperature for each day:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Day " + i + ": ");
            String input = scanner.nextLine().trim();

            int temp = Integer.parseInt(input);
            temperature.add(temp);

        }

        int sum = 0;
        
        for (int temp : temperature) {
            sum += temp;
        }

        double average = (double) sum / temperature.size();
        DecimalFormat formattedAverage = new DecimalFormat("#.00");

        System.out.println("Weekly average: " + formattedAverage.format(average) + " °C");

        int max = Collections.max(temperature);
        System.out.println("Hottest Temperature: " + max + " °C");

        scanner.close();
    }
}

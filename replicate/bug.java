import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bug {

    // just like the bug.html it accepts or stores temperature in string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> temperature = new ArrayList<>();

        System.out.println(" Temperature Analyzer");
        System.out.println("Enter the temperature for each day:");


        for (int i = 1; i <= 7; i++) {
            System.out.print("Day " + i + ": ");
            String input = scanner.nextLine().trim();

        
            temperature.add(input);
        }

        String sum = "0"; 
        String max = "-999"; 
        for (String t : temperature) {
            sum += t; 
            if (t.compareTo(max) > 0) {
                max = t; 
            }
        }

        double avg = Double.parseDouble(sum) / temperature.size(); 
        DecimalFormat formattedAverage = new DecimalFormat("#.00");

        System.out.println(" Weekly average: " + formattedAverage.format(avg) + " °C");
        System.out.println(" Hottest Day: " + max + " °C");

        scanner.close();
    }
}

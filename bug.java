import java.text.DecimalFormat;
import java.util.Scanner;

public class bug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temps = new String[7];

        System.out.println("Temperature Analyzer (with a bug)");
        System.out.println("Enter 7 daily temperature readings (°C):");

        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temps[i] = scanner.nextLine(); 
        }

        String sum = "0"; 
        String max = "-Infinity"; 
        for (String t : temps) {
            sum += t; 
            if (t.compareTo(max) > 0) {
                max = t; 
            }
        }
        double avg = Double.parseDouble(sum) / temps.length;
        DecimalFormat formattedAverage = new DecimalFormat("#.00");
        System.out.println("Weekly Average: " + formattedAverage.format(avg) + "°C ");
        System.out.println("Hottest Day: " + max + "°C ");
    }
}
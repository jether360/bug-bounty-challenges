import java.util.Scanner;

public class bugfixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temps = new double[7];

        System.out.println("Temperature Analyzer");
        System.out.println("Enter 7 daily temperature readings (°C):");
        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble(); 
        }

        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        for (double t : temps) {
            sum += t;
            if (t > max) {
                max = t;
            }
        }

        double avg = sum / temps.length;
        System.out.printf("Weekly Average: %.1f°C%n", avg);
        System.out.printf("Hottest Day: %.1f°C%n", max);
    }
}

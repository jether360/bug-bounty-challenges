import java.util.Scanner;

public class TemperatureAnalyzer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] temps = new double[7];

    System.out.println("Temperature Analyzer");
    System.out.println("Please enter the temperature in C for each of the 7 days.");

    for (int i = 0; i < 7; i++) {
      while (true) {
        System.out.print("Day " + (i + 1) + " temperature (°C): ");
        if (scanner.hasNextDouble()) {
          temps[i] = scanner.nextDouble();
          break;
        } else {
          System.out.println("Invalid input. Please enter a valid number.");
          scanner.next(); // clear the invalid input
        }
      }
    }

    double sum = 0;
    double max = Double.NEGATIVE_INFINITY;

    for (double t : temps) {
      sum += t;
      if (t > max) max = t;
    }

    double avg = sum / temps.length;

    System.out.printf("\n Weekly Average Temperature: %.1f°C\n", avg);
    System.out.printf(" Hottest Day Temperature: %.1f°C\n", max);

    scanner.close();
  }
}

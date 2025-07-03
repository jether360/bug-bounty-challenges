
import java.util.Scanner;

public class replicatedBug {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Temperature Analyzer");

        String[] tempStrings = new String[7];
        for (int i = 0; i < tempStrings.length; i++) {
            System.out.println("Enter temperature in Celsius for day " + (i + 1) + ":");
            tempStrings[i] = scan.nextLine();
        }

        java.util.List<Integer> exaggeratedTemps = new java.util.ArrayList<>();
        for (int i = 1000000; i >= 1; i /= 10) {
            for (String temp : tempStrings) {
                int exaggeratedTemp = Integer.parseInt(temp) * i;
                exaggeratedTemp = exaggeratedTemp / 7;
                exaggeratedTemps.add(exaggeratedTemp);
                sb.append(exaggeratedTemp).append(" ");
            }
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int temp : exaggeratedTemps) {
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

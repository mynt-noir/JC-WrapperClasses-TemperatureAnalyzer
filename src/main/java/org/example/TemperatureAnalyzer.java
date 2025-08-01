package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TemperatureAnalyzer {
    public static void main(String[] args) {
        // GET INPUT
        Scanner scanner = new Scanner(System.in);

        // DAY 1
        System.out.print("Enter Day 1 High Temperature (°C): ");
        String day1TempStr = scanner.next();

        // DAY 2
        System.out.print("Enter Day 2 High Temperature (°C): ");
        String day2TempStr = scanner.next();

        // DAY 3
        System.out.print("Enter Day 3 High Temperature (°C): ");
        String day3TempStr = scanner.next();


        System.out.println("--- Temperature Analysis ---\n");
        // PART 1 //
        // PARSE STRINGS TO PRIMITIVES
        double day1TempPrimitive;
        double day2TempPrimitive;
        double day3TempPrimitive;

        try {
            day1TempPrimitive = Double.parseDouble(day1TempStr);
            System.out.printf("Parsed Day 1 Temp (primitive double): %.1f\n", day1TempPrimitive);
        } catch (NumberFormatException _) {
            System.out.println("Invalid Number Format. Please input a double value for the Day 1 Temperature.");
            return;
        }

        try {
            day2TempPrimitive = Double.parseDouble(day2TempStr);
            System.out.printf("Parsed Day 2 Temp (primitive double): %.1f\n", day2TempPrimitive);
        } catch (NumberFormatException _) {
            System.out.println("Invalid Number Format. Please input a number or double value for the Day 2 Temperature.");
            return;
        }

        System.out.println();

        // PART 2 //
        // CONVERT PRIMITIVE TO DOUBLE (REFERENCE)
        Double day1TempWrapper = Double.valueOf(day1TempStr);
        Double day2TempWrapper = Double.valueOf(day2TempStr);

        // PART 3 //
        // COMPARE
        switch (day1TempWrapper.compareTo(day2TempWrapper)) {
            case 1 -> System.out.printf("Day 1 (%.1f°C) was warmer than Day 2 (%.1f°C).\n", day1TempWrapper, day2TempWrapper);
            case -1 -> System.out.printf("Day 1 (%.1f°C) was cooler than Day 2 (%.1f°C).\n", day1TempWrapper, day2TempWrapper);
            default -> System.out.printf("Day 1 (%.1f°C) and Day 2 (%.1f°C) have the same temperature.\n", day1TempWrapper, day2TempWrapper);
        }
        System.out.println();
        // PART 4
        // PRIMITIVE EXTRACTION
        float day1TempFloat = day1TempWrapper.floatValue();
        int day2TempInt = day2TempWrapper.intValue();
        System.out.printf("Day 1 Temperature (in float): %.1f°C\n", day1TempFloat);
        System.out.printf("Day 2 Temperature (in int): %d°C\n", day2TempInt);

        // PART 5
        // EXTENSION
        try {
            day3TempPrimitive = Double.parseDouble(day3TempStr);
            Double day3TempWrapper = day3TempPrimitive;
        } catch (NumberFormatException _) {
            System.out.println("Invalid Number Format. Please input a number or double value for the Day 3 Temperature.");
            return;
        }

        // COMPARE ALL
        double max_temp;
        max_temp = Math.max(day1TempPrimitive, Math.max(day2TempPrimitive, day3TempPrimitive));

        System.out.println();
        System.out.printf("The highest temperature recorded was: %.1f°C\n", max_temp);

    }
}
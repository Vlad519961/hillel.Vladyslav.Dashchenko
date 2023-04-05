package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String carBrand;

        while (count < 10) {
            System.out.print("Введіть марку авто: ");
            carBrand = scanner.nextLine();
            System.out.println(carBrand + " найкраще авто.");
            count++;
        }
    }
}




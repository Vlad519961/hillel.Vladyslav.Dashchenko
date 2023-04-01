package com.hillel.qa.java.arithmetic_operators.homework;

import java.util.Date;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * Написати програму, яка виводить на екран рік народження мого друга.
     * </p>
     *<br>
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>Створіть змінну currentYear, яка буде містити поточний рік.</li>
     *     <li>Створіть змінну friendYear, яка буде містити рік народження друга.</li>
     *     <li>Вивести в консоль "Моєму другу (число) років".</li>
     * </ul>
     */
    public static void main(String[] args) {
        int currentYear = 2024;
        int friendYear = 1996;
        System.out.println("Моєму другу"+ (currentYear - friendYear ) +"років");
    }
}

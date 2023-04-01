package com.hillel.qa.java.branching.homework;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Згадаймо математику та систему координат.
     * Необхідно написати програму в якій будуть дві зміні x, y.
     * Програма повинна казати в якій чверті знаходиться ціль згідно зміним x, y.
     * В консоль повинно виводиться - "Ціль знаходиться в (номер чверті)!",
     * врахуйте обробку якщо x, y будуть 0.
     * </p>
     */
    public static void main(String[] args) {
        double x = -3;
        double y = 2;
        String quadrant;
        if (x == 0 && y == 0) {
            quadrant = "початку координат";
        } else if (x == 0) {
            quadrant = "вісі Y";
        } else if (y == 0) {
            quadrant = "вісі X";
        } else if (x > 0 && y > 0) {
            quadrant = "першій чверті";
        } else if (x < 0 && y > 0) {
            quadrant = "другій чверті";
        } else if (x < 0 && y < 0) {
            quadrant = "третій чверті";
        } else {
            quadrant = "четвертій чверті";
        }
        System.out.println("Ціль знаходиться в " + quadrant);
    }
}



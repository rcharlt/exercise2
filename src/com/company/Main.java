package com.company;


/* Rylee Charlton, 1/23/19, exercise 2 */
public class Main {

    public static void main(String[] args) {
        int dailyHighs[] = {45, 29, 10, 22, 41, 28, 33};
        int rainChance[] = {95, 60, 25, 05, 0, 75, 90};
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i <= 6; i++) {
            if (dailyHighs[i] <= 32 && rainChance[i] > 50) {
                System.out.println("On " + day[i] + ", it is likely to snow today with a high of " + dailyHighs[i] + " and a %" + rainChance[i] + " of rain.");
            }
        }
    }
}

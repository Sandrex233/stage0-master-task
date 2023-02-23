package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30");
        } else {
            System.out.println("31");
        }
    }
}

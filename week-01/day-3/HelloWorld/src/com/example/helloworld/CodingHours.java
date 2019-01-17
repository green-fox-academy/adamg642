package com.example.helloworld;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int weeks = 17;
        int codeHours = 6;
        int workDays = 5;
        int weekEnds = 2;
        System.out.println(weeks * codeHours * (workDays + weekEnds));
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println(weeks * codeHours * (workDays));
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println(((weeks * codeHours * (workDays + weekEnds) / (double) (weeks * 52)) * 100));

        double weeks2 = 17;
        double codeHours2 = 6;
        double workDays2 = 5;
        double weekEnds2 = 2;
        System.out.println(((weeks2 * codeHours2 * (workDays2 + weekEnds2) / (weeks2 * 52)) * 100));

        float weeks3 = 17;
        float codeHours3 = 6;
        float workDays3 = 5;
        float weekEnds3 = 2;
        float res = ((weeks3 * codeHours3 * (workDays3 + weekEnds3) / (weeks3 * 52)) * 100);
        System.out.println(((weeks3 * codeHours3 * (workDays3 + weekEnds3) / (weeks3 * 52)) * 100));

        System.out.printf("%.2f",res);

    }

}

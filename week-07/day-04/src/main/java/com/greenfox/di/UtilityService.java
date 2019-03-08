package com.greenfox.di;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean validateEmail(String email) {
        char[] emailCharArr = email.toCharArray();
        boolean containSnake = false;
        boolean containDot = false;
        System.out.println("ValidateMethod Started");
        for (char ch: emailCharArr) {
            if (ch == '@') {
                containSnake = true;
                System.out.println("Find @");
            }

            if (ch == '.') {
                containDot = true;
                System.out.println("Find Dot");
            }
        }

        if (containDot && containSnake) {
            return true;
        }
        return false;
    }
}

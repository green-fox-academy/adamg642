package com.greenfox.tamagochi;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<String> trickList;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        trickList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public List<String> getTrickList() {
        return trickList;
    }

    public void addToTrickList(String trick) {
        trickList.add(trick);
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }


}

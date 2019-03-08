package com.greenfox.tamagochi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class FoxList {
    private List<Fox> foxList;

    /*FoxList() {
        this.foxList = new ArrayList<>();
    } */

    public List<Fox> getFoxList() {
        return foxList;
    }

    /*public void setFoxList(List<Fox> foxList) {
        this.foxList = foxList;
    }*/

    public void addToFoxList(Fox fox) {
        foxList.add(fox);
    }

    public void writeOutAllFoxFromList() {
        for (Fox fox:foxList) {
            System.out.println(fox.getName());

        }
        System.out.println("Somethig happen");
    }

}

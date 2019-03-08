package com.greenfox.tamagochi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {

    private List<Fox> foxList = new ArrayList<>();
    private Fox actualFox;


    @RequestMapping("/")
    public String getMainPage(@RequestParam String name , Model model) {
        System.out.println(name);
        String petFood = "";
        String petDrink = "";
        String trickListEmptyText = "";
        List<String> trickList = new ArrayList<>();
        if (actualFox.getName().isEmpty()){
             petFood = "";
             petDrink = "";
        } else if (actualFox.getName().equals("Mr.Green")){
            petFood = "Salad";
            petDrink = "Water";

        } else {
            petFood = actualFox.getFood();
            petDrink = actualFox.getDrink();
        }

        if (actualFox.getTrickList().isEmpty()) {
            trickListEmptyText = "No Trick Yet";
        }

        model.addAttribute("petName",name);
        model.addAttribute("petFood",petFood);
        model.addAttribute("petDrink",petDrink);
        model.addAttribute("trickList",trickList);
        model.addAttribute("trickListEmptyText",trickListEmptyText);
        return "index";
    }

    @RequestMapping("/login")
    public String getLoginPage() {
        return "login";
    }


    @PostMapping("/login")
    public RedirectView getLoginPagePost(@RequestParam(name = "firstname") String loggerName, Model model) {
        System.out.println(loggerName);
        String query = "/"+"?name="+loggerName;
        System.out.println(query);
        boolean makeNew = true;

        for (int i = 0; i < foxList.size() ; i++) {
            if (foxList.get(i).getName().equals(loggerName)) {
                System.out.println("Here is alredy one with this name");
                makeNew = false;
                actualFox = foxList.get(i);
            }
        }

        if (makeNew) {
           Fox foxSearched = new Fox(loggerName);
           actualFox = foxSearched;
           foxList.add(foxSearched);
        } else {

        }

        for (Fox fox: foxList) {
            System.out.println(fox.getName());
        }
        return new RedirectView(query);
    }
}

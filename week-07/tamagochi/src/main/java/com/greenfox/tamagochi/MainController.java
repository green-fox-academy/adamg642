package com.greenfox.tamagochi;

import com.sun.org.apache.xpath.internal.operations.Mod;
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
        } else {
            trickList = actualFox.getTrickList();
        }

        String petNameLinkTrick = "/trickCenter?name="+name;
        model.addAttribute("petNameLinkTrick",petNameLinkTrick);
        System.out.println(petFood+" petfood");
        String petNameLinkNut = "/nutrionStore?name="+name;
        model.addAttribute("petNameLinkNut",petNameLinkNut);
        String petNameLinkInf = "/?name="+name;
        model.addAttribute("petNameLinkInf",petNameLinkInf);
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

    @RequestMapping("/nutrionStore")
    public String getNutrionStore(@RequestParam String name,Model model) {
      /*  System.out.println("Drink Isget "+drink);
        System.out.println("Food get"+food);*/
        model.addAttribute("petName",name);
        String petNameLinkNut = "/nutrionStore?name="+name;
        model.addAttribute("petNameLinkNut",petNameLinkNut);
        String petNameLinkInf = "/?name="+name;
        model.addAttribute("petNameLinkInf",petNameLinkInf);
        String petNameLinkTrick = "/trickCenter?name="+name;
        model.addAttribute("petNameLinkTrick",petNameLinkTrick);
        System.out.println(name);
        return "nutrionStore";
    }

    @PostMapping("/nutrionStore")
    public RedirectView getNutrionStorePost( @RequestParam(name="food") String food,
                                      @RequestParam(name="drink") String drink, Model model) {
        foxList.remove(actualFox);
        actualFox.setDrink(drink);
        actualFox.setFood(food);
        foxList.add(actualFox);
        System.out.println("Drink Is "+drink);
        System.out.println("Food "+food);

        String query = "/"+"?name="+actualFox.getName();
        return new RedirectView(query);
    }

    @RequestMapping("/trickCenter")
    public String getTrickCenter(@RequestParam String name,Model model) {
        String petNameLinkNut = "/nutrionStore?name="+name;
        model.addAttribute("petNameLinkNut",petNameLinkNut);
        String petNameLinkInf = "/?name="+name;
        model.addAttribute("petNameLinkInf",petNameLinkInf);
        String petNameLinkTrick = "/trickCenter?name="+name;
        model.addAttribute("petNameLinkTrick",petNameLinkTrick);

        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public RedirectView getTrickCenterPost(@RequestParam(name="trick") String trick) {
        actualFox.addToTrickList(trick);
        foxList.remove(actualFox);
        foxList.add(actualFox);
        String query = "/trickCenter"+"?name="+actualFox.getName();
        return new RedirectView(query);
    }
}

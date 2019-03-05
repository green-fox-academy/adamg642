package com.greenfox.bankofsimba.controller;


import com.greenfox.bankofsimba.model.BankAccount;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContrrollerHome {

    List<BankAccount> animalList = new ArrayList<>();

    BankAccount bankAccount = new BankAccount("CoolName",2000,"lion");
    BankAccount bankAccount1 = new BankAccount("Simba",24000,"monkey");
    BankAccount bankAccount2 = new BankAccount("King",600,"monkey");
    BankAccount bankAccount3 = new BankAccount("Something",20500,"cat");
    BankAccount bankAccount4 = new BankAccount("Valami",1830,"lion");

    public ContrrollerHome() {
        animalList.add(bankAccount);
        animalList.add(bankAccount1);
        animalList.add(bankAccount2);
        animalList.add(bankAccount3);
        animalList.add(bankAccount4);
    }

    @RequestMapping("/show")
    public String home(Model model) {
        model.addAttribute("bankacc",bankAccount);
        return "Hello";
    }

    @RequestMapping("/do")
    public String dodo(Model model) {
        model.addAttribute("strOne","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "DoDo";
    }

    @RequestMapping("/showall")
    public String showAll(Model model) {
        model.addAttribute("bankAcc",new BankAccount());
        model.addAttribute("animalList",animalList);
        return "AnimalList";
    }

    @PostMapping("/showall")
    public String pidUserSubmit(@RequestParam(name = "searched") String myid, Model model) {
        for (BankAccount bankAcc: animalList) {
           if  (bankAcc.getName().equals(myid)) {
               if (myid.equals("King")) {
                   bankAcc.setBalancePlus(100);
               } else {
                   bankAcc.setBalancePlus(10);
               }
           }
        }

        model.addAttribute("animalList",animalList);
        System.out.println(myid);

        return "AnimalList";
    }



    @PostMapping("/showaller")
    public String greetingSubmit(@ModelAttribute BankAccount banckAcc, Model model) {

        System.out.println(banckAcc.getName());
        System.out.println(banckAcc.getBalance());
        System.out.println(banckAcc.getAnimalType());

        BankAccount thecreated = new BankAccount(banckAcc.getName(),banckAcc.getBalance(),banckAcc.getAnimalType());
        animalList.add(thecreated);
        model.addAttribute("bankAcc",new BankAccount());
        model.addAttribute("animalList",animalList);
        return "AnimalList";
    }


}

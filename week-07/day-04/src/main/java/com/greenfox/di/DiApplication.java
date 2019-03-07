package com.greenfox.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);
    }
    private SpellChecker checker;
    private Printer printer;
    private MyColor myColor;

    @Autowired
    DiApplication(SpellChecker checker, Printer printer, MyColor myColor) {
        this.checker = checker;
        this.printer = printer;
        this.myColor = myColor;
    }

   /* public static void main(String[] args) {
        SpringApplication.run(SpellcheckerApplication.class, args);
    }*/

    @Override
    public void run(String... args) throws Exception {
        checker.checkSpelling();
        printer.log("Hello World!");
        myColor.printColor();

    }


}

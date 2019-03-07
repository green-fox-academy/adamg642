package com.greenfox.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface MyColor {
    public void printColor();

}

@Service
 class MyColorz implements MyColor  {
    private Printer printer;

    @Autowired
    public MyColorz(Printer printer) {
            this.printer = printer;
        }

         public void printColor() {
            printer.log("red");
         }
}

class MyColorzBlue implements MyColor  {
    public void printColor() {

    }
}

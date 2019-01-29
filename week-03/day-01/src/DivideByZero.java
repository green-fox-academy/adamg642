import java.util.Scanner;

public class DivideByZero {


    public static void main(String[] args) {
        TenDivideBy(0);
    }

    public static void TenDivideBy (int num){


      try{
          System.out.println(10/num);
      }
      catch (  ArithmeticException e){
          System.out.println("fail");
      }


    }

}

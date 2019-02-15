package exercisethree;
import java.util.Random;

public class Orders {
    private int id;
    private String status;
    private Dish[] dishes;


    public Orders(){
        Random rand = new Random();
        int x = rand.nextInt(9000) + 1000;
        id = x;
    }

    public void delay() {
        status = "waiting";
    }

    public void deliver (){
        status = "delivered";
    }

    public void reject (){
        status = "rejected";
    }

    public Dish[] getDishes(){
        return dishes;
    }
}
package animal;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    public static void main(String[] args) {
        

    }


    public void eat(){
        hunger--;

    }

    public void drink(){
        thirst--;
    }

    public  void play(){
        hunger--;
        thirst--;
    }
}

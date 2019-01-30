package sharpie;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;


    public static void main(String[] args) {

        Sharpie sharp = new Sharpie("white",3.3f);
        
    }

    public Sharpie(String color,float width){
        this.color = color;
        this.width = width;

    }

    public void use (){
        inkAmount++;

    }

}

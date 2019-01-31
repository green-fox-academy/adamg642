package sharpie;

public class Sharpie {
    public String color;
    public float width;
    public float inkAmount = 0;


    public static void main(String[] args) {

        Sharpie sharp = new Sharpie("white",3.3f);

    }

    public Sharpie(String color,float width){
        this.color = color;
        this.width = width;

    }

    public Sharpie(String color,float width,float inkAmount){
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use (){
        inkAmount--;

    }

}

package Flyable;

public class  Helicopter implements Flyable,Printable,Comparable<Helicopter> {

    private String name;
    private String size;


    @Override
    public int compareTo(Helicopter helicopter){

        return 1;

    }

    public Helicopter (String name,String size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public void setName(String input){
        name = input;
    }

    @Override
    public void printAll() {

    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void land() {
        System.out.println("landing");
    }

    @Override
    public void takeOff() {
        System.out.println("take off");
    }
}

public class Person {

     String name;
     int age;
    public String gender;



    public Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";

    }

    public void introduce() {

        System.out.println("Hy , my name is "+name+" and "+age+"year old "+ gender);

    }

    public void getGoal () {

        System.out.println("My live is for live in the moment");
    }



}

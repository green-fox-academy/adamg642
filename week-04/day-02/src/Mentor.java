import sun.security.util.ManifestEntryVerifier;

public class Mentor extends Person {
    String level;


    public Mentor(String name,int age,String gender,String level){
        super(name,age,gender);
        this.level = level;

    }
    public Mentor(){
        super();
        this.level = "intermediate";
    }

    @Override
    public void getGoal(){
        System.out.println("Educate brilliant software devs");
    }
    @Override
    public void introduce (){
        System.out.println("Hi my name "+name+age+gender+level);
    }
}

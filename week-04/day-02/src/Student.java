public class Student extends Person {

     String  previousOrganizatin;
     int skippedDays;

    public Student(String name,int age,String gender,String previousOrganizatin){
        super(name,age,gender);

        this.previousOrganizatin = previousOrganizatin;

    }
    public Student(){
       this.previousOrganizatin = "The School of Life";
       this.skippedDays = 0;

    }

    @Override
    public void getGoal(){
        System.out.println("Became a software developer");
    }
    @Override
    public void introduce () {
        System.out.println("Hi, my name is "+name+" "+age );

    }

}

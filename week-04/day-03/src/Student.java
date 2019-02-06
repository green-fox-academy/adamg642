public class Student  extends Person implements Cloneable  {

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

    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public void getGoal(){
        System.out.println("Became a software developer");
    }
    @Override
    public void introduce () {
        System.out.println("Hi, my name is "+name+" "+age +"  " + gender+" "+previousOrganizatin+"  "+skippedDays);

    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }

}

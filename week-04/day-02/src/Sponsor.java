public class Sponsor extends Person {
    String company;
    int hiredStudents;




    public Sponsor(String name,int age,String gender,String company){
        super();
        this.company = company;
        this.hiredStudents = 0;

    }

    public Sponsor(){
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }


    @Override
    public void introduce(){
        System.out.println(name+age+gender+company+hiredStudents);

    }
    @Override
    public void getGoal(){
        System.out.println("Hire Brilliant Studens");
    }


    public void hire (){
        hiredStudents++;
    }
}

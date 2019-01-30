package teacherandstudents;

public class Student {

    public void learn (){

        System.out.println("student learning");
    }

    public void question (Teacher teacher){
        teacher.answer();
    }
}

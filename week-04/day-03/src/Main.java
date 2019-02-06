public class Main {

    public static void main(String[] args ) throws CloneNotSupportedException {
        Student jhon = new Student("Jhon",20,"male","BME");
        Student jhonTheClone = new Student();
        Student stud = new Student();



        stud = jhon;
        jhonTheClone = (Student)jhon.clone();

        jhon.age = 40;

        jhon.introduce();
        jhonTheClone.introduce();

        stud.introduce();
    }


}

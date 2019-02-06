public class Main {

    public static void main(String[] args ) throws CloneNotSupportedException {
        Student jhon = new Student("Jhon",20,"male","BME");
        Student jhonTheClone = new Student();

        jhonTheClone = (Student)jhon.clone();

        jhon.introduce();
        jhonTheClone.introduce();

    }


}

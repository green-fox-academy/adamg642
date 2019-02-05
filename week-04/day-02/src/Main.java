public class Main {


    public static void main(String[] args) {

        Person lajos = new Person("Magor",24,"male");

        lajos.getGoal();
        lajos.introduce();
        Student gergely = new Student();
        gergely.introduce();
        System.out.println(gergely.previousOrganizatin);

        Mentor hhzz = new Mentor("hhz",43,"male","intermediate");
        hhzz.introduce();
        Mentor gg = new Mentor();
        gg.introduce();

    }

}

package teacherandstudents;

public class TeacherAndStudentTask {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.teach(student);
        student.question(teacher);
    }
}

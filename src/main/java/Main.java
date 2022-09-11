import Model.Student;
import Repo.StudentDB;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aadam", "123");
        Student student2 = new Student("Eva", "456");
        Student[] students = {student1, student2}; // liegen wir die Studends in Array

        StudentDB studentDB = new StudentDB(students);
        System.out.println(studentDB);
    }
}

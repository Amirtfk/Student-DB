package Repo;

import Model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] students; // Ein Array von Studens

    // Wir erstellen dann hier ein Constructur, und der nimmt ein Array von Studenten: Student[] students
    public StudentDB(Student[] students) {
        this.students = students;
    }
    
    // Die Methode getAllStudents gibt alle Studenten alls Array zurück
    public Student[] getAllStudents(){
        return this.students;
    }


    // Die Methode toString() gibt alle Studenten formatiert als String zurück


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

package Repo;

import Model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testGetAllStudents_whenReturnAllStudents(){
        // GIVEN
        Student student1 = new Student("Aadam", "123");
        Student student2 = new Student("Eva", "456");
        Student[] students = {student1, student2};

        StudentDB studentDB = new StudentDB(students);

        // WHEN
        Student[] actual = studentDB.getAllStudents(); // Was kriegen wir von getAllStudent zurück? dann Students[]

        // THEN
        Student[] expectedStudents = {student1, student2};
        assertArrayEquals(expectedStudents, actual);
    }

    @Test
    void testToString_whenToString_returnString(){
        // GIVEN
        Student student1 = new Student("Aadam", "123");
        Student student2 = new Student("Eva", "456");
        Student[] students = {student1, student2};

        StudentDB studentDB = new StudentDB(students);

        // WHEN
        String actual = studentDB.toString();

        // THEN
        String expected = "StudentDB{students=[Student{name='Aadam', id='123'}, Student{name='Eva', id='456'}]}";
        assertEquals(expected, actual);

    }

}
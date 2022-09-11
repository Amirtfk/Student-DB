package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {

    @Test
    void testEquals_whenDiffrentStudents_returnFalse() {
        // GIVE  EXP. Zwei studenten vergleichen möchten
        Student student1 = new Student("David", "1234");
        Student student2 = new Student("Jake", "5678");

        // WHEN
        boolean actual = student1.equals(student2);

        // THEN
        assertEquals(false, actual);
    }

    @Test
    void testEquals_whenSameStudents_returnTrue() {
        // GIVE  EXP. Zwei studenten vergleichen möchten
        Student student1 = new Student("David", "1234");
        Student student2 = new Student("David ", "1234");

        // WHEN
        boolean actual = student1.equals(student2);

        // THEN
        assertEquals(true, actual);
    }

}
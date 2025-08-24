package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;
    @BeforeEach
    void init() {
        list = new StudentList();

    }


    @Test
    @DisplayName("test addNewStudent")
    void testAddNewStudent() {
        list.addNewStudent("6710405291", "A");
        assertEquals("A", list.getStudents().get(0).getName());
    }

    @Test
    @DisplayName("test addNewStudent + score")
    void testAddNewStudentAndScore() {
        list.addNewStudent("6710405291", "A",10.0);
        assertEquals("A", list.getStudents().get(0).getName());
        assertEquals(10.0, list.getStudents().get(0).getScore());
    }

    @Test
    @DisplayName("test findStudentById")
    void testFindStudentById() {
        list.addNewStudent("6710405291", "A");
        Student student = list.findStudentById("6710405291");
        assertEquals("A", student.getName());

    }

    @Test
    @DisplayName("test filterByName")
    void testFilterByName() {
        list.addNewStudent("6710405291", "A");
        list.addNewStudent("6710405292", "B");
        list.addNewStudent("6710405293", "C");
        StudentList list2 = list.filterByName("B");
        assertEquals("B", list2.getStudents().get(0).getName());

    }

    @Test
    @DisplayName("test giveScoreToId")
    void testGiveScoreToId() {
        list.addNewStudent("6710405291", "A");
        list.giveScoreToId("6710405291", 50);
        assertEquals(50, list.getStudents().get(0).getScore());

    }

    @Test
    @DisplayName("test viewGradeOfId")
    void testViewGradeOfId() {
        list.addNewStudent("6710405291", "A",100.00);
        assertEquals("A", list.viewGradeOfId("6710405291"));

    }


}
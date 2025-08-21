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
        String id = "6710405291";
        String name = "A";
        list.addNewStudent(id,name);
        assertEquals(id,list.findStudentById("6710405291").getId());
        assertEquals(name,list.findStudentById("6710405291").getName());
    }

    @Test
    @DisplayName("test addNewStudent + score")
    void testAddNewStudentAndScore() {
        String id = "6710405292";
        String name = "B";
        double score = 10.0;
        list.addNewStudent(id,name,score);
        assertEquals(id,list.findStudentById("6710405292").getId());
        assertEquals(name,list.findStudentById("6710405292").getName());
        assertEquals(score,list.findStudentById("6710405292").getScore());
    }

    @Test
    @DisplayName("test findStudentById")
    void testFindStudentById() {
        String id = "6710405293";
        String name = "C";
        double score = 10.0;
        list.addNewStudent(id,name,score);
        Student a = list.findStudentById("6710405293");
        assertEquals(a,list.findStudentById("6710405293"));
    }

    @Test
    @DisplayName("test filterByName")
    void testFilterByName() {

    }
}
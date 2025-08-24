package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource datasource;
    StudentList list;

    @BeforeEach
    void init() {
        datasource = new StudentHardCodeDatasource();
        list = datasource.readData();
    }

    @Test
    @DisplayName("test readData")
    void testReadDataSize() {
        assertEquals(4, list.getStudents().size());
    }

    @Test
    @DisplayName("test readData student one")
    void testStudentOne() {
        assertEquals("6710400001", list.getStudents().get(0).getId());
        assertEquals("First", list.getStudents().get(0).getName());
    }

    @Test
    @DisplayName("test readData student two")
    void testStudentTwo() {
        assertEquals("6710400002", list.getStudents().get(1).getId());
        assertEquals("Second", list.getStudents().get(1).getName());
    }

    @Test
    @DisplayName("test readData student three")
    void testStudentThree() {
        assertEquals("6710400003", list.getStudents().get(2).getId());
        assertEquals("Third", list.getStudents().get(2).getName());
    }

    @Test
    @DisplayName("test readData student four")
    void testStudentFour() {
        assertEquals("6710400004", list.getStudents().get(3).getId());
        assertEquals("Fourth", list.getStudents().get(3).getName());
    }

}
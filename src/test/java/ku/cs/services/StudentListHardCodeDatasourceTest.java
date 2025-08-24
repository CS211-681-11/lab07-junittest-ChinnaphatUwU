package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListHardCodeDatasourceTest {
    StudentListHardCodeDatasource datasource;
    StudentList list;

    @BeforeEach
    void init() {
        datasource = new StudentListHardCodeDatasource();
        list = datasource.readData();
    }

    @Test
    @DisplayName("test readData")
    void testReadDataSize() {
        assertEquals(10, list.getStudents().size());
    }

    @Test
    @DisplayName("test first student")
    void testFirstStudent() {
        assertEquals("6710400001", list.getStudents().get(0).getId());
        assertEquals("First", list.getStudents().get(0).getName());
    }

    @Test
    @DisplayName("test mid student")
    void testMidStudent() {
        assertEquals("6710400005", list.getStudents().get(4).getId());
        assertEquals("Fifth", list.getStudents().get(4).getName());
    }

    @Test
    @DisplayName("test last student")
    void testLastStudent() {
        assertEquals("67104000010", list.getStudents().get(9).getId());
        assertEquals("Tenth", list.getStudents().get(9).getName());
    }

}
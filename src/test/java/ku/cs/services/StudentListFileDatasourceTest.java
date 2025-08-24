package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class StudentListFileDatasourceTest {
    private static final String TEST_DATA = "test-data";
    private static final String TEST_FILE = "student-list.csv";

    StudentListFileDatasource datasource;
    @BeforeEach
    void init() {
        datasource = new StudentListFileDatasource(TEST_FILE, TEST_FILE);
        File file = new File(TEST_DATA + File.separator + TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
        datasource = new StudentListFileDatasource(TEST_DATA, TEST_FILE);
    }

    @Test
    @DisplayName("test writeAndReadData")
    void testWriteAndReadData() {
        StudentList list = new StudentList();
        list.addNewStudent("6710405291", "A", 50.00);
        list.addNewStudent("6710405292", "B", 100.00);
        datasource.writeData(list);

        StudentList readList = datasource.readData();
        assertEquals(2, readList.getStudents().size());

        Student s1 = readList.findStudentById("6710405291");
        assertEquals("A", s1.getName());
        assertEquals(50, s1.getScore());

        Student s2 = readList.findStudentById("6710405292");
        assertEquals("B", s2.getName());
        assertEquals(100, s2.getScore());
    }

}
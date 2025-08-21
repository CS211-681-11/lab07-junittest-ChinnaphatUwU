package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init() {
        s = new Student("6710405290","K");
    }


    @Test
    @DisplayName("test addScore")
    void testAddScore(){
        s.addScore(40);
        assertEquals(40,s.getScore());
    }


    @Test
    @DisplayName("test calculateGrade")
    void testCalculateGrade(){
        s.addScore(20);
        assertEquals("F",s.grade());
    }

    @Test
    @DisplayName("test changeName")
    void testChangeName() {
        s.changeName("Korn");
        assertEquals("Korn", s.getName());
    }

    @Test
    @DisplayName("test isId")
    void testIsId() {
        s.isId("6710405290");
        assertEquals(true, s.isId("6710405290"));
    }

    @Test
    @DisplayName("test nameContains")
    void testIsNameContains() {
        s.isNameContains("Korn");
        assertEquals(false,s.isNameContains("Korn"));
    }

}
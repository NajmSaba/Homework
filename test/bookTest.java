import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class bookTest {


    @Test
    public void beforeninehalfshouldsaver() {
        var b = new book();
        LocalTime t1 = LocalTime.of(8, 05, 00);
        assertEquals("3000", b.threeortwothousand(t1));
    }

    @Test
    public void betweenfoursevenhalfshouldfull() {
        var b = new book();
        LocalTime t2 = LocalTime.of(16, 45, 00);
        assertEquals("3000", b.threeortwothousand(t2));
    }

    @Test
    public void betweenninehalffourshouldfull() {
        var b = new book();
        LocalTime t3 = LocalTime.of(13, 00, 00);
        assertEquals("2000", b.threeortwothousand(t3));
    }

    @Test
    public void aftersevenhalfshouldsaver() {
        var b = new book();
        LocalTime t4 = LocalTime.of(22, 45, 00);
        assertEquals("2000", b.threeortwothousand(t4));
    }

    @Test
    public void sevenhalfshouldfull() {
        var b = new book();
        LocalTime t5 = LocalTime.of(19, 30, 00);
        assertEquals("3000", b.threeortwothousand(t5));
    }
    @Test
    public void ninehalfshouldsaver() {
        var b = new book();
        LocalTime t6 = LocalTime.of(9, 30, 00);
        assertEquals("2000", b.threeortwothousand(t6));
    }

    @Test
    public void fourshouldsaver() {
        var b = new book();
        LocalTime t5 = LocalTime.of(16, 00, 00);
        assertEquals("2000", b.threeortwothousand(t5));
    }

}
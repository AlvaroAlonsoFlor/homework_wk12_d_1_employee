import org.junit.Before;
import org.junit.Test;
import staff.Managers.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Jack", "22BB4FF4", 40000.00, 2000000.00);
    }

    @Test
    public void hasDeptName() {
        assertEquals(2000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void hasName() {
        assertEquals("Jack", director.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("22BB4FF4", director.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        director.increaseSalary(5000.00);
        assertEquals(45000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(400.00, director.payBonus(), 0.01);
    }
}

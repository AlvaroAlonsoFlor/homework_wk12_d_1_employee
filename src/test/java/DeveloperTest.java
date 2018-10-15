import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jack", "22BB4FF4", 23000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jack", developer.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("22BB4FF4", developer.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(23000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        developer.increaseSalary(5000.00);
        assertEquals(28000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(230.00, developer.payBonus(), 0.01);
    }
}

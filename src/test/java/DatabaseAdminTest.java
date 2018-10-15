import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jack", "22BB4FF4", 23000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jack", databaseAdmin.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("22BB4FF4", databaseAdmin.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(23000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        databaseAdmin.increaseSalary(5000.00);
        assertEquals(28000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(230.00, databaseAdmin.payBonus(), 0.01);
    }
}

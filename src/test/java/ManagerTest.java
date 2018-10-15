import org.junit.Before;
import org.junit.Test;
import staff.Managers.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jack", "22BB4FF4", 40000.00, "Marketing");
    }

    @Test
    public void hasDeptName() {
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void hasName() {
        assertEquals("Jack", manager.getName());
    }

    @Test
    public void changeName() {
        manager.setName("Bob");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void changeNameNull(){
        manager.setName(null);
        assertEquals("Jack", manager.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("22BB4FF4", manager.getNIN());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        manager.increaseSalary(5000.00);
        assertEquals(45000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cantDecreaseSalary() {
        manager.increaseSalary(-5000.00);
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(400.00, manager.payBonus(), 0.01);
    }
}

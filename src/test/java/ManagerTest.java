import org.junit.Before;
import staff.Managers.Manager;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jack", "22BB4FF4", 40000.00, "Marketing");
    }
}

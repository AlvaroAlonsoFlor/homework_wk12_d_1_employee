package staff.Managers;

import staff.Employee;

public class Manager extends Employee {
    String deptName;
    Manager(String name, String NIN, double salary, String deptName) {
        super(name, NIN, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

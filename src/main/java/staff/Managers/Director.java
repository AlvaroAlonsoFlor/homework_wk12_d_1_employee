package staff.Managers;

import staff.Employee;

public class Director extends Employee {
    private double budget;

    public Director(String name, String NIN, double salary, double budget) {
        super(name, NIN, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return getSalary() * 0.02 ;
    }
}

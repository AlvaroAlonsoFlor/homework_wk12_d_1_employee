package staff.Managers;

public class Director extends Manager {
    private double budget;

    public Director(String name, String NIN, double salary, String deptName, double budget) {
        super(name, NIN, salary, deptName);
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

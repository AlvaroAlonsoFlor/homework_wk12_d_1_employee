package staff;

public abstract class Employee {
    String name;
    String NIN;
    double salary;

    Employee(String name, String NIN, double salary) {
        this.name = name;
        this.NIN = NIN;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNIN() {
        return NIN;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    public double payBonus() {
        return salary * 0.01;
    }
}

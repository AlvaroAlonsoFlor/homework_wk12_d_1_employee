package staff;

public abstract class Employee {
    String name;
    String NIN;
    double salary;

    public Employee(String name, String NIN, double salary) {
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

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }

    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }

    }

    public double payBonus() {
        return salary * 0.01;
    }
}

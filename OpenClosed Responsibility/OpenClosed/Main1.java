/* Open/Closed Principle (OCP) */

public class Main1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Md Ataurrab", 150000);
        Employee employee1 = new Employee(new CalculateBonus(employee));
        System.out.println(employee1.calculateBonus());
    }
}


/* 
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}
 */

 /* so open-closed principal talks about a software entities should open for extension but not for modification.
  * so here i just detached the calculate bonus method from employee section and put it into the interface,
  so that it can not be modified by any one.
  */

interface Calculate {
    double calculateBonus();
}

class CalculateBonus implements Calculate {
    public Employee employee;

    public CalculateBonus(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double calculateBonus() {
        return employee.getSalary() * 0.1;
    }

}

class Employee {
    private String name;
    private double salary;
    private CalculateBonus calculate;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public Employee(CalculateBonus calculate) {
        this.calculate = calculate;
    }

    public double calculateBonus() {
        return calculate.calculateBonus();
    }
}

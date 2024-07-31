/* 
 * class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void printPaySlip() {
        // Code to print payslip
    }

    public void calculateBonus() {
        // Code to calculate bonus
    }
}

 */


 /* here i refactored the code to obey the rules of single responsibility principal */

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class paySlip{
    public void printPaySlip(Employee emp){
        System.out.println(emp.getName() + "\n" + emp.getSalary());
    }
}

class Bonus{
    public void calculateBonus(Employee emp){
        double bonus = emp.getSalary() + (emp.getSalary()*1.2);
        System.out.println(bonus);
    }
}
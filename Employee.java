package task6;

public class Employee {

	
    private int empId;
    private String name;
    private double salary;

    // Constructor to initialize the Employee object
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to apply a percentage raise to the salary
    public void applyRaise(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }

    // Method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + empId + "\nName: " + name + "\nSalary: $" + String.format("%.2f", salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Aparna", 50000);
        System.out.println(emp1);
        
        // Applying a 10% raise
        emp1.applyRaise(10);
        System.out.println("\nAfter Raise:");
        System.out.println(emp1);
    }
   
}

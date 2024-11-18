import java.util.Scanner;

abstract class EmployeeAbstract {
    int id;
    String name;
    int age;

    EmployeeAbstract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract double calculatePay();

    void getEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

class HourlyEmployee extends EmployeeAbstract {
    int hoursWorked;
    double hourlyRate;

    HourlyEmployee(String name, int age, int hoursWorked, double hourlyRate) {
        super(name, age);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

class SalariedEmployee extends EmployeeAbstract {
    double salary;

    SalariedEmployee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    double calculatePay() {
        return salary;
    }

    @Override
    void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hourly Employee details:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        HourlyEmployee hourlyEmployee = new HourlyEmployee(name, age, hoursWorked, hourlyRate);

        scanner.nextLine();  
        System.out.println("Enter Salaried Employee details:");
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        SalariedEmployee salariedEmployee = new SalariedEmployee(name, age, salary);

        System.out.println("\nHourly Employee Details:");
        hourlyEmployee.getEmployeeDetails();
        System.out.println("Calculated Pay: " + hourlyEmployee.calculatePay());

        System.out.println("\nSalaried Employee Details:");
        salariedEmployee.getEmployeeDetails();
        System.out.println("Calculated Pay: " + salariedEmployee.calculatePay());

        scanner.close();
    }
}

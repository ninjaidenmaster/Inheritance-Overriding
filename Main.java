import java.util.Scanner;
import java.util.InputMismatchException;

class Employee {
    double salary = 0.0;
    double calculateSalary(){
        return salary;
    }
}

class FullTimeEmployee extends Employee {
    double basePay;
    double bonus;
    @Override
    double calculateSalary(){
        return basePay + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;
    @Override
    double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Employee Type (Full or Part-Time): ");
            String type = input.nextLine();

            if (type.equals("Full")) {
                FullTimeEmployee f = new FullTimeEmployee();
                System.out.print("Enter Base Pay: ");
                f.basePay = input.nextDouble();
                System.out.println("Enter Bonus: ");
                f.bonus = input.nextDouble();
                System.out.println("Monthly Salary: " + f.calculateSalary());
            }
            else if (type.equals("Part")) {
                PartTimeEmployee p = new PartTimeEmployee();
                System.out.print("Enter hourly rate: ");
                p.hourlyRate = input.nextDouble();
                System.out.print("Enter hours worked: ");
                p.hoursWorked = input.nextDouble();
                System.out.println("Monthly Salary: " + p.calculateSalary());
            }
    } catch (Exception e) {
        System.out.println("Enter 'Full' or 'Part'");
    }
    }
}
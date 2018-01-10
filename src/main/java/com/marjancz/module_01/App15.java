package com.marjancz.module_01;

interface Employee {

    double calculateSalary();
}

class ProjectSalaryEmployee implements Employee {

    private int projectCount;
    private double projectPay;
    public ProjectSalaryEmployee(int projectCount, double projectPay) {
        this.projectCount = projectCount;
        this.projectPay = projectPay;
    }

    public double calculateSalary() {
        return this.projectCount * this.projectPay;
    }
}
class MixedSalaryEmployee implements Employee {

    private double salary;
    private int soldProjectCount;
    private double percentPremia;
    public MixedSalaryEmployee(double salary, int soldProjectCount, double percentPremia) {
        this.salary = salary;
        this.soldProjectCount = soldProjectCount;
        this.percentPremia = percentPremia;
    }

    public int getSoldProjectCount() {
        return this.soldProjectCount;
    }

    public double calculateSalary() {
        if (this.soldProjectCount > 0) {
            return this.salary + this.percentPremia * this.salary;
        } else {
            return this.salary;
        }
    }
}

abstract class SalaryPayout {

    public Employee employee;
    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout(String name);

    public String name;
    public void processPayout(String name) {
        this.name = name;
        System.out.println("Creating payout for: " + name);
        this.payout(name);
        System.out.println("The payout has been sent.");
    }
}

class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    public String name;
    protected void payout(String name) {
        this.name = name;
        if (this.name == "Igrek Iksinski") {
            System.out.println("Sending: " + this.employee.calculateSalary() + " PLN." + "\n" + "Included 20% bonus for sales of project(s).");
        } else {
            System.out.println("Sending " + this.employee.calculateSalary() + " PLN");
        }
    }
}

class App15 {
    public static void main(String args[]) throws java.lang.Exception {

        String projectEmployee1 = "Janczyk Mariusz";
        String mixedEmployee1 = "Igrek Iksinski";
        ProjectSalaryEmployee projectEmployee = new ProjectSalaryEmployee(823, 5);
        MixedSalaryEmployee mixedEmployee = new MixedSalaryEmployee(2000, 6, 0.2);
        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(mixedEmployee);
        processor.processPayout(mixedEmployee1);
    }
}

package otherstuff.employeevisitor;

public class SalaryReportVisitor implements EmployeeVisitor {
    @Override
    public void visit(FullTimeEmployee employee) {
        System.out.println("Full-Time Employee: " + employee.name);
        System.out.println("Salary: " + employee.salary);
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println("Part-Time Employee: " + employee.name);
        System.out.println("Hourly Rate: " + employee.hourlyRate);
        System.out.println("Hours Worked: " + employee.hoursWorked);
        System.out.println("Total Payment: " + (employee.hourlyRate * employee.hoursWorked));
    }
}

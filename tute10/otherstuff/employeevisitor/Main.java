package otherstuff.employeevisitor;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("John Doe", 50000);
        Employee employee2 = new PartTimeEmployee("Jane Smith", 20, 100);

        EmployeeVisitor salaryReportVisitor = new SalaryReportVisitor();

        System.out.println("Salary Report:");
        employee1.accept(salaryReportVisitor);
        employee2.accept(salaryReportVisitor);

        EmployeeVisitor performanceReportVisitor = new PerformanceReportVisitor();

        System.out.println("\nPerformance Report:");
        employee1.accept(performanceReportVisitor);
        employee2.accept(performanceReportVisitor);
    }

}

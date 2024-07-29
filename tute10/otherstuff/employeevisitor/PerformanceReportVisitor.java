package otherstuff.employeevisitor;

public class PerformanceReportVisitor implements EmployeeVisitor{
    @Override
    public void visit(FullTimeEmployee employee) {
        System.out.println("Full-Time Employee: " + employee.name);
        System.out.println("Performance: Excellent");
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println("Part-Time Employee: " + employee.name);
        System.out.println("Performance: Good");
    }
}

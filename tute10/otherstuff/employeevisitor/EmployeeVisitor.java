package otherstuff.employeevisitor;

public interface EmployeeVisitor {
    void visit(FullTimeEmployee employee);
    void visit(PartTimeEmployee employee);
}

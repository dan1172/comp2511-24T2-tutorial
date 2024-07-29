package otherstuff.employeevisitor;

public interface Employee {
    void accept(EmployeeVisitor visitor);
}

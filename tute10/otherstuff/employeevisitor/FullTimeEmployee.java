package otherstuff.employeevisitor;

class FullTimeEmployee implements Employee {
    String name;
    double salary;

    FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}

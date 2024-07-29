package otherstuff.employeevisitor;

class PartTimeEmployee implements Employee {
    String name;
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public void accept(EmployeeVisitor visitor) {
        // visitor has the functions
        //     void visit(FullTimeEmployee employee);
        //     void visit(PartTimeEmployee employee);
        visitor.visit(this); // this is of type PartTimeEmployee
    }
}
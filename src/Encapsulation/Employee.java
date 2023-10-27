public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, int age, int ssn, double salary)
    {
        super(firstName, lastName, age, ssn); 
        this.salary = salary;
    }

    public String speak()
    {
        return getFirstName() + " " + getLastName() + " $" + String.format("%.2f", salary);
    }
}

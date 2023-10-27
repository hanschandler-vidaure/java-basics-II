public class Person {
    protected int ssn;
    protected int age;
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName, int age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
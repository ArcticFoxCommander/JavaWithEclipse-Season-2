package unit4.Assignment2;

public class Faculty {
    private String firstName;
    private String lastName;
    private String rank;
    private double salary;

    public Faculty(String firstName, String lastName, String rank, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRank() {
        return rank;
    }

    public double getSalary() {
        return salary;
    }
}
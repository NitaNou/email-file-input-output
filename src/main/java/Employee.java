import java.util.Random;

public class Employee {

    private String firstName;
    private String lastName;
    private String employeeID;
    private String dept;


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID() {
        this.employeeID = generateAndSetEmployeeID();
    }

    private String generateAndSetEmployeeID() {
        String id = "";
        Random random = new Random();
        long randomNum = Math.abs(random.nextLong());
        id = String.valueOf(randomNum).substring(0,5);
        return id;
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }



    @Override
    public String toString() {
        return "Welcome, " + firstName + " " + lastName + "!";
    }
}


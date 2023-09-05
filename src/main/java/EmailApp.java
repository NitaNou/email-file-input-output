import java.util.Scanner;

public class EmailApp {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to Wonka's Employee Registration!\nPlease enter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = in.nextLine();
        Employee employee1 = new Employee(firstName, lastName);
        System.out.println(employee1);
        employee1.setEmployeeID();
        System.out.println("Your EMPLOYEE ID is: " + employee1.getEmployeeID());


        String dept = "";

        System.out.println("CURRENT DEPARTMENTS:\n 1) Chocolate\n 2) Fizzy-Lifting-Drink\n 3) Wonkavator\n 4) None ");
        System.out.println("Please select the corresponding numerical code for your department: ");
        int deptSelection = in.nextInt();
        if (deptSelection == 1) {
            dept = "Chocolate";
        } else if (deptSelection == 2) {
            dept = "Fizzy-Lifting-Drink";
        } else if (deptSelection == 3) {
            dept = "Wonkavator";
        } else {
            dept = "";
        }

        employee1.setDept(dept);

        Email email = new Email();
        email.setEmail(employee1);
        email.setPassword();
        System.out.println("Your EMAIL is: " + email.getEmail());
        System.out.println("Your PASSWORD is: " + email.getPassword());





    }
}

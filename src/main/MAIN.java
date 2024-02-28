package main;
                                         
public class MAIN {

   public static void main(String[] args) {
        // Access employee data from the EmployeeData class
        Employee[] employees = EmployeeData.getEmployees();

        // Print employee data
        for (Employee employee : employees) {
            System.out.println( " EMPLOYEE DETAILS " );
            System.out.println(employee);
        }
    }

    
}

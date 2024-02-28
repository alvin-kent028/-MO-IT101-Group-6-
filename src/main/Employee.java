package main;

public class Employee {
    private int employeeNumber;
    private final String lastName;
    private final String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;
  
 
    @SuppressWarnings("SillyAssignment")
    public Employee(int employeeNumber, String lastName, String firstName, String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagibigNumber, String status, String position, String immediateSupervisor, String jane_Smith, double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSemiMonthlyRate, double hourlyRate) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }
        
    
        //calculating hours 
        int dailyHours = 10;
        int workdaysPerWeek = 5;
        int weeklyWorkdays = dailyHours * workdaysPerWeek ;
        
        // calculating the gross weekly salary based on hours worked
        int weeklyHoursWorked = weeklyWorkdays;
    
    
    
    
    
    
    
   
    /*   // Getter and setter methods...*/
    // You can include toString() method for better printing of object details
   
    @Override
    public String toString() {
       // return "  " + employeeID + lastName + firstName + birthday + address + phoneNumber 
               // + sssNumber + philhealthNumber + tinNumber + pagibigNumber + status + position + immediateSupervisor 
               // + basicSalary + riceSubsidy + phoneAllowance + clothingAllowance + grossSemiMonthlyRate + hourlyRate + " ";
       return   
               
                "  EmployeeNumber :" + employeeNumber + ",\n" +
                "  LastName :" + lastName + ",\n" +
                "  FirstName :" + firstName + ",\n" +
                "  Birthday :" + birthday + ",\n" +
                "  Address :" + address + ",\n" +
                "  PhoneNumber :" + phoneNumber + ",\n" +
                "  SssNumber :" + sssNumber + ",\n" +
                "  philhealthNumber :" + philhealthNumber + ",\n" +
                "  TinNumber :" + tinNumber + ",\n" + 
                "  PagibigNumber:" + pagibigNumber + ",\n" +
                "  Status :" + status + ",\n" +
                "  position :" + position + ",\n" +
                "  immediateSupervisor :" + immediateSupervisor + ",\n" +
                "  basicSalary :" + basicSalary + ",\n" +
                "  riceSubsidy :" + riceSubsidy + ",\n" +
                "  phoneallowance :" + phoneAllowance + ",\n" +
                "  clothingAllowance :" + clothingAllowance + ",\n" +
                "  grossSemiMonthlyRate :" + grossSemiMonthlyRate + ",\n" +
                "  hourlyRate :" + hourlyRate + "\n" +
                 
             
       //  calculated numbers of hours employee has worked in weeks
                "  Number of Hours worked: " + weeklyWorkdays + "\n" +
                  // calculated gross weekly salary based on hours work in weeks
                "  Gross weekly Salary: " + weeklyHoursWorked * hourlyRate + "\n";     
                        
    }
}


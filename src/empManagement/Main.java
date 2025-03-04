package empManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeDaoInt employeeDaoImp = new EmployeeDaoImp();

        byte employeeId;
        byte employeeAge;
        long employeeSalary;
        byte choice;
        String employeeName;


        System.out.println("\n\t\t\t\t\t\t****************************************");
        System.out.println("\t\t\t\t\t\tWelcome to Employee management system...");
        System.out.println("\t\t\t\t\t\t****************************************\n");

        Scanner sc = new Scanner(System.in);

        do {

            //Menu for Employee Management System
            System.out.println("""
                    \t\t\t\t\t\t\t1. Add Employee
                    \t\t\t\t\t\t\t2. Show All Employee
                    \t\t\t\t\t\t\t3. Show Employee Based on E.Id
                    \t\t\t\t\t\t\t4. Update Employee Detail
                    \t\t\t\t\t\t\t5. Remove Employee
                    \t\t\t\t\t\t\t6. Close Application""");

            System.out.print("Enter your choice: ");

                    choice = sc.nextByte();

                    switch (choice) {

                        case 1:

                            Employee employee =new Employee();

                            System.out.println("Enter ID: ");
                            employeeId=sc.nextByte();
                            System.out.println("Enter Name: ");
                            employeeName =sc.next();
                            System.out.println("Enter Salary: ");
                            employeeSalary= sc.nextLong();
                            System.out.println("Enter Age: ");
                            employeeAge = sc.nextByte();

                            employee.setEmployeeId(employeeId);
                            employee.setEmployeeName(employeeName);
                            employee.setEmployeeSalary(employeeSalary);
                            employee.setEmployeeAge(employeeAge);

                            employeeDaoImp.createEmployee(employee);
                            break;

                        case 2:

                            employeeDaoImp.showEmployee();
                            break;

                        case 3:

                            System.out.println("Enter Employee Id: ");
                            employeeId =sc.nextByte();

                            employeeDaoImp.showEmployeeBasedOnId(employeeId);
                            break;

                        case 4:

                            do {
                                //Menu for Updating Employee Details
                                System.out.println("""
                    \t\t\t\t\t\t\t1. Update Employee Name
                    \t\t\t\t\t\t\t2. Update Employee Salary
                    \t\t\t\t\t\t\t3. Update Employee Age
                    \t\t\t\t\t\t\t4. Close the application""");

                                System.out.print("Enter your choice: ");

                                choice=sc.nextByte();

                                switch (choice) {

                                    case 1:

                                        System.out.println("Enter Employee Id to Update Name: ");
                                        employeeId= sc.nextByte();
                                        System.out.println("Enter New Name: ");
                                        employeeName = sc.next();

                                        employeeDaoImp.updateEmployeeName(employeeId,employeeName);
                                        break;

                                    case 2:

                                        System.out.println("Enter Employee Id to Update Salary: ");
                                        employeeId = sc.nextByte();
                                        System.out.println("Enter New Salary: ");
                                        employeeSalary = sc.nextLong();

                                        employeeDaoImp.updateEmployeeSalary(employeeId,employeeSalary);
                                        break;

                                    case 3:

                                        System.out.println("Enter Employee Id to Update Age: ");
                                        employeeId = sc.nextByte();
                                        System.out.println("Enter New Age: ");
                                        employeeAge = sc.nextByte();

                                        employeeDaoImp.updateEmployeeAge(employeeId,employeeAge);
                                        break;

                                    case 4:

                                        System.out.println("Thank you for using our application...");
                                        System.exit(0);

                                    default :

                                        System.out.println("Invalid Choice!!");
                                        break;

                                }

                            }while (true);



                        case 5:

                            System.out.println("Enter Emp.Id to delete: ");
                            employeeId = sc.nextByte();

                            employeeDaoImp.deleteEmployee(employeeId);
                            break;

                        case 6:

                            System.out.println("Thank you for using our Application..");
                            System.exit(0);

                        default:

                            System.out.println("Invalid choice!!");
                            break;

                    }

        }while (true);

    }

}

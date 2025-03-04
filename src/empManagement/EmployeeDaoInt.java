package empManagement;

public interface EmployeeDaoInt {

    //create employee
    void createEmployee(Employee employee);

    //show all employee;
    void showEmployee();

    //show employee based on id
    void showEmployeeBasedOnId(byte employeeId);

    //update employee Name
    void updateEmployeeName(byte employeeId,String employeeName);

    //update employee salary
    void updateEmployeeSalary(byte employeeId,long employeeSalary);

    //update employee age
    void updateEmployeeAge(byte employeeId,byte employeeAge);

    //delete employee
    void deleteEmployee(byte employeeId);


}

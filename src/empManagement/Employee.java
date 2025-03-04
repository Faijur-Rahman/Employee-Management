package empManagement;

public class Employee {
    private byte employeeId;
    private String employeeName;
    private long employeeSalary;
    private byte employeeAge;

    public Employee(byte id, String name, long salary, byte age) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
        this.employeeAge = age;
    }

    public Employee() {

    }

    public byte getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeAge=" + employeeAge +
                '}';
    }

    public void setEmployeeId(byte employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public byte getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(byte employeeAge) {
        this.employeeAge = employeeAge;
    }
}





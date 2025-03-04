package empManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImp implements EmployeeDaoInt{

    Connection connection;

    int result;

    @Override
    public void createEmployee(Employee emp) {

        connection = DBConnection.createDBconnection();

        String query ="insert into employee values(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setByte(1,emp.getEmployeeId());
            preparedStatement.setString(2, emp.getEmployeeName());
            preparedStatement.setLong(3,emp.getEmployeeSalary());
            preparedStatement.setByte(4, emp.getEmployeeAge());

            result = preparedStatement.executeUpdate();

            if(result!=0)
                System.out.println("Employee Inserted Successfully");

        } catch (Exception e) {
            e.printStackTrace(); //only to use in development not in production
        }


    }

    @Override
    public void showEmployee() {

         connection = DBConnection.createDBconnection();

         System.out.print("***********************\n");
         System.out.print("****Employee-Details***\n");
         System.out.print("***********************\n");
         System.out.format("%s\t%s\t%s\t%s\n","ID","NAME","SALARY","AGE");
         System.out.print("-----------------------\n");

         String query = "select * from employee";

         try {

             Statement statement = connection.createStatement();
             ResultSet resultSet=statement.executeQuery(query);

             while (resultSet.next()) {
                 System.out.format("%d\t%s\t%d\t%d\n",
                         resultSet.getByte(1),
                         resultSet.getString(2),
                         resultSet.getLong(3),
                         resultSet.getByte(4));

             }System.out.print("-----------------------\n");

         } catch (Exception e){
             e.printStackTrace(); //only to use in development not in production
         }

    }

    @Override
    public void showEmployeeBasedOnId(byte employeeId) {

        connection = DBConnection.createDBconnection();

        System.out.print("***********************\n");
        System.out.print("****Employee-List******\n");
        System.out.print("***********************\n");
        System.out.format("%s\t%s\t%s\t%s\n","ID","NAME","SALARY","AGE");
        System.out.print("-----------------------\n");

        String query = "select * from employee where id=" + employeeId;

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.format("%d\t%s\t%d\t%d\n",
                        resultSet.getByte(1),
                        resultSet.getString(2),
                        resultSet.getLong(3),
                        resultSet.getByte(4));

            }System.out.print("-----------------------\n");


        } catch (Exception e) {
            e.printStackTrace(); //only to use in development not in production
        }


    }



    @Override
    public void updateEmployeeName(byte employeeId, String employeeName) {

        connection = DBConnection.createDBconnection();

        String query = "update employee set name=? where id=?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,employeeName);
            preparedStatement.setByte(2,employeeId);

            result = preparedStatement.executeUpdate();

            if (result!=0)
                System.out.println("Employee Updated Successfully...\n");

        } catch (Exception e) {
            e.printStackTrace(); //only to use in development not in production
        }


    }

    @Override
    public void updateEmployeeSalary(byte employeeId, long employeeSalary) {

        connection = DBConnection.createDBconnection();

        String query = "update employee set salary=? where id=?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1,employeeSalary);
            preparedStatement.setByte(2,employeeId);

            result = preparedStatement.executeUpdate();

            if (result!=0)
                System.out.println("Employee Updated Successfully...\n");

        } catch (Exception e) {
            e.printStackTrace(); //only to use in development not in production
        }

    }

    @Override
    public void updateEmployeeAge(byte employeeId, byte employeeAge) {

        connection = DBConnection.createDBconnection();

        String query = "update employee set age=? where id=?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setByte(1,employeeAge);
            preparedStatement.setByte(2,employeeId);

            result = preparedStatement.executeUpdate();

            if (result!=0)
                System.out.println("Employee Updated Successfully...\n");

        } catch (Exception e) {
            e.printStackTrace(); //only to use in development not in production
        }

    }

    @Override
    public void deleteEmployee(byte employeeId) {

        connection = DBConnection.createDBconnection();

        String query = "delete from employee where id=?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setByte(1,employeeId);

            result = preparedStatement.executeUpdate();

            if (result!=0)
                System.out.println("Employee Deleted Successfully...\n");

        } catch (Exception e) {
            e.printStackTrace(); //only to use in development not in production
        }

    }
}

package com.harman.sample;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.util.Scanner;

public class Create {

    public static void main(String[] args) {

        try{

            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false","root","");

            String empname,empcode,desig,salary,mobile;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Employee Code: ");
            empcode = input.next();
            System.out.println("Enter Employee Name: ");
            empname = input.next();
            System.out.println("Enter Designation: ");
            desig = input.next();
            System.out.println("Enter Salary: ");
            salary = input.next();
            System.out.println("Enter Mobile Number: ");
            mobile = input.next();
            Statement s = (Statement) c.createStatement();
            s.executeUpdate("INSERT INTO `employees`(`Emp_Code`, `Emp_Name`, `Designation`, `Salary`, `MobileNo`) " +
                    "VALUES("+empcode+",'"+empname+"','"+desig+"',"+salary+","+mobile+")");
            System.out.println("Inserted Successfully");

        }
        catch(Exception e){
            System.out.println(e);
        }



    }
}

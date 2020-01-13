package streamemployee;

import streamemployee.StreamEmployee;
import java.io.IOException;
import java.util.*;

// display of the class StreamEmployee
public class Display {
    
    public static void main(String[] args) throws IOException {
        
        // Starting the Employees array 
        StreamEmployee[] employees = {
            new StreamEmployee("Guilherme", "Porto", 1100, "IT"),
            new StreamEmployee("John", "Cash", 2500, "Sales"),
            new StreamEmployee("Richard", "Red", 1500, "Biology"),
            new StreamEmployee("William", "Junior", 3500, "Biomedicine"),
            new StreamEmployee("Bjorn", "Ironside", 1300, "BioChemistry"),
            new StreamEmployee("Anna", "Claire", 2300, "mister"),
            new StreamEmployee("Bruce", "Wayne", 8500, "Boss"),
            new StreamEmployee("Jonathan", "Viktor", 7400, "Businessman")};
        
        // get the displaying list of the employee
        List<StreamEmployee> list = Arrays.asList(employees);
        
        // display all the Employees
        System.out.println("Complete Employee list:");
        System.out.printf("%-10s %-10s %6s  %15s%n", "Name", "LastName", "Salary", 
                "Department");
        list.stream().forEach(System.out::println);
    }
} //End of class Display
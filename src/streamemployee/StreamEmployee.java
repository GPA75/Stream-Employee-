package streamemployee;

import java.io.IOException;

// superclass Employee (display Name, lastName, salary and department)
public class StreamEmployee {
    
    private String Name;
    private String LastName;
    private double Salary;
    private String Department;
    
    /*
    Constructor
    */
    public StreamEmployee(String Name, String LastName, double Salary,
            String Department) throws IOException {
        
        this.Name = Name;
        this.LastName = LastName;
        this.Salary = Salary;
        this.Department = Department;
    }
    
    // setting Name
    public void setName(String Name) {
        
        this.Name = Name;
    }
    
    // get Name
    public String getName() {
        return Name;
    }
    
    // setting LastName
    public void setLastName(String LastName) {
        
        this.LastName = LastName;
    }
    
    //get LastName
    public String getLastName(){
        return LastName;
    }
    
    //setting Salary
    public void setSalary(double Salary) {
        
        this.Salary = Salary;
    }
    
    //get Salary
    public double getSalary() {
        return Salary;
    }
    
    //setting Depatment
    public void setDepartment(String Department) {
        
        this.Department = Department;
    }
    
    //get Department
    public String getDepartment() {
        return Department;
    }
    
    // return the Name and LastName of combined employee
    public String getCombined() {
        
        return String.format("%s %s", getName(), getLastName());
    }
    
    @Override // return one String content employee of information
    public String toString() {
        
        return String.format("%-10s %-10s R$%,8.2f   %s",
                getName(), getLastName(), getSalary(), getDepartment());
    } // End of method toString()
} // End of class StreamEmployee
package Lab3HW;

import java.util.*;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;
    private List employeeName;
    private List employees;
    
//    public Employee(){
//        //May attempt to use this
////        employeeName = new ArrayList();
////            employeeName.add("John Doe");
////            employeeName.add("Mary Hill");
////            employeeName.add("Rose Flower");
//        
//        employeesSSN = new ArrayList();
//            employeesSSN.add("111-11-1111");
//            employeesSSN.add("222-22-2222");
//            employeesSSN.add("333-33-3333");
//            employeesSSN.add("222-22-2222");
//    }
//    
    public void addEmployee(String newEmployee){
        employees.add((String)newEmployee);
    }
    
    public void removeEmployee(String remEmployee){
        employees.remove((String)remEmployee);
    }

    public Employee(String firstName, String lastName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List getEmployees() {
        return employees;
    }

    public void setEmployees(List employees) {
        this.employees = employees;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName + " " +  lastName + " - " + "SSN: " + ssn;
    }
    
    


    
}

package Lab3HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
        Employee employee1 = new Employee("Mark", "Weber", "111-11-1111");
        Employee employee2 = new Employee("John", "Doe", "222-22-2222");
        Employee employee3 = new Employee("No","Name","333-33-3333");
        Employee employee4 = new Employee("Mary", "Doe", "222-22-2222");
        List employees = new ArrayList();
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
            employees.add(employee4);
        System.out.println("Size of list");
        System.out.println(employees.size());
        System.out.println("Testing employee2 to employee4");
        if(employee2.equals(employee4)){
            System.out.println("These are the same people!");
        }else{
            System.out.println("These aren't the same people!");
        }
        System.out.println("Employee2's stats");
        System.out.println(employee2.toString());
        System.out.println("Employee4's stats");
        System.out.println(employee4.toString());
        System.out.println(employees);
        System.out.println("Now to test the loop!");
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i));
        }
        System.out.println("Testing lastIdexOf");
        System.out.println(employees.lastIndexOf(employees.get(2)));
        System.out.println("Removing employee 4");
        employees.remove(3);
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i));
        }
        
    }
}

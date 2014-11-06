/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import common.Employee;
import java.util.*;

/**
 *
 * @author Matthew
 */
public class Demo1 {
    public static void main(String[] args) {
//        int x = 5;
//        Integer i = new Integer(5);
        
        //Old Technique
//        List shoppingList = new ArrayList();
//        shoppingList.add("Beer");
//        shoppingList.add("Candy");
//        shoppingList.add("Candy");
//        
//        String s = (String)shoppingList.get(1);
//        
//        for(int i = 0; i < shoppingList.size(); i++){
//            System.out.println(shoppingList.get(i));
//        }
        
        //New Technique
        List<String> shoppingList = new ArrayList</*String(Optional)*/>();
        shoppingList.add("Beer");
        shoppingList.add("Candy");
        shoppingList.add("Candy");
        shoppingList.remove("Candy");
        
        String s = shoppingList.get(1);
        
        for(String item : shoppingList){
            System.out.println(item);
        }
        
        //sTUFF FOR EXAMPLE IN CLASS WITH COMMON PACKAGE
        Employee e1 = new Employee("Jones", "Sally", "333-33-3333");
        Employee e2 = new Employee("Jones", "Sally", "333-33-3333");
        if(e1.equals(e2)){
            System.out.println("They are equal.");
        }else{
            System.out.println("They aren't equal.");
        }
        
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        
        Set<Employee> dupes = new HashSet<>(employees);
        employees = new ArrayList<>(dupes);
        for(Employee e : employees){
            System.out.println(e.getLastName());
        }
//        Set<Employee> employees = new HashSet<>();
//        employees.add(e1);
//        employees.add(e2);
//        
//        for(Employee e : employees){
//            System.out.println(e.getLastName());
//        }
    }
}

package com.DSA;

import java.util.ArrayList;
import java.util.List;

public class array_List {
    public static void main(String[] args) {

        List<Employee> list_employee = new ArrayList<>();
        list_employee.add(new Employee(" "," ",0));
        list_employee.add(new Employee("2nd Employee","2nd",2));
        list_employee.add(new Employee("3rd","3rd",3));
        list_employee.add(new Employee("4th","4th",4));
        list_employee.add(new Employee("arr","ay",12334));


       list_employee.forEach(employee -> System.out.println(employee));
        list_employee.set(3 , new Employee("New","Employee",333));
        Employee a = list_employee.get(4);
        System.out.println(list_employee.get(3));
        System.out.println(a);


    }
}

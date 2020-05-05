/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toarray_method;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Employee {

    String name;
    int id;
    String position;

    Employee(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public String toString() {
        return "[ name = " + name + ", id = " + id + ", position =" + position + " ]";
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Amit", 1, "Platform developer"));
        list.add(new Employee("Ajinkya", 2, "Platform developer"));
        list.add(new Employee("Kshitij", 3, "Platform developer"));
        list.add(new Employee("Mrunal", 4, "Platform developer"));
        Employee[] emps = list.stream().toArray(Employee[]::new);
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }

}

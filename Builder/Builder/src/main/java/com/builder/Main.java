package com.builder;

import com.builder.Domain.Address;
import com.builder.Domain.Contact;
import com.builder.Domain.Employee;
import com.builder.Domain.Phone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee =  new Employee.EmployeeBuilder()
                .setAge(Integer.parseInt("22"))
                .setName("Andres Felipe")
                .setGender("Maculino")
                .setAddress(new Address("calle -4", "Abrego","Colombia", "78954"))
                .setPhone(new Phone("1234565","+57","Celular"))
                .setPhone("77777777",null,"Fijo")
                .setContact(new Contact("Alejandro",
                        new Phone("123234565","+57","Fijo"),
                        new Address("calle 25", "Ocaña","Colombia", "55555")))
                .setContact(new Contact("Maria",
                        new Phone("56894235","+58","Celular"),
                        new Address("Corregimiento","La Paz","España","8954521")))
                .build();

        System.out.println("employee = " + employee);
    }
}
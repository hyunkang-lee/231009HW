package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO ep = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        System.out.print("id number : ");
        int number = sc.nextInt();

        System.out.print("name : ");
        String name = sc.next();

        System.out.print("dept : ");
        String dept = sc.next();

        System.out.print("job : ");
        String job = sc.next();

        System.out.print("age : ");
        int age = sc.nextInt();

        System.out.print("gender : ");
        char gender = sc.next().charAt(0);

        System.out.print("salary : ");
        int salary = sc.nextInt();

        System.out.print("bonusPoint : ");
        double bonusPoint = sc.nextDouble();

        System.out.print("phone : ");
        String phone = sc.next();

        System.out.print("address : ");
        String address = sc.next();

        ep.setNumber(number);
        ep.setName(name);
        ep.setDept(dept);
        ep.setJob(job);
        ep.setAge(age);
        ep.setGender(gender);
        ep.setSalary(salary);
        ep.setBonusPoint(bonusPoint);
        ep.setPhone(phone);
        ep.setAddress(address);

        System.out.println(ep.getInformation());
    }
}
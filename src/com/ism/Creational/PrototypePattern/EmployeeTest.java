package com.ism.CreationalDesignPattern.PrototypePattern;

import java.util.List;

/**
 * Created by YOUK on 2017-03-30.
 */
public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employees emp = new Employees();
        emp.loadData();

        Employees empNew = (Employees) emp.clone();
        Employees empNew2 = (Employees) emp.clone();
        List<String> list = empNew.getEmpList();

    }
}

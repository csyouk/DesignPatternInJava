package com.ism.CreationalDesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YOUK on 2017-03-30.
 */
public class Employees implements Cloneable {
    private List<String> empList;

    public Employees(){
        empList = new ArrayList<>();
    }

    public Employees(List<String> list){
        this.empList = list;
    }

    public void loadData(){
        this.empList.add("cs");
        this.empList.add("yj");
        this.empList.add("ss");
        this.empList.add("yu");
    }

    public List<String> getEmpList(){
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}

package com.ism.SOLID.SPR;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by YOUK on 2017-03-26.
 */
class Student {

    private List<ToDo> doingList;
    public Student(){
        this.doingList = new LinkedList<ToDo>();
        this.doingList.add(new StudentToDo());
        this.doingList.add(new EmployeeToDo());
    }

    public void doingSomething(){
        for (ToDo todo : this.doingList){
            todo.doingSomething();
        }
    }

    public static void main(String[] args){
        Student student = new Student();
        student.doingSomething();
    }

}
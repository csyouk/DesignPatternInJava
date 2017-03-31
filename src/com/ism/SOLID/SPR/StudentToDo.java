package com.ism.SOLID.SPR;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by YOUK on 2017-03-26.
 */
public class StudentToDo implements ToDo{

    @Override
    public void doingSomething(){
        System.out.println("study at school");
    }

}

class EmployeeToDo implements ToDo {
    @Override
    public void doingSomething(){
        System.out.println("work at company");
    }
}


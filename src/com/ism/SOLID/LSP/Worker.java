package com.ism.SOLID.LSP;

/**
 * Created by YOUK on 2017-03-26.
 * LSP란 상위형 P가 있고, 이걸 확장하는 하위형 C가 있을 때,
 * P는 C로 치환할 수 있어야 한다.
 */
public class Worker {

    public boolean checkRectIs20(Rectangle rec){
        return rec.getArea() == 20;
    }

    public void someWork() {
        Rectangle rec = new Square();
        rec.setHeight(5);
        rec.setWidth(4);
        if(!this.checkRectIs20(rec)){
            System.out.println("sth wrong");
        }
    }

    public static void main(String[] args){
        Worker wk = new Worker();
        wk.someWork();
    }
}

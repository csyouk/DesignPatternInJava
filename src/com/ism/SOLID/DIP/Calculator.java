package com.ism.SOLID.DIP;

/**
 * Created by YOUK on 2017-03-26.
 * 상위 모듈이 하위 모듈에 의존하면 안된다. 둘 다 추상화에 의존해야 한다.
 * 추상화된 것이 구체적인 것에 의존하면 안된다. 구체적인 것이 추상화에 의존해야 한다.
 * https://trazy.gitbooks.io/oop/content/oop-dip.html
 */
public class Calculator {

    private IAdder adder;

    public Calculator(IAdder adder){
        this.adder = adder;
    }

    public double add(double addend, double augend){
        return this.adder.add(addend, augend);
    }

    public static void main(String[] args){
//        Calculator cal = new Calculator();
//        System.out.println(String.format("1 + 2 = %f", cal.add(1, 2)));
        IAdder adder = AdderFactory.create(AdderFactory.AdderType.NORMAL);
        Calculator cal = new Calculator(adder);
        System.out.println(String.format("1 + 2 = %f", cal.add(1, 2)));
    }

}

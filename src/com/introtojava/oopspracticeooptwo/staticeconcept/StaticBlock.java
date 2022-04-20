package com.introtojava.oopspracticeooptwo.staticeconcept;

//this is a demo to show initialization of static variables
public class StaticBlock {
    //as soon as the class all static elements are run first
    static int a = 7;
    static int b;


    //will only run once when the first object is created
    //i.e. when the class is loaded for the first time
    static {
        System.out.println("im in static block");
        b = a*3-1;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 5;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}

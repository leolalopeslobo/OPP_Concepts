package com.introtojava.oopspracticeooptwo.staticeconcept;

public class InnerClasses {
    class A {
        String name;

        public A(String name) {
            this.name = name;
        }

    }


    //declaring class to show the toString method
    static class T {
        String onword;

        public T(String singleword) {
            onword = singleword;
        }

        public String toString() {
            return onword;
        }
    }

    public static void main(String[] args) {
//        A a = new A("khloe"); // -> error: since this class is dependent on another class
//        A b = new A("kylie");

        //the above issue can be resolved if we make the inner class 'static'


        T tostringm = new T("toString-method");

        System.out.println(tostringm);
    }
}


//Outside classes cannot be static
/*
Since it is not itself dependent on any other class
 */
//Only inner classes can be class
/*
but inner classes are dependent on the outer class hence it needs to be static
 */

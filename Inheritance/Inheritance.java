package a0_git;

class Parent{
    int a = 20;
    int b = 30;
    Parent(int a, int b){
        System.out.println("this is parent default constructor");
    }
}
class Child extends Parent{
    int x = super.a;
    int y = super.b;
    Child(){
        super(10,20);
        System.out.println("this is child default constructor "+ (x+y));

    }
}

public class Inheritance {
    public static void main(String[]args){
        Child obj = new Child();
    }
}
/*
1. inside main child constructor is called,
2. inside child constructor it finds "super()" with int parameter , which called parent constructor
3.after executing parent constructor, program returns to child & performs function;

NOTE- to access any detail of parent, super() method is used
 */
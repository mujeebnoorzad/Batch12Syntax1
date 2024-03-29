package com.class21;

public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends Parent1{
    String name="Child";
    void printName(){
        String name="Teyfuring"; // firs priority is given to local variables
        System.out.println(name);
        /*when we use the "this" keyword even though we have a local variable
        java will only bring the values from instance variables
        * */
        System.out.println(this.name);
        /*when we use the "super" keyword even though we have a local variable
        and instance varibales inside the same class
        java will only bring the values from parent class instance variables
        * */
        System.out.println(super.name);
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();
    }

}

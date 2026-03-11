package java_core;

class sample3 {
    void show() {
        System.out.println("This is the parent class");
    }
}
class demo31 extends sample3 {
    void display() {
        System.out.println("This is child1 class");
    }
}
class test3 extends sample3 {
    void print() {
        System.out.println("This is child2 class");
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
        demo31 d1 = new demo31();
        d1.show();
        d1.display();

        test3 t1 = new test3();
        t1.show();
        t1.print();
    }
}

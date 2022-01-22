public class SuperMethod {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        System.out.println("############");

        B objbb = new B(1);

    }
}

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in int A");
    }
}

class B extends A {
    public B() {
        System.out.println("in B");
    }

    public B(int i) {
        super(i);
        System.out.println("in int B");
    }
}
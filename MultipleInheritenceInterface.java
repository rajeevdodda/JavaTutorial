public class MultipleInheritenceInterface {
    public static void main(String[] args) {
        InheritanceDemoImp obj = new InheritanceDemoImp();
        obj.show();
        InheritanceDemo.staticShow();
    }
}

interface InheritanceDemo {
    void abc();

    int i = 8;

    default void show() {
        System.out.println("Inside InheritanceDemo");
    }

    static void staticShow() {
        System.out.println("Inside InheritanceDemo static method");

    }
}

interface InheritanceDemo2 {
    default void show() {
        System.out.println("Inside InheritanceDemo2");
    }
}

class InheritanceDemoImp implements InheritanceDemo, InheritanceDemo2 {
    public void abc() {

    }

    // public void show() {
    // System.out.println("Inside InheritanceDemoImp");
    // }

    @Override
    public void show() {
        InheritanceDemo.super.show();
        InheritanceDemo2.super.show();
    }
}
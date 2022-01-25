/*
* 1.8 can define methods in interface
*/

public class InterfaceDefaultMethod {
    public static void main(String args[]) {
        InterfaceDefaultMethodDemo demo = new DemoImp();
        demo.abc();
        demo.show();
    }
}

@FunctionalInterface
interface InterfaceDefaultMethodDemo {
    void abc(); // One abstract method

    default void show() {
        System.out.println("In show");
    } // can be overridded
}

class DemoImp implements InterfaceDefaultMethodDemo {
    public void abc() {
        System.out.println("In demo");

    }
}

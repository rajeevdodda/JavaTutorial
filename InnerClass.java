public class InnerClass {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.show();

        Outer.Inner inner = outer.new Inner();
        inner.display();

        Outer.StaticInner innerStatic = new Outer.StaticInner();
        innerStatic.display();

    }

}

class Outer {
    int a;

    public void show() {
        System.out.println("Inside Outer show method");
    }

    class Inner {
        public void display() {
            System.out.println("Inside Inner display method");
        }
    }

    static class StaticInner {
        public void display() {
            System.out.println("Inside Inner display method");
        }
    }
}

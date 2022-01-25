public class AnonymousInnerClass {
    public static void main(String args[]) {
        AnonymousInnerClassA obj = new AnonymousInnerClassA() {
            public void show() {
                System.out.println("Im the best");
            } // Anonymous class
        };

        obj.show();

        ABCInterface abc = new ABCInterface() {
            public void show() {
                System.out.println("In abstract anonymous class");
            };
        };
        abc.show();
    }
}

class AnonymousInnerClassA {
    public void show() {
        System.out.println("In A Show");
    }
}

interface ABCInterface {
    void show();
}
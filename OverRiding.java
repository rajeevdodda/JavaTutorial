public class OverRiding {
    public static void main(String args[]) {
        OverRidingB objB = new OverRidingB();
        objB.show();

        OverRidingA refA = new OverRidingB(); // run time polymorphishm
        refA.show();
        // refA.config(); error

        refA = new OverRidingC();
        refA.show(); // Dynamic method dispatch

    }
}

class OverRidingA {
    public void show() {
        System.out.println("In OverRiding A");
    }
}

class OverRidingB extends OverRidingA {
    @Override
    public void show() {
        // super.show();
        System.out.println("In OverRiding B");
    }

    public void config() {
        System.out.println("In OverRiding B Config ");
    }
}

class OverRidingC extends OverRidingA {
    @Override
    public void show() {
        System.out.println("In OverRiding C");
    }
}
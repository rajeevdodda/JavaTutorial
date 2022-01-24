public class Final {

    public static void main(String args[]) {
        FinalA obj = new FinalA();
        System.out.println(obj.DAY);
    }
}

class FinalA {
    final int i;
    final int DAY = 0;

    public FinalA() {
        // DAY = 10; The final field FinalA.DAY cannot be assigned
        i = 0;

    }

    public final void show() {
        System.out.println("A show");
    }
}

final class FinalB {
    public void show() {
        System.out.println("B show");
    }

}

// class FinalBB extends FinalB {

// } The type FinalBB cannot subclass the final class FinalB

class FinalAA extends FinalA {

    // public void show() {
    // System.out.println("A show");
    // } Cannot override the final method from FinalA
}

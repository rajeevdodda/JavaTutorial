
interface Writer {
    void write(); // by default public abstract

    abstract public void show();
}

class Pen implements Writer {
    public void write() {
        System.out.println("Pen Writing");
    }

    public void show() {
        System.out.println("Pen Showing");
    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("Pencil Writing");
    }

    public void show() {
        System.out.println("Pencil Showing");
    }
}

class Kit {
    public void doSomething(Writer writer) {
        writer.show();
    }
}

public class Interface {
    public static void main(String args[]) {
        Writer pen = new Pen();
        Writer pencil = new Pen();

        Kit kit = new Kit();
        kit.doSomething(pen);
        kit.doSomething(pencil);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        DEF obj = new DEF();
        obj.display();
        obj.show();

    }
}

class ABC {
    public void show() {
        System.out.println("In ABC");
    }
}

class DEF extends ABC {
    public void display() {
        System.out.println("In DEF");
    }
}
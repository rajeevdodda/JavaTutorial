public class MethodOverLoading {
    public static void main(String args[]) {
        Casio casio = new Casio();
        casio.add(1.1, 7);

    }

}

class Casio {
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    public void add(double i, int j) {
        System.out.println(i + j);
    }
}
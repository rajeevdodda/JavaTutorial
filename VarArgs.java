public class VarArgs {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(10, 11));
        System.out.println(obj.add(10, 11, 19));
    }

}

class Calc {
    public int add(int i, int j) {
        return i + j;
    }

    public int add(int... n) { // array
        System.out.println(n);
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        ;
        return sum;
    }
}

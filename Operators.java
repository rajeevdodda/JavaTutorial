public class Operators {
    /*
     * Arithmetic +, -, *, /, %
     * Bitwise
     * Relational
     * Logical
     */
    public static void main(String args[]) {
        int m, n;
        m = 6;
        n = 4;
        int r1 = m + n; // 8
        int r2 = m - n; // 4
        int r3 = m * n; // 12
        int r4 = m / n; // 3
        double r5 = (double) (m / n);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(6 / 4); // 1
        System.out.println(r5); // 1

        n = +m; // n = n + m
        n++; // n += 1 post increment
        n--; // n = n - 1 post decrement

        --n; // pre decrement
        ++n; // pre increment
    }
}
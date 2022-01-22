public class EnhancedForLoop {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        for (int k : a) {
            System.out.println(k);
        }

        int b[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int k[] : b) {
            for (int j : k) {
                System.out.println(j);
            }

        }
        ;
    }

}

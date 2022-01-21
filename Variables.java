public class Variables {
    public static void main(String args[]) {
        int i = 500000; // 4 bytes -> 32 bit
        long l = 5000000000l; // 8 bytes -> 64 bits
        short s = 1234; // 2 bytes -> 16 bits
        byte b = 8; // 1 byte -> 8 bits
        double d = 5.5;
        float f = 5.5f;

        char c = 'A';
        c = 66;

        System.out.println(c);

        double d1 = 5; // implicit conversion to 5.0
        System.out.println(d1);

        int k = (int) 5.6; // explicit type conversion
        System.out.println(k);

    }

}

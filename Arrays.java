import java.security.SecureRandomParameters;

public class Arrays {

    public static void main(String args[]) {
        int nums[] = new int[5];
        nums[0] = 8;
        nums[1] = 78;
        nums[2] = 56;
        System.out.println(nums[2] + " " + nums[3]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        int nums2[] = { 1, 2, 3, 5 };

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Student s[] = new Student[4];
        Student s[] = { s1, s2, s2 };

        int a[] = { 1, 2, 3 };
        int b[] = { 1, 2, 3 };
        int c[] = { 1, 2, 3, 4 };

        int d[][] = { a, b, c };

    }

}

class Student {
    int rollNo;
    String name;
}
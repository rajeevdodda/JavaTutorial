public class Decision {
    public static void main(String args[]) {
        int n = 7;

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        String j;
        // Terenary
        j = n % 2 == 0 ? "even" : "odd";
        System.out.println(j);

        // Switch doen't support "double"
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 7:
                System.out.println("Seven");
                break;
            default:
                System.out.println("Default");
        }

    }
}

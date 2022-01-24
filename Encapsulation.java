public class Encapsulation {
    public static void main(String args[]) {

        EncapsulationStudent s1 = new EncapsulationStudent();
        EncapsulationStudent s2 = new EncapsulationStudent();
        // s1.rollNo = 1;
        // s1.name = "Rajeev";
        s1.setRollNo(1);
        s2.setRollNo(2);

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());

    }
}

class EncapsulationStudent {
    private int rollNo;
    private String name;

    // getters and setters

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return this.rollNo;
    }

}
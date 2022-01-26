package com.telusuko.test;

import com.telusuko.Engineer;

public class DemoMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.rollNo = 9;
        // student.gender = "Male";
        student.marks = 20;

        Engineer e = new Engineer();
        e.show();
    }

}

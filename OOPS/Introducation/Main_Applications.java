package Introducation;

/**
 * Main_Applications
 */
public class Main_Applications {

    public static void main(String[] args) {
        // ----- store 5 roll no.
        // int[] rollNo = new int[5];

        // --- store 5 name
        // String[] names = new String[5];

        // Calling the Student class.
        Student student = new Student(2, "CodeChainWizard", 99.99f);
        student.greeding("Shubham");
        System.out.println("Student Enroll-Number:- " + student.roll_No);
        System.out.println("Student Name:- " + student.names_stu);
        System.out.println("Student Marks:- " + student.marks);
    }

    /**
     * Create class
     * 
     * Student
     * 
     * ---- Class is a name group and function. (Class is logical construct)
     * ---- Class is a templates of object. (and object is a intence of the class)
     */
    public static class Student {

        // data of 5 student(rollNo, name, marks)

        int roll_No;
        String names_stu;
        float marks;

        Student(int no, String Student_name, float marks) {
            this.roll_No = no;
            this.names_stu = Student_name;
            this.marks = marks;
        }

        public void greeding(String name) {
            System.out.println("Hello, " + name);
        }
    }
}

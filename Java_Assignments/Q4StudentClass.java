/* Que 4. Write a program to create a class student having attribute rollNumber, name, enrollment, DateOfBirth, and totalMarks. Now take a input for 5 students and store accordingly, now display all student data int ascending order of rollNumber. */

import java.util.Scanner;

public class Q4StudentClass {
    public static class Student{
        public int rollNo;
        public String name;
        public String enrollment;
        public String DOB;
        public int totalMarks;

        public Student(int rollNo, String name, String enrollment, String DOB, int totalMarks){
            this.rollNo = rollNo;
            this.name = name;
            this.enrollment = enrollment;
            this.DOB = DOB;
            this.totalMarks = totalMarks;
        }

        public int getRollNo(){
            return rollNo;
        }

        public String toString(){
            return "Roll Number: " + rollNo + ", Name: " + name + ", Enrollment: " + enrollment + ", DOB: " + DOB + ", Total Marks: " + totalMarks;
        }

        public int compareTo(Student student){
            return Integer.compare(this.rollNo, student.getRollNo());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        for(int i=0; i<5; i++){
            System.out.println("Enter the details for student " + (i+1) + ":");
            System.out.print("Roll Number: ");
            int rollNo = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Enrollment: ");
            String enrollment = sc.next();

            System.out.print("DOB: ");
            String DOB = sc.next();

            System.out.print("Total Marks: ");
            int totalMarks = sc.nextInt();

            Student student = new Student(rollNo, name, enrollment, DOB, totalMarks);
            students[i] = student;
        }

        sortByRollNo(students);
        System.out.println("Students data:");
        for(Student student : students){
            System.out.println(student);
        }
    }

    public static void sortByRollNo(Student[] students){
        for(int i=0; i< students.length-1; i++){
            for(int j=0; j<students.length-i-1; j++){
                if(students[j].compareTo(students[j+1]) > 0){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}

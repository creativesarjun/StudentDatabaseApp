package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor prompt user to enter name & year

    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name : ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4- Senior\n\nEnter student grade level : ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }
    // Generate an ID

    private void setStudentID(){

        //Grade Year + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses

    // View balance

    // Pay Tuition

    // Show status

}


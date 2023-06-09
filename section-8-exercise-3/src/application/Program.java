package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Student name: ");
        student.name = sc.nextLine();

        System.out.print("Student grade 1: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Student grade 2: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Student grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
    }
}

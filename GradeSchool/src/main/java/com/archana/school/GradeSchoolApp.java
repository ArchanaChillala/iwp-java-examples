package com.archana.school;


public class GradeSchoolApp {

    public static void main(String[] args) {
        School school = new School();

        school.add("Aimee", 2);
        school.add("Susan", 3);
        school.add("Archi", 2);
        school.add("Jonny", 3);

        System.out.println("Grade-wise student list  : " + school.getStudentList());
        System.out.println("Total students in school : " + school.numberOfStudents());
        System.out.println("Sorted students list     : " + school.studentsByGradeAlphabetical());
    }
}

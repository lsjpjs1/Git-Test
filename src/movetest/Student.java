package movetest;

import java.util.Objects;

public class Student {
    int grade;
    int age;

    private static final Student THREE_GRADE_STUDENT = new Student(3);

    public Student(int grade) {
        this.grade = grade;
    }

    public Student() {
    }

    public static HighSchoolStudent highSchoolStudent() {
        return new HighSchoolStudent();
    }

    public static Student withGrade(int grade) {
        Student student = new Student(grade);
        return student;
    }

    public static Student withAge(int age) {
        Student student = new Student();
        student.age = age;
        return student;
    }

    public static Student getThreeGradeStudent() {
        return THREE_GRADE_STUDENT;
    }

    public void main() {
        GameController keyBoard = GameController.keyBoard();
        GameController joyStick = GameController.joyStick();
    }



    @Override
    public int hashCode() {
        return Objects.hash(grade, age);
    }
}

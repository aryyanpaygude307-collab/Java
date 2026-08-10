import student.Student;
import faculty.Faculty;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Aryyan", 101, "Computer Engineering");

        Faculty f = new Faculty("Dr. Sharma", "F201", "Java Programming");

        s.displayStudent();

        System.out.println();

        f.displayFaculty();
    }
}
interface Printable {
    void printDetails();
}

class Student implements Printable {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Employee implements Printable {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

public class PrintableApp {
    public static void main(String[] args) {
        Printable student = new Student("Aryyan", 101);
        Printable employee = new Employee("Rahul", 202);

        student.printDetails();
        employee.printDetails();
    }
}

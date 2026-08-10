class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagerApp {
    public static void main(String[] args) {
        Manager m = new Manager("Aryyan", 101, "IT");
        m.showDetails();
    }
}

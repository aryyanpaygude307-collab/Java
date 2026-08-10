package faculty;

public class Faculty {
    String name;
    String facultyId;
    String subject;

    public Faculty(String name, String facultyId, String subject) {
        this.name = name;
        this.facultyId = facultyId;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("Faculty Details:");
        System.out.println("Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Subject: " + subject);
    }
}
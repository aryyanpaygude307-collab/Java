public class App {
    int prn;
    String name;

    App(int prn, String name) {
        this.prn = prn;
        this.name = name;
    }
    void display() {
        System.out.println("PRN: " + prn + ", Name: " + name);
    }
    public static void main(String[] args) throws Exception {
        App obj1 = new App(101, "Alice");
        App obj2 = new App(102, "Bob");
        obj1.display();
        obj2.display();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Jack", "100");
        s.print();

        Course c = new Course("Compilers");
        c.enroll("Jack", "100");
        c.enroll("Jill", "200");
        c.print();
    }
}

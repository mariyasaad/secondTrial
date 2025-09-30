public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void print() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}

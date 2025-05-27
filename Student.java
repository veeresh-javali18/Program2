public class Student {
    String name;
    int age;
    String dob;

    Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, "1995-01-01");
        student1.displayDetails();
    }

}

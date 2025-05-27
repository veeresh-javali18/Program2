public class Course {
    int sem, marks;
    String subject;

    Course(int sem,int marks, String Subjects){
        this.sem=sem;
        this.marks=marks;
        this.subject=subject;
    }
    void displayDetails(){
        System.out.println("sem  : "+sem);
        System.out.println("Marks of the student : "+marks);
        System.out.println("Subjects of the student : "+subject);
    }
    public static void main(String[] args) {
        Course c=new Course(4, 80, "Devops");
        c.displayDetails();
    }
    
}

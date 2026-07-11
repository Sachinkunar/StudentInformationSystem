import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double grade;
    private String studentId;
    private String contact;
    
    public Student(String name, int age, double grade, String studentId, String contact) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
        this.contact = contact;
    }
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { 
        if(age > 0) this.age = age;
        else System.out.println("Age must be positive!");
    }

    public String getStudentId() {return studentId;}
    public void setStudentId(String studentId) {this.studentId=studentId;}


    public double getGrade() {return grade;}
    public void setGrade(double grade) {this.grade = grade;}


    public String getContact(){return contact;}
    public void setContact(String contact){this.contact=contact;}


    
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Contact: " + contact);
        System.out.println("-".repeat(30));
    }
}

public class StudentInformationSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        while(running) {
            System.out.println("\n=== STUDENT INFORMATION SYSTEM ===");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch(choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using Student Information System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
    
    private static void addStudent() {
        System.out.println("\n=== ADD NEW STUDENT ===");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();
        
        Student student = new Student(name, age, grade, studentId, contact);
        students.add(student);
        System.out.println("Student added successfully!");
    }
    
    private static void viewAllStudents() {
        System.out.println("\n=== ALL STUDENTS ===");
        if(students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        
        System.out.printf("%-15s %-20s %-8s %-8s %-15s\n", 
                         "Student ID", "Name", "Age", "Grade", "Contact");
        System.out.println("-".repeat(70));
        
        for(Student student : students) {
            System.out.printf("%-15s %-20s %-8d %-8.2f %-15s\n", 
                            student.getStudentId(), student.getName(), 
                            student.getAge(), student.getGrade(), student.getContact());
        }
    }
    private static void searchStudent() {

    System.out.println("\n=== SEARCH STUDENT ===");

    System.out.print("Enter Student ID or Name: ");
    String search = scanner.nextLine();

    boolean found = false;

    for (Student student : students) {

        if (student.getStudentId().equalsIgnoreCase(search)
                || student.getName().equalsIgnoreCase(search)) {

            System.out.println("\nStudent Found");
            student.displayInfo();
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Student not found!");
    }
}
private static void updateStudent() {

    System.out.println("\n=== UPDATE STUDENT ===");

    System.out.print("Enter Student ID: ");
    String id = scanner.nextLine();

    boolean found = false;

    for (Student student : students) {

        if (student.getStudentId().equalsIgnoreCase(id)) {

            System.out.println("Student Found!");

            System.out.print("Enter New Name: ");
            student.setName(scanner.nextLine());

            System.out.print("Enter New Age: ");
            student.setAge(scanner.nextInt());

            System.out.print("Enter New Grade: ");
            student.setGrade(scanner.nextDouble());

            scanner.nextLine();

            System.out.print("Enter New Contact: ");
            student.setContact(scanner.nextLine());

            System.out.println("Student Updated Successfully!");

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Student not found!");
    }
}
}
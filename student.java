

public class student {

    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String stage;
    private String[] courses;

    private static final int MAX_COURSES = 6;

    // Constructor
    public student(String name, int age, String email, String phoneNumber,
                     String stage, String[] courses
    ) {

        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;

        if (courses.length > MAX_COURSES) {
            throw new IllegalArgumentException("Maximum of six courses allowed.");
        }
        this.courses = courses;
    }
 // Display student information
    public void printMe() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Stage: " + stage);
        System.out.println("Registered Courses:");

        for (String course : courses) {
            System.out.println("- " + course);

        }
         System.out.println("--------------------");

}

public static void main(String[] args) {
    student student1 = new student(
        "John Doe", 20,
        "john.doe@example.com", "123-456-7890",
        "Freshman",
        new String[]{"Math", "English"}
    );

    student student2 = new student(
        "David Brown", 21,
        "david@example.com", "123-456-7891",
        "Sophomore",
        new String[]{"Java", "History", "Science"}
    );

    student student3 = new student(
        "Frank Brown", 23,
        "frank.brown@example.com", "098-765-4321",
        "Senior",
        new String[]{"Networking", "Database",
                     "Cybersecurity", "Programming"}
    );

    student1.printMe();
    student2.printMe();
    student3.printMe();
    }
}
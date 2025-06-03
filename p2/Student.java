import java.time.LocalDate;
import java.time.Period;
public class Student {
    String name;
    LocalDate dob;
    public Student(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob); // Format: YYYY-MM-DD
    }

    public void displayInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student s = new Student("Ravi", "2000-08-15");
        s.displayInfo(); }}

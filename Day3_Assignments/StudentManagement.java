package Day3_Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Day3Exercises.Students_;
public class StudentManagement {


    public static void main(String[] args) {
        // Creating 5 student objects
        List<Students__> students = new ArrayList<>();
        students.add(new Students__(1, "Alice", "1234567890", "Math", 1000.0));
        students.add(new Students__(2, "Bob", "2345678901", "Science", 1500.0));
        students.add(new Students__(3, "Charlie", "3456789012", "Math", 1100.0));
        students.add(new Students__(4, "David", "4567890123", "History", 1300.0));
        students.add(new Students__(5, "Eve", "5678901234", "Science", 1400.0));

        // Display the student details coursewise
        System.out.println("Displaying students coursewise:");
        displayStudentsCoursewise(students);

        // Display the total fees of all the students
        double totalFees = calculateTotalFees(students);
        System.out.println("Total fees of all students: " + totalFees);
    }

    // Method to display students coursewise using a Map
    public static void displayStudentsCoursewise(List<Students__> students) {
        // Using a Map to group students by course
        Map<String, List<Students__>> courseMap = new HashMap<>();

        for (Students__ student : students) {
            String course = student.getCourse();
            if (!courseMap.containsKey(course)) {
                courseMap.put(course, new ArrayList<>());
            }
            courseMap.get(course).add(student);
        }

        // Display students grouped by course
        for (Map.Entry<String, List<Students__>> entry : courseMap.entrySet()) {
            System.out.println("Course: " + entry.getKey());
            for (Students__ student : entry.getValue()) {
                student.display();
            }
        }
    }

    // Method to calculate the total fees of all students
    public static double calculateTotalFees(List<Students__> students) {
        double totalFees = 0;
        for (Students__ student : students) {
            totalFees += student.getFees();
        }
        return totalFees;
    }
}
        




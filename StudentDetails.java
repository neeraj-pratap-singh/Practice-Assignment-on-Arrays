import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create arrays to store the student details
        int[] studentIDs = new int[numStudents];
        String[] studentNames = new String[numStudents];
        double[] studentMarks = new double[numStudents];

        // Prompt the user to enter the details for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            System.out.print("ID: ");
            studentIDs[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Marks: ");
            studentMarks[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.println(); // Add a blank line for separation
        }

        // Menu loop
        int choice;
        do {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. Show list of all students with complete information");
            System.out.println("2. Show student name with the highest number");
            System.out.println("3. Show student name with the least number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Perform the selected operation
            switch (choice) {
                case 1:
                    displayAllStudents(studentIDs, studentNames, studentMarks);
                    break;
                case 2:
                    displayStudentWithHighestMarks(studentNames, studentMarks);
                    break;
                case 3:
                    displayStudentWithLeastMarks(studentNames, studentMarks);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Add a blank line for separation
        } while (choice != 4);

        scanner.close();
    }

    // Method to display the list of all students with complete information
    public static void displayAllStudents(int[] studentIDs, String[] studentNames, double[] studentMarks) {
        System.out.println("List of all students:");
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println("ID: " + studentIDs[i]);
            System.out.println("Name: " + studentNames[i]);
            System.out.println("Marks: " + studentMarks[i]);
            System.out.println(); // Add a blank line for separation
        }
    }

    // Method to display the student name with the highest marks
    public static void displayStudentWithHighestMarks(String[] studentNames, double[] studentMarks) {
        double highestMarks = studentMarks[0];
        int highestMarksIndex = 0;

        for (int i = 1; i < studentMarks.length; i++) {
            if (studentMarks[i] > highestMarks) {
                highestMarks = studentMarks[i];
                highestMarksIndex = i;
            }
        }

        System.out.println("Student with the highest marks:");
        System.out.println("Name: " + studentNames[highestMarksIndex]);
        System.out.println("Marks: " + highestMarks);
        System.out.println(); // Add a blank line for separation
    }

    // Method to display the student name with the least marks
    public static void displayStudentWithLeastMarks(String[] studentNames, double[] studentMarks) {
        double leastMarks = studentMarks[0];
        int leastMarksIndex = 0;

        for (int i = 1; i < studentMarks.length; i++) {
            if (studentMarks[i] < leastMarks) {
                leastMarks = studentMarks[i];
                leastMarksIndex = i;
            }
        }

        System.out.println("Student with the least marks:");
        System.out.println("Name: " + studentNames[leastMarksIndex]);
        System.out.println("Marks: " + leastMarks);
        System.out.println(); // Add a blank line for separation
    }
}

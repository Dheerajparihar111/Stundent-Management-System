import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        do {
            System.out.print("===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    service.addStudent(new Student(id, name, age, marks));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    Student found = service.searchStudent(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new Age: ");
                    int newAge = sc.nextInt();

                    System.out.print("Enter new Marks: ");
                    double newMarks = sc.nextDouble();

                    if (service.updateStudent(updateId, newName, newAge, newMarks))
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Student not found.");
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    if (service.deleteStudent(deleteId))
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Student not found.");
                    break;



                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}

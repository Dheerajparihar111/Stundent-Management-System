import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(int id, String name, int age, double marks) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setMarks(marks);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }


}

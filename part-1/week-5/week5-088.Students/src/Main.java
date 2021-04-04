
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        while (true) {
            System.out.print("name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("studentnumber: ");
            String studentNumber = scanner.nextLine();
            students.add(new Student(name, studentNumber));
        }
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.print("Give search term: ");
        String searchString = scanner.nextLine();
        System.out.println("Result:");
        for (Student student : students) {
            if (student.getName().contains(searchString)) {
                System.out.println(student);
            }
        }
    }
}

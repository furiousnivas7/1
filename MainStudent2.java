import java.util.Scanner;  

class MainStudent2{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Student2 Stu2 = new Student2();

        System.out.println("Enter student ID:");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        Stu2.setStudent2(id, name);
        Stu2.getStudent2();
        scanner.close();
    }
}

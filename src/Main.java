import java.util.ArrayList;
import java.util.Scanner;
//import Student;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Джордж Карлин", 55, 3));
        students.add(new Student("Джимми Кар", 43, 5));
        students.add(new Student("Михаил Задорнов", 32, 4));

        System.out.println("Управление списком студентов:" +
                "\n1 - Добавить студента" +
                "\n2 - Убрать студента" +
                "\n3 - Показать студента" +
                "\n4 - Средняя оценка студентов" +
                "\n5 - Показать список" +
                "\n6 - Выход");

        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.print("\nНомер действия --> ");
            int num = in.nextInt();

            if (num == 1) {
                Scanner in_s = new Scanner(System.in);
                System.out.print("\nИмя --> ");
                String name = in_s.nextLine();
                System.out.print("Возраст --> ");
                int age = in_s.nextInt();
                System.out.print("Оценка --> ");
                int grade = in_s.nextInt();

                students.add(new Student(name, age, grade));
            } else if (num == 2) {
                Scanner in_s = new Scanner(System.in);
                System.out.print("\nИмя --> ");
                String name = in_s.nextLine();
                boolean get = false;
                for (Student student : students) {
                    if (student.getName().equals(name)) {
                        students.remove(student);
                        System.out.println("Студент удалён");
                        get = true;
                        break;
                    }
                }
                if (!get) {
                    System.out.println("Студент не найден");
                }
            } else if (num == 3) {
                Scanner in_s = new Scanner(System.in);
                System.out.print("\nИмя --> ");
                String name = in_s.nextLine();
                boolean get = false;
                for (Student student : students) {
                    if (student.getName().equals(name)) {
                        students.remove(student);
                        student.displayInfo();
                        get = true;
                        break;
                    }
                }
                if (!get) {
                    System.out.println("Студент не найден");
                }
            } else if (num == 4) {
                float sum = 0;
                for (Student student : students) {
                    sum += student.getGrade();
                }
                float midGrade = sum / students.size();
                System.out.println("Средняя оценка: " + midGrade);
            } else if (num == 5) {
                System.out.println("\nСписок студентов:");
                for (Student student : students) {
                    System.out.println(student.getName());
                }
            }else if (num == 6){
                System.out.println("Завершение работы...");
                break;
            }else {
                System.out.println("\nНет такого номера");
            }
        }
    }
}
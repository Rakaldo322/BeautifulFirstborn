public class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("Имя: " + name + "\nВозраст: " + age + "\nОценка: " + grade);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getGrade(){
        return grade;
    }
}
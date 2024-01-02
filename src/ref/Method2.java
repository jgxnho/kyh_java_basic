package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 20, 80);
        System.out.println("student2 = " + student2);


        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    /*
    Student student1 = createStudent("학생1", 15, 90) //메서드 호출후 결과 반환
    Student student1 = student(x001) //참조형인 student를 반환
    Student student1 = x001 //student의 참조값 대입
    student1 = x001
     */


    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}

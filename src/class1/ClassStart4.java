package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //30f39991
        student1.name = "학생1"; //30f39991의 name
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //452b3a41
        student2.name = "학생2"; //452b3a41의 name
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        students[0] = student1;
        students[1] = student2;
        // 변수에는 인스턴스 자체가 들어있는 것이 아니다! 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다!
        // 따라서 대입 ( `=` )시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.

        System.out.println("이름: " + students[0].name + " 나이:" + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이:" + students[1].age + " 성적: " + students[1].grade);
    }
}

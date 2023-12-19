package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentName = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrade = {90, 80};
        // 한 학생의 데이터를 관리하기 위해 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 한다.
        // 이렇게 하면 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높다.


        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름: " + studentName[i] + " 나이: " + studentAge[i] + " 성적: " + studentGrade[i]);

        }
    }
}

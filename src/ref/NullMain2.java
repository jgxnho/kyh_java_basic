package ref;

public class NullMain2 {
    //`NullPointerException` 은 이름 그대로 주소가 없는 곳을 찾아갈 때 발생하는 예외이다.
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;// NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}

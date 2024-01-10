package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    //'public' 은 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    //'default' 는 나의 패키지 안으로 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    //'private' 은 나의 클래스 안으로 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}

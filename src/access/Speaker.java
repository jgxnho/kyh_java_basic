package access;

public class Speaker {      //클래스 레벨
    private int volume;     //필드

    Speaker(int volume) {   //생성자
        this.volume = volume;
    }

    void volumeUp() {       //메서드
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");

        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: "+volume);
    }
}

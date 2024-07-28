package fc.java.part4;

import fc.java.poly.*;

public class interfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작 시켜보자.
        // 다형성이 100% 보장이 된다.
        // 부모가 인터페이스이면 자식의 내부 동작 방식을 전혀 몰라도 동작을 시킬 수가 있다.
        // RemoCon r = new RemoCon(); 객체 생성 불가
        // 부모의 역할을 할 수 있다.
        RemoCon remo=new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // Radio에서는 인터넷이 지원이 안됩니다.

        remo=new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // TV에서 인터넷이 실행된다.

    }
}

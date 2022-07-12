package com.week2;

public class TvTest {

    public static void main(String[] args) {
        Tv t;          //Tv인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();   // Tv인승턴스를 생성한다.
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
        System.out.println(t.color);
        System.out.println(t.power);
        System.out.println();
    }
}

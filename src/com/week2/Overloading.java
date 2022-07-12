package com.week2;

/**
 * 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 '메서드 오버로딩' 또는 간단히 '오버로딩'이라 한다.
 * 예를들어 System.out.println
 *
 * 오버로딩의 조건
 *  - 메서드 이름이 같아야 한다.
 *  - 매개변수의 개수 또는 타입이 달라야 한다.
 */
public class Overloading {
    public static void main(String[] args) {
        //ex1) 매개변수의 이름만 다른 경우 매개변수의 타입이 같기 때문에 오버로딩이 성립하지 않는다.
    }
//        int add(int x, int y){
//            return x + y;
//        }
//
//        int add(int a, int b){
//            return a + b;
//        }

    //ex2) 리턴타입만 다른 경우 매개변수의 타이과 개수가 일치하기 때문에 add(3.3)과 같이 호출하였을 떄 어떤 메서드가 호출된
    //것인지 결정할 수 없기 때문에 오버로딩이 성립하지 않는다.
//    int add(int a, int b){
//        return a + b;
//    }
//
//    long add(int a, int b){
//        return a + b;
//    }

    long add(int a, long b) {
        return a + b;
    }

    long add(long a, int b) {
        return a + b;
    }
}
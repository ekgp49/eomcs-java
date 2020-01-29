// StringBuffer - 문자열 비교
package com.eomcs.corelib.ex02;

public class Exam0124 {
  public static void main(String[] args) {

    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    // b1, b2는 서로 다른 인스턴스이다.
    System.out.println(b1 == b2); // false

    // StringBuffer는 Object에서 상속 받은 equals()를 오버라이딩 하지 않았다.
    System.out.println(b1.equals(b2)); // false
    // => 따라서 원래 Object의 equals()를 사용한다.
    // => 즉 두 개의 인스턴스가 같은지를 비교한다.
    // 그러니 결과는 false이다.
    //
  }
}



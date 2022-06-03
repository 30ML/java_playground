// 클래스 정의
class A {
  A() {
    System.out.println("첫 번째 생성자");
  }

  A(int a) {
    this(); // 반드시 생성자의 첫 줄에 위치해야 함
    System.out.println("두 번째 생성자");
  }

  /*
   * void abc() {
   * this(); // 메서드에서는 this() 메서드 사용 불가능
   * }
   */
}

public class ThisMethod_1 {
  public static void main(String[] args) {
    // 객체 생성
    A a1 = new A();
    System.out.println();
    A a2 = new A(3);
  }
}

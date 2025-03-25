// 다음 Java로 구현된 프로그램을 분석하여 괄호 안의 'a'에 해당되는 알맞은 예약어를 쓰시오 (단, 출력문의 출력 서식을 준수하시오.)

package Function.Java;

public class Java2 {
  public static void main(String[] args) {
    System.out.print(Java2.check(1));
  }
}

// 풀이
public static void main(String[] args) { // 1. 공용(public) 정적(static) 메서드인 main을 선언함
  System.out.print(Java2.check(1)); // 2. '1'을 인수로 하는 Java2 클래스의 check 메서드를 호출함
}
('a') String check(int num){ // 3. 2번에서 (클래스 이름).(메서드)로 check를 호출했으니 check 메서드는 '정적(static)'이어야 함
  return (num >= 0) ? "positive" : "negative";
}

// 문제의 핵심 포인트
// 1. 'static' 예약어의 필요성을 물어보는 문제
// 2. 정적(static) 메서드는 객체를 생성하지 않고 클래스 이름으로 직접 호출할 수 있음 ex) 클래스 : Java2, 메서드 : check => 호출 : Java2.check(1)
// 3. 만약 'public'이나 'private' 예약어를 쓴다면? => 따로 객체를 생성해야 함 ex) Java2 obj = new Java2(); obj.check(1);
// 4. 왜 static 이어야 하는가? => main이 이미 정적 메서드이기 때문에 check를 호출할려면 정적 메서드여야 함 (정적 메서드에선 정적 메서드만 호출 가능)


// 비슷한 유형의 문제

// 1. public 예약어를 호출해야 할 때
public class Java2 {
  public static void main(String[] args) {
    Java2 obj = new Java2(); // 1. obj 객체를 생성
    System.out.print(obj.check(1)); // 2. obj 객체를 통해 check() 메서드를 호출
  }
  ('public') String check(int num){
    return (num >= 0) ? "positive" : "negative";
  }
}
// main이 이미 정적(static) 메서드이므로 공용(public) 메서드인 check()는 인스턴스 메서드로 호출하여 사용해야 함
// 공용 메서드인 check()는 먼저 임의의 객체를 생성해서 인스턴스 메서드로 호출해야만 정적 메서드인 main에서 호출 가능
// 호출할려는 public 메서드가 호출하는 메서드와 다른 클래스에 있어도 호출이 가능함 ex) main이 Java2 클래스에 있고 check가 Java 클래스에 있어도(= 클래스가 다르면) main 메서드에서 check 메서드 호출 가능


// 2. private 예약어를 호출해야 할 때
public class Java2 {
  public static void main(String[] args) {
    Java2 obj = new Java2(); // 1. obj 객체를 생성
    System.out.print(obj.check(1)); // 2. obj 객체를 통해 check() 메서드를 호출
  }
  ('private') String check(int num){
    return (num >= 0) ? "positive" : "negative";
  }
}

// 마찬가지로 main은 정적(static) 메서드이므로 private 메서드인 check()를 호출할려면 객체 생성 후 인스턴스 메서드로 호출해야 함
// 호출할려는 private 메서드는 반드시 호출하는 메서드와 '같은 클래스 안'에 있어야 함 ex) main이 Java2 클래스에 있고 check가 Java 클래스에 있으면(= 클래스가 다르면) main 메서드에서 check 메서드 호출 불가능


// 종합 정리
// 1. Test obj = new Test(); 처럼 객체를 생성 후 호출 → 'private' or 'public'
// 2. 객체 생성 없이 바로 호출 → 'static'

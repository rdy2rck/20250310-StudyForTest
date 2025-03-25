// 다음은 변수 n에 저장된 10진수를 2진수로 변환하여 출력하는 Java 프로그램이다. 프로그램을 분석하여 괄호 안의 'a', 'b'에 들어갈 알맞은 답을 쓰시오.

package Java;

public class Java8 {
  public static void main(String[] args) {
    int a[] = new int[8];
    int i = 0;
    int n = 10;
    while('a') {
      a[i++] = ('b');
      n/=2;
    }
    for(i=7;i>=0;i--)
    System.out.print(a[i]);
  }
  
}

// 풀이
public static void main(String[] args) {
  int a[] = new int[8]; // 1. 8개의 자리를 가진 정수형 배열 a[]를 선언
  int i = 0; // 2. 정수형 변수 i를 0으로 초기화
  int n = 10; // 3. 정수형 변수 n을 10으로 초기화
  while('a') { // 4. n이 0보다 큰 동안(n > 0) while 문을 반복함
    a[i++] = ('b'); // 5. n을 2로 나눈 나머지(n % 2)를 배열에 하나씩 저장
    n /= 2; // 6. n을 2로 나눈 값을 n에 저장함 (= 반복 회차가 진행될 수록 n / 2가 반복됨)
  }
  for(i=7;i>=0;i--) // 7. while 문 반복 종료 후 반복 변수가 7에서 0까지 하나씩 줄어가며 도달할 때 까지 for 문을 반복
  System.out.print(a[i]); // 8. 배열 a[]의 모든 요소들을 7부터 0까지 '역순으로' 하나씩 출력
}
// 답 : a = 'n > 0', b = 'n % 2'

// 문제의 핵심 포인트
// 1. '10진수를 2진수로 변환'하는 코드 (10 => 1010)
// 2. 2진수는 '0'과 '1', 두 개의 값으로만 표현됨
// 2-1. 모든 자연수를 대입해도 0과 1을 구할 수 있는 방법 => 2로 나누고 나머지를 구하기 (짝수 % 2 = 0, 홀수 % 2 = 1)
// 3. 2진수의 다음 자리를 구하기 위해서는 자연수를 2로 나누어서 다음 자리로 넘길 수 있음 (n / 2)
// 4. 2진수는 '자연수'에만 할당 가능, 음수나 0에는 할당 불가능 => while (n > 0)
// 5. 2진수 배열을 출력할 때는 '역순'으로 출력해야 함 ex) a[] = [1, 0, 1, 1, 0, 0, 1, 1] => print(a[i]) => 11001101(= 205)

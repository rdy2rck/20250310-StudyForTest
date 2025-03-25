// 다음 Java로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

package Java;

public class Java5 {
  public static void main(String[] args) {
    int i=0, c=0;
    while (i<10) {
      i++;
      c *= i;
    }
    System.out.println(c);
  } 
}

// 풀이
public static void main(String[] args) {
  int i=0, c=0; // 1. 정수형 변수 i를 0으로, c를 0으로 초기화
  while (i<10) { // 2. 반복 변수 i가 10보다 작을 때 까지 while 문 반복
    i++; // 3. i의 값에 1을 더함 (i++)
    c *= i; // 3. c *= i는 c = c * i와 같은 의미이므로 c의 값에 3번에서 구한 i의 값을 곱한 값을 c에 누적시킴. c의 초기값은 0이므로 i*0 = 0
  }
  System.out.println(c); // 4. while문 반복이 끝난 후 c의 값을 출력 = 0
} 

// 계산
// 1. c의 초기값은 0인데, i를 c와 곱하면 i*0이므로 i가 무슨 수여도 결과값은 0이 됨
// 2. 따라서 i*c의 결과값을 계속 c에 반복해서 누적시켜도 c의 값은 계속 0으로 고정됨

// 문제의 핵심 포인트
// 1. *= 연산자는 +=에서 '더하기' 대신 '곱하기'를 하도록 정하는 연산자
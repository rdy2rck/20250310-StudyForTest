// 다음 Java로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

package Java;

public class Java7 {
  public static void main(String[] args) {
    int r=0;
    for (int i=1; i<999; i++) {
      if(i%3==0 && i%2==0)
        r=i;
    }
    System.out.println(r);
  }
}

// 풀이
public class Java0 {
  public static void main(String[] args) {
    int r=0; // 1. 정수형 변수 r의 값을 0으로 초기화
    for (int i=1; i<999; i++) { // 2. 변수 i를 1부터 998까지 1씩 증가하면서 반복
      if(i%3==0 && i%2==0) // 3. 변수 i의 값이 3과 2로 둘 다 정확하게 나누어질 경우(= 6의 배수일 경우) 4번 명령 실행, 아닐 경우 다음 회차 진행
        r=i; // 4. 정수형 변수 r의 값을 i로 치환, r+=i가 아니므로 i의 값은 r에 누적되지 않고 계속 i의 최신값으로 바뀜
    }
    System.out.println(r); // 5. 반복문 종료 후 r의 값 출력. 998까지의 6의 배수 중 최댓값인 '996' 출력
  }
}

// 문제의 핵심 포인트
// 1. 특정 수의 배수를 구하는 문제
// 2. i%n == 0 일 경우에는 'i가 n의 배수'라는 소리 (i를 n으로 나누면 나머지가 0이므로)
// 3. i%m == 0 && i%n == 0 일 경우에는 'i는 m*n의 배수'라는 소리 (i를 m으로 나누어도 0이고 n으로 나누어도 0이므로 m*n으로 나누어도 0이 됨)
// 3. 연산자가 r=i일 경우에는 반복문의 값이 누적되지 않고 가장 마지막 값을 출력함 (반복문 값 누적은 r+=i)

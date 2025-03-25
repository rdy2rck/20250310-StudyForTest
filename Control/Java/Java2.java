// 다음 Java로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

package Java;

public class Java2 {
  public static void main(String[] args) {
    int j, i;
    for (j=0, i=0; i<=5; i++) {
      j += i;
      System.out.print(i);
      if (i == 5) {
        System.out.print("=");
        System.out.print(j);
      }
      else
      System.out.print("+");
    }
  }  
}

// 풀이
public static void main(String[] args) {
  int j, i; // 1. 정수형 변수 j, i를 선언
  for (j=0, i=0; i<=5; i++) { // 2. i, j를 0으로 초기화 한 후 i가 5가 될 때 까지 1씩 증가하면서 반복
    j += i; // 3. j에 i의 값을 계속 누적시킴
    System.out.print(i); // 4. i의 값을 출력함
    if (i == 5) { // 5. i의 값이 5일 경우 if문 실행, 아닐 경우 else 문으로 이동
      System.out.print("="); // 6. 문자 "="을 출력
      System.out.print(j); // 7. for문이 i=5일 때에 도달할 때 까지 누적된 j의 값을 출력
    }
    else // 8. i가 if문의 조건에 맞지 않을 경우 이 조건 실행
    System.out.print("+"); // 9. 문자 "+"를 출력
  } // 10. for 문의 반복 변수 i가 5가 되어서 반복이 종료될 경우 코드 종료
}

// 계산
// 반복 1회 : i=0, j=0, if(X) => 0+
// 반복 2회 : i=1, j=1, if(X) => 0+1+
// 반복 3회 : i=2, j=3, if(X) => 0+1+2+
// 반복 4회 : i=3, j=6, if(X) => 0+1+2+3+
// 반복 5회 : i=4, j=10, if(X) => 0+1+2+3+4+
// 반복 6회 : i-5, j=15, if(O) => 0+1+2+3+4+5=15


// 문제의 핵심 포인트
// 1. '수식'을 출력하는 문제 (※ 결과값이 아님!)
// 2. 'println'이 아니라 'print'일 경우에는 줄바꿈 없이 출력함
// 3. i는 if문 조건의 참 or 거짓에 상관없이 반드시 출력한다는 점에 집중
// 4. for문이 종료되면 코드도 함께 종료

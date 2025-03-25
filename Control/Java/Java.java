// 다음 Java로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

package Java;

public class Java1 {
  public static void main(String[] args) {
    int i=3, k=1;
    switch (i) {
      case 1: k++;
      case 2: k-=3;
      case 3: k=0;
      case 4: k+=3;
      case 5: k-=10;
      default: k--;
    }
    System.out.println(k);
  }
}

// 풀이
public class Java {
  public static void main(String[] args) {
    int i=3, k=1; // 1. 정수형 변수 i를 3, k를 1로 초기화
    switch (i) { // 2. switch 제어문의 케이스 변수 i에 i의 값 3을 대입, 케이스 3까지 이동
      case 1: k++; // 3. 케이스 3이 아니니 스킵
      case 2: k-=3; // 4. 케이스 3이 아니니 스킵
      case 3: k=0; // 5. 케이스 3에 해당. k를 0으로 초기화, break 명령이 없으므로 계속 진행
      case 4: k+=3; // 6. k에 3을 더하기, k=3, break 명령이 없으므로 계속 진행
      case 5: k-=10; // 7. k에 10을 빼기, k=-7, break 명령이 없으므로 계속 진행
      default: k--; // 8. -- 연산자이므로 k에 -1을 빼기, k=-8, swtich 제어문의 마지막으로 연산 종료
    }
    System.out.println(k); // 9. k의 최종값 '-8' 출력, 
  }
}

// 문제의 핵심 포인트
// 1. switch 제어문에서 변수가 주어질 경우 해당 변수에 해당하는 케이스부터 수행
// 2. switch 제어문의 중간에 break; 명령이 없을 경우에는 다음 케이스를 그대로 진행. break; 제어문을 만날 경우 즉시 switch 제어문 진행 중단
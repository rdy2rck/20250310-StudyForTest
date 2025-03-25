// 다음 Java로 구현된 프로그램을 분석하여 괄호 안의 a, b에 들어갈 알맞은 답을 쓰시오.

package Java;

public class Java9 {
  public static void main(String[] args) {
    int ary[][] = new int[( a )][( b )];
    int n = 1;
    for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        ary[i][j] = j*3 + i+1;
        System.out.print(ary[i][j] + " ");
      }
      System.out.println();
    }
  }
  
}

// 풀이
public static void main(String[] args) {
  int ary[][] = new int[('a')][('b')]; // 1. 정수형 2차원 배열 ary[][]를 선언
  int n = 1; // 2. 정수형 변수 n의 초기값을 1로 초기화
  for(int i=0; i<3; i++) { // 3. 변수 i를 0으로 초기화 한 후 2가 될 때 까지 1씩 증가시키면서 반복
    for(int j=0; j<5; j++) { // 4. 3번이 한 번 실행될 때 마다 변수 j를 0으로 초기화 한 다음 4가 될 때 까지 1씩 증가시키면서 반복
      ary[i][j] = j*3 + i+1; // 5. 2차원 배열 ary[i][j]의 i번째 배열의 j번째 요소에 j*3 + i+1 에 해당하는 값을 저장함
      System.out.print(ary[i][j] + " "); // 6. 5번에서 저장한 ary[i][j]의 값을 출력한 다음 공백을 추가함
    }
    System.out.println(); // 7. 3번이 반복을 한 번 끝낼 때 마다 줄바꿈
  }
}
// 8. i는 0부터 2까지 총 3번을, j는 0부터 4까지 총 5번을 반복하므로 배열 ary[][]에서 i의 값을 저장할 곳은 0, 1, 2의 총 3개가, j의 값을 저장할 곳은 0, 1, 2, 3, 4의 총 5개가 필요함
// 9. 따라서 지정해야 하는 ary[][] 배열의 크기는 int[3][5]
// 10. a = 3, b = 5


// 문제의 핵심 포인트
// 1. '2차원 배열의 크기'를 찾는 문제
// 2. '배열의 크기'를 정할 때는 인덱스를 사용하지 '않음' ex) ary[5] => 배열의 크기는 4(X) 5(O)
// 3. 2차원 배열 ary[i][j]에서 요소를 저장할 때는 'i+1번째 배열'의 'j+1번째 자리'에 저장한다는 걸 잊으면 안 됨 ex) ary[2][5] = 5 => '3번째 배열'의 '6번째 자리'에 요소 5를 저장
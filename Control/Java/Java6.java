// 다음 Java로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

package Java;

public class Java6 {
  public static void main(String[] args) {
    int aa[][] = { {45, 50, 75}, {89} };
    System.out.println(aa[0].length);
    System.out.println(aa[1].length);
    System.out.println(aa[0][0]);
    System.out.println(aa[0][1]);
    System.out.println(aa[1][0]);
  }
}

// 풀이
public class Java8 {
  public static void main(String[] args) {
    int aa[][] = { {45, 50, 75}, {89} }; // 1. 배열 {45, 50, 75}와 {89}를 요소로 가지는 정수형 2차원 배열 aa 선언
    System.out.println(aa[0].length); // 2. 2차원 배열 aa의 첫 번째 배열의 길이 출력 = 3
    System.out.println(aa[1].length); // 3. 2차원 배열 aa의 두 번째 배열의 길이 출력 = 1
    System.out.println(aa[0][0]); // 4. 2차원 배열 aa의 첫 번째 배열의 첫 번째 요소 출력 = 45
    System.out.println(aa[0][1]); // 5. 2차원 배열 aa의 첫 번째 배열의 두 번째 요소 출력 = 50
    System.out.println(aa[1][0]); // 6. 2차원 배열 aa의 두 번째 배열의 첫 번째 요소 출력 = 89
  }
}
// 출력 결과
// 3
// 1
// 45
// 50
// 89


// 문제의 핵심 포인트
// 1. 2차원 배열의 경우 가변 길이(배열끼리의 길이가 서로 다름)이 가능함
// 2. 배열 선언 후 .length가 붙을 경우 배열의 길이(= 배열 안 요소 갯수들)을 선언한다는 뜻
// 3. 2차원 배열에서 배열 선언 후 [a][b]가 붙을 경우에는 'a'번째 배열의 'b'번째 요소를 선언한다는 의미. 이 경우에 a와 b는 반드시 '인덱스'를 사용함
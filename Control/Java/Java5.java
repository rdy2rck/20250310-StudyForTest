// 다음 Java로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

package Java;

public class Java5 {
  public static void main(String[] args) {
    int result[] = new int[5];
    int arr[] = {77, 32, 10, 99, 50};
    for(int i=0; i<5; i++) {
      result[i] = 1;
      for(int j=0; j<5; j++)
        if(arr[i] < arr[j])
          result[i]++;
    }
    for(int k=0; k<5; k++)
      System.out.println(result[k]);
  }  
}

// 풀이
public class Java7 {
  public static void main(String[] args) {
    int result[] = new int[5]; // 1. 배열의 크기가 5인 정수형 배열 result를 선언 후 0으로 초기화
    int arr[] = {77, 32, 10, 99, 50}; // 2. {77, 32, 10, 99, 50}를 요소로 갖는 정수형 배열 arr을 선언
    for(int i=0; i<5; i++) { // 3. 변수값 i가 0에서 시작해서 4에 도달할 때 까지 1씩 증가하면서 반복
      result[i] = 1; // 4. 1에서 선언한 배열 result[i]의 값을 1로 지정
      for(int j=0; j<5; j++) // 5. 변수값 j가 0에서 시작해서 4에 도달할 때 까지 1씩 증가하면서 반복
        if(arr[i] < arr[j]) // 6. 현재 점수인 arr[i]의 값이 비교 점수인 arr[j]의 값보다 작으면 if문 실행, 아니면 다시 반복
          result[i]++; // 7. 6번이 참일 경우 result[i]의 값에 1을 더함
    }
    for(int k=0; k<5; k++) // 8. 변수값 k가 0에서 시작해서 4에 도달할 때 까지 1씩 증가하면서 반복
      System.out.println(result[k]); // 9. 3~8번 과정에서 값이 할당된 배열 result[]의 요소들을 하나씩 출력
  }  
}

// 계산
// 1. result[] = {0, 0, 0, 0, 0}, arr[] = {77, 32, 10, 99, 50}
// 2. result[i] = 1
// 3. i=0, arr[0] => 77 < 77(X), 32(X), 10(X), 99(O), 50(X) => result[0] = 1+1 = 2
// 4. i=1, arr[1] => 32 < 77(O), 32(X), 10(X), 99(O), 50(O) => result[1] = 1+3 = 4
// 5. i=2, arr[2] => 10 < 77(O), 32(O), 10(X), 99(O), 50(O) => result[2] = 1+4 = 5
// 6. i=3, arr[3] => 99 < 77(X), 32(X), 10(X), 99(X), 50(X) => result[3] = 1+0 = 1
// 7. i=4, arr[4] => 50 < 77(O), 32(X), 10(X), 99(O), 50(X) => result[4] = 1+2 = 3
// 8. System.out.println(result[k]) => print result[0], [1], [2], [3], [4] => 24513
// 9. '24513' 출력


// 문제의 핵심 포인트
// 1. '배열 요소들들의 크기 순위'를 구하는 코드
// 2. 배열 'arr'은 크기를 비교할 요소들이 모여있는 배열, 배열 'result'는 배열 'arr'의 요소들의 크기 순위를 할당하는 배열.
// 3. result[i] = 1 => 배열 'result'의 모든 요소에는 반드시 기본값 1이 할당됨(0등이 나올 수는 없으니까)
// 4. i는 기본값, j는 비교값이므로 arr[i] < arr[j]는 현재 배열 요소 < 모든 배열 요소 의 비교
// 5. arr[i] < arr[j]가 참인 경우가 하나씩 나올 경우 result[i]의 값에 1씩 더함(= 순위가 1씩 내려감)
// 6. 이후 result[]의 요소들을 전부 출력하여 요소들의 크기 순위 출력 완료
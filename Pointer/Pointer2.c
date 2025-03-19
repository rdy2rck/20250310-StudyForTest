#include <stdio.h>
int main() {
  int a[4] = {0, 2, 4, 8};
  int b[3];
  int* p;
  int sum = 0;

  for (int i=1; i<4; i++) {
    p = a+i;
    b[i-1] = *p - a[i-1];
    sum = sum + b[i-1] + a[i];
  printf("%d", sum);
  }
}




// 풀이
int main() {
  int a[4] = {0, 2, 4, 8}; // 1. 배열 a를 {0, 2, 4, 8}로 초기화
  int b[3]; // 2. 크기가 3인 배열 b를 선언
  int* p; // 3. 포인터 p를 선언
  int sum = 0; // 4. 정수 변수 sum을 초기화

  for (int i=1; i<4; i++) { // 8. i가 1부터 3까지 도달할 때 까지 반복
    p = a+i; // 5. p를 배열 a의 i번째 요소로 설정 ex) p = a+1 => a[1] => 2
    b[i-1] = *p - a[i-1]; // 6. 배열 b의 b[i-1] 위치에 a[i] - a[i-1]을 계산하여 저장 ex) i=1, b[1-1] = a[1] - a[0] = 2 - 0 => b[0] = 2
    sum = sum + b[i-1] + a[i]; // 7. sum에 b[i-1]과 a[i]를 더함 ex) i=1, sum = sum + b[0] + a[1] = 0 + 2 + 2 = 4
  }
  printf("%d", sum); // 9. sum의 최종값 '22' 출력
}

// 문제의 핵심 포인트

// 배열과 포인터를 함께 사용하여 주어진 조건에 맞게 계산하는 문제
// p = a+i => p = a[i] => *p = a[i] : 포인터 p의 위치를 배열의 i번째 원소에 설정 (배열에서는 index 를 사용함에 주의)
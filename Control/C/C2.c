// 다음 C언어로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

#include <stdio.h>
main() {
  int s, el = 0;
  for (int i=6; i<= 30; i++) {
    s=0;
    for (int j = 1; j <= i/2; j++) {
      if(i % j == 0)
        s = s + j;
    }
    if (s == i)
      el++;
  }
  printf("%d", el);
}

// 풀이
main() {
  int s, el = 0; // 1. 정수형 변수 s(약수의 합)와 el(완전수 개수)을 0으로 초기화
  for (int i=6; i<= 30; i++) { // 2. 변수가 6에서 시작해서 1씩 증가하면서 30이 될 때 까지 반복
    s=0; // 3. 2번이 반복될 때 마다 s(약수의 합)의 값을 0으로 초기화
    for (int j = 1; j <= i/2; j++) { // 4. 2번이 한 번 실행될 때 마다 반복변수 j가 1부터 시작해서 i/2가 될 떄 까지 반복(자기 자신을 제외한 약수 찾기)
      if(i % j == 0) // 5. i를 j로 나눈 나머지가 0이면(= j가 i의 약수라면) 6번으로 이동, 아니면 4번으로 이동
        s = s + j; // 6. i%j==0이면 s(약수의 합)에 j 값을 더하고 다시 4번으로 이동
    }
    if (s == i) // 7. s(약수의 합)와 i의 값이 같으면(= 완전수라면) 8번으로 이동, 아니면 2번으로 이동
      el++; // 8. 7번이 true 일 때 마다 el(완전수 개수)에 1씩 더함
  }
  printf("%d", el); // 9. 2~8번 과정이 완료됐을 경우 정수 el(완전수 개수)을 출력
}


// 문제의 핵심 포인트
// 1. '완전수'의 갯수를 찾는 코드
// 1-1. 완전수란? = 자시 자신을 제외한 약수의 합이 자기 자신과 같은 수 ex) 28 = 1+2+4+7+14=28
// 1-2. i는 정수, j는 약수이므로, i를 j로 나누어서 0이 되어야(= j는 i의 약수여야) 함
// 1-3. if 조건문에서 true로 나온 j(약수)의 값을 모두 더해서 i(정수)와 같으면 완전수, 아니면 불완전수 (if (s == i) => el++ (O), if(i%j==0) (X))
// 1-4. 이중 for문 중 바깥쪽은 완전수를 찾을 범위를, 안쪽은 자기 자신을 제외한 약수를 찾는 범위
// 1-5. 완전수는 1부터 100까지는 6과 28, 총 2개 밖에 없음
// 2. 이중 for문은 바깥쪽부터 먼저 1회 실행한 다음 안쪽을 전부 반복함

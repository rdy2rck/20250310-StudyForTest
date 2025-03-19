#include <stdio.h> 
int main() { 
  int ary[3];
  int s = 0;
  *(ary + 0) = 1;
  ary[1] = *(ary + 0) + 2;
  ary[2] = *ary + 3;
  for (int i = 0; i < 3; i++)
    s = s + ary[i];
  printf("%d", s);
}




// 풀이
int main() { 
  int ary[3]; // 1. 크기가 3인 정수형 배열 ary를 선언
  int s = 0; // 2. 정수형 변수 s를 0으로 초기화
  *(ary + 0) = 1; // 3. 'ary + 0 => ary[0]의 주소(&ary[0])'이므로, *(ary + 0) = *(*ary[0]) = ary[0] = 1 이 됨
  ary[1] = *(ary + 0) + 2; // 4. 3에서 이미 *(ary + 0)이 1이므로 ary[1] = 1 + 2 = 3 이 됨
  ary[2] = *ary + 3; // 5. ary는 ary[0]의 주소를 가리키므로 *ary = *(*ary[0]) = ary[0] = 1, 따라서 ary[2] = 1 + 3 = 4
  for (int i = 0; i < 3; i++) // 7. 6번을 i가 0부터 2까지 도달할 때 까지 반복 = ary[0] + ary[1] + ary[2]
    s = s + ary[i]; // 6. ary[i]의 값을 이전 s의 값과 합한 후 s로 반환
  printf("%d", s); // 8. 7번의 반복문 최종값인 s = ary[0] + ary[1] + ary[2] = 1 + 3 + 4 = 8 을 출력
}

// 문제의 핵심 포인트

// 포인터 연산(*, +)을 이용해서 배열에 요소에 접근하기
// 1. ary + n은 배열 요소 ary[n]의 '주소'(&ary[n])를 의미. 즉 ary + n을 포인터(*)로 참조할 경우 '참조'가 아닌 '역참조'가 이루어져 ary[n]의 주소가 아니라 값이 반환됨
// 2. 포인터 연산에서 '*'은 역참조를, '+'는 주소 증가의 연산자 역할을 함
// 3. 포인터 연산에서 *(ary + n) = ary[n]
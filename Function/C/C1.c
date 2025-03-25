// 다음 C언어로 구현된 프로그램을 분석하여 5를 입력했을 때 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)

#include <stdio.h> 
int func(int a) { 
  if (a <= 1) return 1; 
  return a * func(a - 1); 
} 
int main() { 
  int a; 
  scanf("%d", &a); 
  printf("%d", func(a)); 
}

// 풀이
int func(int a) { // 4. 사용자 정의 함수 func 선언
  if (a <= 1) return 1; // 5. a가 1보다 같거나 작을 경우 1 반환, a의 값은 5이니 6번으로 이동
  return a * func(a - 1); // 6. a-1을 인수로 한 func 함수를 호출한 뒤 func(a-1)의 반환값과 a의 값을 곱함
} 
int main() { 
  int a; // 1. 정수형 변수 a를 선언
  scanf("%d", &a); // 2. 사용자가 입력한 a의 값을 저장함. 여기서는 '5'
  printf("%d", func(a)); // 3. 5를 인수로 하여 사용자 정의 함수 func을 호출한 뒤 정수로 값을 출력
}

// 계산
// 1. func(5) = 5 * func(4) => func(4)의 값을 구해야 하므로 func(4) 호출
// 2. func(4) = 4 * func(3) => func(3)의 값을 구해야 하므로 func(3) 호출
// 3. func(3) = 3 * func(2) => func(2)의 값을 구해야 하므로 func(2) 호출
// 4. func(2) = 2 * func(1) => func(1)의 값을 구해야 하므로 func(1) 호출
// 5. func(1) = 1 * func(0) => a가 1보다 같거나 작을 경우 1를 반환하므로 func(0)은 1 반환 => func(1) = 1 * 1 = 1
// 6. func(2) = 2 * 1 = 2
// 7. func(3) = 3 * 2 = 6
// 8. func(4) = 4 * 6 = 24
// 9. func(5) = 5 * 24 = 120
// 10. 따라서 a의 값이 5일 경우 printf("%d", func(a)) = 120


// 문제의 핵심 포인트
// 1. '재귀함수(n!)'를 구하는 코드
// 2. 사용자 정의 함수가 함수 안에서 자기 자신을 호출할 경우에는 조건에 맞춰서 똑같이 호출하면 됨
// 3. 재귀함수는 끝까지 호출될 수 있기 때문에 종료 조건(보통 if ~ return문)을 반드시 이해해야 함 ex) 종료 조건 : if (a <= 1) return 1;
// 4. 재귀 호출은 마지막 호출부터 역순으로 실행됨(LIFO) ex) 호출 : func(5) → func(4) → func(3) → func(2) → func(1) => 실행 : func(1) → func(2) → func(3) → func(4) → func(5)
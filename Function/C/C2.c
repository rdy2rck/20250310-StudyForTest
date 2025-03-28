// 다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)

#include <stdio.h> 
int r1() { 
  return 4; 
} 
int r10() { 
  return (30 + r1()); 
} 
int r100() { 
  return (200 + r10()); 
} 
int main() { 
  printf("%d\n", r100()); 
  return 0; 
}

// 풀이
int r1() { 
  return 4; // 4. 사용자 정의 함수 r1() = 4의 값을 반환받았으니 r10() & r100()도 계산
} 
int r10() { 
  return (30 + r1()); // 3. r10()의 값을 구하기 위해 r1() 호출
} 
int r100() { 
  return (200 + r10()); // 2. r100()의 값을 구하기 위해 r10() 호출
} 
int main() { 
  printf("%d\n", r100()); // 1. 사용자 정의 함수 r100()의 정수값을 출력하기 위해 r100() 호출
  return 0; // 5. 계산이 끝난 r100()의 정수값을 출력 후 종료
}

// 계산
// 1. r1() = 4
// 2. r10() = 30 + 4 = 34
// 3. r100() = 200 + 34 = 234
// 4. 따라서 printf("%d\n", r100()) = 234


// 문제의 핵심 포인트
// 1. '함수 호출의 호름과 반환값 전달 방식'을 이해했는지 묻는 문제
// 2. 자기 자신을 호출하는 사용자 정의 함수는 똑같이 그 조건에 맞는 사용자 정의 함수를 호출하면 됨
// 3. 값을 반환하는 순서는 함수를 호출하는 순서의 '정 반대' ex) 호출 : r100() → r10() → r1() => 반환 : r1() → r10() → r100()

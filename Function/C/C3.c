// 다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)

#include <stdio.h> 
main() { 
  int res = mp(2, 10); // 1. 사용자 정의 함수 mp(2, 10)의 값을 가지는 정수형 변수 res를 선언
  printf("%d", res); // 2. res의 값을 정수로 출력하기 위해 사용자 정의 함수 mp 호출
} 
int mp(int base, int exp) { // 3. 정수형 변수 base와 exp를 가진 사용자 정의 함수 mp를 선언
  int res = 1; // 4. 정수형 변수 res를 1로 초기화
  for (int i = 0; i < exp; i++) // 5. 반복 변수 i를 0으로 초기화 한 뒤 exp보다 작을 때 까지 1씩 더하면서 반복
    res *= base; // 6. res의 값에 base의 값을 곱하면서 누적
  return res; // 7. 반복이 끝난 res의 값을 반환함
}

// 계산
// 1. mp(2, 10) => base = 2, exp = 10
// 2. int res = 1; => res = 1
// 3. for (int i = 0; i < 10; i++) => i가 0부터 9까지 도달할 때 까지 총 '10번' 반복
// 4. 1회 반복 : 1 * 2 = 2
// 5. 2회 반복 : 2 * 2 = 4
// 6. 3회 반복 : 4 * 2 = 8
// 7. 4회 반복 : 8 * 2 = 16
// 8. 5회 반복 : 16 * 2 = 32
// 9. 6회 반복 : 32 * 2 = 64
// 10. 7회 반복 : 64 * 2 = 128
// 11. 8회 반복 : 128 * 2 = 256
// 12. 9회 반복 : 256 * 2 = 512
// 13. 10회 반복 : 512 * 2 = 1024
// 14. return res => 1024
// 15. 따라서 printf("%d", res) => 1024


// 문제의 핵심 포인트
// 1. '거듭제곱'을 구하는 함수
// 2. 'res *= base'는 base의 값을 res에 곱한 결과를 res에 계속 누적시키는 것
// 3. main에서 사용자 정의 함수를 호출할 때 변수 선언 없이 그냥 값만 가지고 호출할 경우엔 그 값을 그대로 대입하여 계산 ex) mp(int base, int exp) => mp (2, 10) => mp (int 2, int 10)
// 4. 거듭제곱을 구할 때는 '초기값'에 따라서 결과가 달라지므로 초기값이 무엇인지 자세하게 볼 것
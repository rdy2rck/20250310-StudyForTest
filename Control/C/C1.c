// 다음은 정수를 역순으로 출력하는 C언어 프로그램이다. 예를 들어 1234의 역순은 4321이다. 단, 1230 처럼 0으로 끝나는 정수는 고려하지 않는다. 프로그램을 분석하여 괄호 안에 들어간 'a', 'b', 'c'에 들어갈 알맞은 연산자를 쓰시오

#include <stdio.h>

int main() {
  int number = 1234;
  int div = 10, result = 0;

  while (number ('a') 0) {
    result = result * div;
    result = result + number ('b') div;
    number = number ('c') div;
  }
  printf("%d", result);
}

// 풀이
int main() {
  int number = 1234; // 1. 정수형 변수 number를 1234로 초기화
  int div = 10, result = 0; // 2. 정수형 변수 div를 10으로, 결과값 result를 0으로 초기화

  while (number ('a') 0) { // 3. number가 0이 될 때 까지 반복하도록 설정
    result = result * div; // 4. 현재 result 값을 div(10)배 만큼 곱하기 = 자릿수 증가
    result = result + number ('b') div; // 5. number의 마지막 자릿수를 result에 추가 = 일의 자리 숫자 추출
    number = number ('c') div; // 6. number의 마지막 자릿수를 제거하기 위해 div(10)으로 나눔
  }
  printf("%d", result); // 7. 결과값 출력
}
// 8. 따라서 'a','b','c'에 들어갈 문자는
// 9. while (number ('a') 0) => number가 0이 아닐 때 반복해야 함 => number가 0보다 커야 함 = number > 0 => 'a' = >
// 10. result = result + number ('b') div; => number의 마지막 자릿수를 result에 추가해야 함 => 모든 숫자의 마지막 자릿수는 숫자 / 10 의 나머지임 => result = result + number % div; => 'b' = %
// 11. number = number ('c') div; => number의 마지막 자릿수를 제거하기 위해 div(10)으로 나눠야 함 => number = number / div;
// 12. 답 : a='>', b='%', c='/'

// 문제의 핵심 포인트
// 1. 정수를 '역순으로' 출력하는 코드를 구현하는 문제 (예 : 1234 → 4321)
// 2. 'div'는 그냥 변수의 이름에 불과함 (딱히 특별한 기능이나 역할 같은 거 없음)
// 3. while ()의 () 안에 비교연산식이 있을 경우 해당 조건이 맞춰질 때 까지 반복 (※ while(1)일 경우에는 무한반복)
// 4. 프로그래밍에서 정수 역순 출력을 위해선 다음과 같은 과정을 거쳐야 함
// 4-1. 먼저 정수를 배정할 변수(number)와 나머지를 배정할 변수(result)를 정하기
// 4-2. number에 배정된 정수를 10으로 나눈 나머지를 result의 값과 합치기 (result = result + number % 10)
// 4-3. number에 배정된 정수를 다시 10으로 나눈 뒤 나온 값을 number로 새로 지정 (number = number / 10)
// 4-4. 6번에서 구한 result에 10을 곱해서 자릿수을 1씩 올림 (result = result * div)
// 4-5. number가 0이 될 때 까지 반복 (while (number > 0))
// 5. 숫자를 뒤집거나 지릿수를 하나씩 추출하는 문제에는 나머지 연산자(%)와 나눗셈(/)을 사용함
// 5-1. 마지막 자리를 가져와야 할 때는 number % 10 사용 ex) 1264 % 10 => 4, 6, 2, 1
// 5-2. 마지막 자리를 제거해야 할 때는 number / 10 사용 ex) 1264 / 10 => 126, 12, 1, 0

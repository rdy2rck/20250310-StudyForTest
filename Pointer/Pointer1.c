#include <stdio.h>
int len(char* p);

int main() {
  char* p1 = "2022";
  char* p2 = "202207";
  int a = len(p1);
  int b = len(p2);
  printf("%d", a+b);
}

int len(char* p) {
  int r = 0;
  while (*p != '\0') {
    p++;
    r++;
  }
  return r;
}




// 풀이
int len(char* p);

int main() {
  char* p1 = "2022"; // 1. 문자열 "2022"의 시작 주소를 p1에 포인터로 저장
  char* p2 = "202207"; // 2. 문자열 "202207"의 시작 주소를 p2에 포인터로 저장
  int a = len(p1); // 8. p1 호출 & 문자열 "2022"의 길이 대입
  int b = len(p2); // 9. p2 호출 & 문자열 "202207"의 길이 대입
  printf("%d", a+b); // 10. a+b = len(p1)+len(p2) = 4+6 = 10 출력
}

int len(char* p) {
  int r = 0; // 3. 문자열 길이를 표시하는 변수 r을 0으로 초기화
  while (*p != '\0') { // 6. 포인터가 null 문자(\0)에 도달할 때 까지 반복
    p++; // 4. 포인터를 다음 문자로 1씩 이동 
    r++; // 5. 포인터가 다음 문자로 이동할 때 마다 길이 1씩 증가
  }
  return r; // 7. 반복 종료 & 결과값 r 반환
}

// 문제의 핵심 포인트

// 문자열과 포인터, 포인터 연산을 다루는 문제
// 포인터(*)로 문자열을 지정하면(char* p1 = "2022") 해당 문자열의 시작 주소("2022" → "2" 저장)를 포인터에 저장한다는 의미
// len() => 문자열의 '길이'를 구하는 함수
// '\0' => 문자열의 마지막(null 문자)
// while (*p != '\0') => 포인터를 문자열 끝까지 이동
// p++ => 포인터를 '다음 문자'로 이동

// 비슷한 유형의 문제

// 1. 문자열 거꾸로 출력
void reversePrint(char* p) {
  char* end = p; // 1. 문자열의 시작 위치(p)를 end에 설정
  while (*end != '\0') { // 3. end가 null 문자('\0')에 도달할 경우 정지
    end++; // 2. end를 한 칸씩 이동하며 문자열의 끝까지 이동
  }
  end--;  // 4. end를 null 문자('\0')에서 한 칸 뒤로(= 마지막 문자로) 되돌리기
  while (end >= p) { // 7. end가 시작 위치(p)에 도달하면(= 첫 글자에 도달하면) 중단
    printf("%c", *end); // 5. end가 현재 가리키고 있는 문자를 출력
    end--; // 6. end를 한 칸씩 왼쪽(= 역순)으로 이동
  }
}

// 2. 특정 문자의 갯수 세기
int countChar(char* p, char target) { 
  int count = 0; // 1. 'target' 문자를 세는 변수 count를 0으로 초기화
  while (*p != '\0') { // 5. 문자열의 null 문자('\0')에 도달할 경우 정지
    if (*p == target) { // 2. 문자가 'target'에 할당된 문자가 같을 경우 작동
      count++; // 3. 2의 조건이 맞을 경우 변수 count를 1씩 증가
    }
    p++; // 4. 포인터 p를 다음 문자로 한 칸 이동
  }
  return count; // 6. 최종적으로 찾은 target 문자의 갯수 count를 반환
}
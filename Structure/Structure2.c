#include <stdio.h> 
main() { 
  struct insa { // 1. 구조체 'insa' 선언
    char name[10];  // 2. 구조체 'insa'의 문자 배열 'name[10]' 선언
    int age; // 3. 구조체 'insa'의 정수형 변수 'age' 선언 
  } a[] = { "Kim", 28, "Lee", 38, "Park", 42, "Choi", 31 }; // 4. 초기화값에 따른 구조체 4개를 요소로 가진(a[4]) 구조체 배열 a[] 선언
  struct insa* p; // 5. 구조체 insa를 가리키는 포인터 'p' 선언
  p = a; // 6. 구조체 배열 'a'의 첫번째 요소(a[0])의 주소를 포인터 'p'에 할당
  p++; // 7. 'p'를 한 칸 이동시켜 구조체 배열 'a'의 두번째 요소(a[1])의 주소를 가리키도록 설정
  printf("%s\n", p->name); // 8. 포인터 'p'가 가리키는 a[1]의 name을 출력 => "Lee"
  printf("%d\n", p->age); // 9. 포인터 'p'가 가리키는 a[1]의 age를 출력 => 38
}

// 문제의 핵심 포인트

// 구조체 배열을 포인터로 접근하는 방식에 대한 개념을 묻는 문제
// 구조체 배열을 선언할 때 배열의 크기를 명시하지 않아도, 초기화값을 같이 사용할 경우 배열 크기가 초기화 값에 따라 자동으로 지정됨
// 포인터 주소 지정 및 이동 방식은 포인터 배열과 똑같음(Pointer1 & Pointer3 참고)
// 포인터를 출력하라는 문제가 나오면 '지금 포인터가 뭘 가리키고 있는 지'를 파악하는 것이 중요


// 비슷한 유형의 문제 풀이

// 구조체 배열에서 구조체 요소에 포함된 배열을 호출할 경우엔 '배열 자체가 호출'됨
// 구조체 요소에 포함된 배열 안의 요소에 접근하기 위해서는 (포인터)->(배열)[인덱스]로 접근 가능 ex) p->name[1] => 현재 포인터 'p'가 가리키고 있는 구조체의 배열 'name'의 인덱스 '1' 위치에 있는 요소 출력
// 구조체 배열에서 포인터를 이동할 때는 포인터 배열과 마찬가지로 p++(한 칸 이동) or p + n(n칸 이동) 을 이용하여 이동 가능


// 비슷한 유형의 문제

// ex) printf("%c\n", p->name[i]);
// 1. 포인터 'p'가 가리키고 있는 구조체 배열의 구조체 a[n]를 파악하기
// 2. 포인터 'p'가 현재 가리키는 구조체 a[n]의 배열 'name'이 무엇인지 파악하기;
// 3. 2번에서 파악한 배열 'name'의 index 'i'에 해당되는 문자를 찾은 후 출력
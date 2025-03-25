// 다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)

package Function.Java;

public class Java3 { 
  static int[ ] arr( ) { 
    int a[ ] = new int[4]; 
    int b = a.length; 
    for(int i = 0; i < b; i++) 
      a[i] = i; 
    return a; 
  } 
  public static void main(String[ ] args) { 
    int a[ ] = arr( ); 
    for(int i = 0; i < a.length; i++) 
      System.out.print(a[i] + " "); 
  } 
}

// 풀이
public class Java3 { 
  static int[ ] arr( ) { // 1. 정수형 배열을 구하는 사용자 정의 함수 arr() 선언
    int a[ ] = new int[4]; // 2. 배열의 크기가 4인 정수형 배열 a[] 선언
    int b = a.length; // 3. 배열 a[]의 길이를 값으로 하는 정수형 변수 b 선언, b = 4
    for(int i = 0; i < b; i++) // 4. 반복 변수 i를 0부터 시작해서 b보다 작을 때 까지 1씩 증가시키면서 반복
      a[i] = i; // 5. i의 값을 배열 a[]의 a[i] 위치에 할당시킴
    return a; // 6. 반복이 끝난 후 완성된 배열 a[]를 반환 (중요!)
  } 
  public static void main(String[ ] args) { 
    int a[ ] = arr( ); // 7. 사용자 정의 함수 arr()를 호출한 뒤 arr()의 값을 정수형 배열 a[]에 할당
    for(int i = 0; i < a.length; i++) // 8. 반복 변수 i를 0부터 시작해서 배열 a[]의 길이보다 작을 때 까지 1씩 증가시키면서 반복
      System.out.print(a[i] + " "); // 9. 배열 a[]의 요소들을 공백을 추가하면서 하나씩 출력 = 0 1 2 3
  } 
}

// 문제의 핵심 포인트
// 1. ' 배열의 크기'와 '배열 요소의 접근 방법'에 대해서 물어보는 문제
// 2. 배열이름.length는 해당 배열의 길이를 정수값으로 반환하는 것
// 3. Java에서 배열의 이름만 호출해서 반환하는 경우는 배열의 참조값, 즉 '배열 자체가 반환'됨
// 3-1. 배열 이름 호출하여 반환할 경우 배열의 첫번째 요소(a[0])만 반환하는 건 'C언어'

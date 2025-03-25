// 다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)

package Function.Java;

public class Java1 { 
  static int[] mkarr( ) { 
  int[] tmpArr = new int[4]; 
  for (int i = 0; i < tmpArr.length; i++) 
    tmpArr[i] = i; 
  return tmpArr; 
  } 
  public static void main(String[] args) { 
    int[] arr; 
    arr = mkarr( ); 
    for (int i = 0; i < arr.length; i++) 
      System.out.print(arr[i]); 
  } 
}

// 풀이
public class Java1 { 
  static int[] mkarr( ) {  // 1. 정수형 배열을 반환하는 사용자 정의 함수 mkarr() 선언
  int[] tmpArr = new int[4]; // 2. 배열의 크기가 4인 정수형 배열 tmpArr 선언
  for (int i = 0; i < tmpArr.length; i++)  // 3. 반복 변수가 0부터 시작해서 tmpArr의 크기(= 4)보다 작을 때 까지 1씩 증가하면서 반복
    tmpArr[i] = i; // 4. 배열 tmpArr[]의 인덱스에 i의 값을 하나씩 대입함
  return tmpArr; // 5. 배열 tmpArr을 반환
  } 
  public static void main(String[] args) { 
    int[] arr; // 6. 정수형 배열 arr 선언
    arr = mkarr( ); // 7. 사용자 정의 함수 mkarr()을 선언한 후 배열 arr()에 mkarr()의 값을 할당
    for (int i = 0; i < arr.length; i++) // 8. 반복 변수가 0부터 시작해서 arr의 크기(= 4)보다 작을 때 까지 1씩 증가하면서 반복 
      System.out.print(arr[i]); // 9. 배열 arr의 값들을 전부 출력 = 0123
  } 
}
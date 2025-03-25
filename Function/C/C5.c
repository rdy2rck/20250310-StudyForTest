// 다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)

#include <stdio.h> 
void align(int a[ ]) { 
  int temp; 
  for (int i = 0; i < 4; i++) 
    for (int j = 0; j < 4 - i; j++) 
      if (a[j] > a[j+1]) { 
        temp = a[j]; 
        a[j] = a[j+1]; 
        a[j+1] = temp; 
      }
} 
main( ) { 
  int a[ ] = { 85, 75, 50, 100, 95 }; 
  align(a); 
  for (int i = 0; i < 5; i++) 
    printf("%d ", a[i]); 
}
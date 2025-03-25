// 다음 Java로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

package Java;

public class Java6 {
  public static void main(String[] args) {
    int a=0, sum=0;
    while (a<10) {
      a++;
      if (a%2 == 1)
        continue;
      sum +=a;
    }
    System.out.println(sum);
  }
}

// 풀이
public static void main(String[] args) {
  int a=0, sum=0; // 1. 정수형 변수 a를 0으로, sum을 0으로 초기화
  while (a<10) { // 2. 반복 변수 a가 10보다 작을 때 까지 while문 반복. a가 10이 되면 반복 중단 후 7번으로 이동
    a++; // 3. a의 값에 1을 더함 (++ 연산자)
    if (a%2 == 1) // 4. a를 2로 나눈 나머지가 1일 경우(= 홀수일 경우) 5번으로 이동, 아닐 경우(= 짝수일 경우) 6번으로 이동
      continue; // 5. 4번이 참일 경우(= 홀수일 경우)의 반복문 스킵. 다시 2번으로 이동함
    sum +=a; // 6. 4번이 참일 경우(= 짝수일 경우) sum에 a의 값을 누적시킴 (+= 연산자)
  }
  System.out.println(sum); // 7. while 반복문이 종료된 이후 짝수의 합을 모두 더한 sum의 값을 출력 = 30
}

// 계산
// 1회 반복 : a=1 / continue (O) / sum = 0
// 2회 반복 : a=2 / continue (X) / sum = 2
// 3회 반복 : a=3 / continue (O) / sum = 2
// 4회 반복 : a=4 / continue (X) / sum = 6
// 5회 반복 : a=5 / continue (O) / sum = 6
// 6회 반복 : a=6 / continue (X) / sum = 12
// 7회 반복 : a=7 / continue (O) / sum = 12
// 8회 반복 : a=8 / continue (X) / sum = 20
// 9회 반복 : a=9 / continue (O) / sum = 20
// 10회 반복 : a=10 / continue (X) / sum = 30


// 문제의 핵심 포인트
// 1. '짝수의 합'을 구하는 코드
// 2. if문에서 continue의 의미 : if문의 조건에 맞을 경우 나머지 코드를 실행하지 '않고' 다음 반복으로 이동 (계속 진행한다는 의미가 아님!)
// 3. while 문을 반복할 때 마다 a++가 먼저 실행됨 => a=0부터가 아니라 a=1부터 계산 시작
// 3.1. while 문이 반복 중단되는 순간은 a=9일 때가 아니라 a=10 일 때 => while 문 반복 시작 시 a++가 실행되므로 n회 반복 단계에서 a의 값은 n+1임 ex) 3회 반복 : a = 4
// 3-2. a=9일때 반복을 중단시키려면? => while 문의 마지막에 a++ 추가 (a=9 반복 완료 시 마지막에 a++가 실행되어 a=10이 되므로 while문의 반복 조건인 a<10에 벗어나면서 반복이 중단)

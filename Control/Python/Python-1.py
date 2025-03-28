# 다음 Python으로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

a = 100
result = 0
for i in range(1,3):
  result = a >> i
  result = result + 1
print(result)

# 풀이
a = 100 # 1. 변수 a에 100을 할당
result = 0 # 2. result를 0으로 초기화
for i in range(1,3): # 5. i가 1부터 2에 도달할 때 까지 반복 (1, 2)
  result = a >> i # 3. a는 i비트 만큼 오른쪽으로 시프트(2진법)
  result = result + 1 # 4. 결과값 result에 1을 더함 (반복 시 결과값 누적 X)
print(result) # 6. 결과값 result 출력

# 계산
1. a = 100;
2. result = 0;
3. a>>1 => 100>>1 => 1100100 => 011010 => 50
4. result = 50 + 1 = 51
5. a>>2 => 100>>2 => 1100100 => 001101 => 25
6. result = 25 + 1 = 26

# 문제의 핵심 포인트
# 1. 파이선의 for 문에서 range(a, b)는 a부터 'b-1' 까지 반복하라는 의미 (a 부터 'b' 까지 반복하라는 의미가 아님!)
# 2. 기본적으로 오른쪽 시프트(>>) = 나누기(/)와 같은 의미 ex) 50>>2 = 50/2 = 25
# 3. <<, >>는 크기값 비교가 아니라 이진수로 자리를 시프트한다는 표시
# 4. for문이 반복 할 때 마다 결과값(result)를 계속 누적하는지 아니면 그냥 초기화하는 지 주의깊게 살피기
# ps. 결과값을 누적할려면? result = a>> 1 <br/> result = result + 1 (X) result += a >> i + 1 (O)

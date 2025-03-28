# 다음 Python으로 구현된 프로그램을 분석하여 실행 결과를 쓰시오 (출력문의 출력 서식을 준수하시오)

lol = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]
print(lol[0])
print(lol[2][1])
for sub in lol:
  for item in sub:
    print(item, end='')
  print()

# 풀이
lol = [[1, 2, 3], [4, 5], [6, 7, 8, 9]] # 1. 리스트 안에 리스트가 들어가 있는 이차원 리스트 lol을 이해
print(lol[0]) # 2. 이차원 리스트 lol의 첫 번째(0) 리스트 선택 = [1, 2, 3]
print(lol[2][1]) # 3. 이차원 리스트 lol의 세 번째(2) 리스트의 두 번째(1) 요소 선택 = 7
for sub in lol: # 4. 이차원 리스트 lol의 각 하위 리스트를 하나씩 sub에 저장
  for item in sub: # 5. 4번에서 sub에 저장된 각 하위 리스트의 요소들을 하나씩 item에 저장
    print(item, end='') # 6. 5번에서 item에 저장한 요소들을 줄바꿈 & 공백 없이(end='') 출력
  print() # 7. 5번이 끝날 때 마다 줄바꿈 넣기

  # 풀이
  1. print(lol[0]) = [1, 2, 3]
  2. print(lol[2][1]) = 7
  3. print(item, end='') = 123(1번째 반복), 45(2번째 반복), 6789(3번째 반복)
  4. print() = <br/> 삽입
  5. 답
  [1, 2, 3]
  7
  123
  45
  6789

  # 문제의 핵심 포인트
  # 1. 이차원 리스트(=배열)을 이용한 문제 풀기
  # 2. 이차원 리스트 선택 & 출력 시엔 인덱스 사용 (n-1 번째 요소 출력)
  # 3. 이중 for문은 바깥쪽부터 먼저 1회 실행한 후 안쪽 실행을 전부 반복
  # 4. 출력 시 end=''는 공백 & 줄바꿈 없이 출력한다는 의미
  # 5. print()는 줄바꿈 삽입을 의미

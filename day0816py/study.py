# 숫자열 배열
math = 80; english = 70; korean = 60; science = 50
total = math + english + korean + science
average = total / 4
print("평균", str(int(average)) + "점") # int 를 붙여서 평균점수를 정수부분까지만 출력하게 해놓음, 또 str을 붙여 뒤에 바로 문장이 올수있게함

# 문자열 배열
weekdays = ["월요일", "화요일", "수요일", "목요일", "금요일"]
# 추가(append) - 배열 맨 마지막에 추가됨
weekdays.append("토요일")
# 삽입(insert) - 지정해준 위치 앞에 추가됨
weekdays.insert(2, "문자추가") # 0번째 월요일, 1번째 화요일, 2번째 수요일 -> 2번째는 수요일 수요일 앞에 "문자추가" 추가됨
print("문자배열", weekdays)

# 연습1
score = {"math": 60, "english": 50, "korean": 40, "science": 30 }
print("딕셔너리1:", score)
score["math"] = 82
print("딕셔너리2:", score)

# 리스트의 튜플? 을 다루는 함수: len, copy, in
print(len(weekdays))
# 2차원
data = [1, 2], [3, 4, 5], [6, 7, 8, 9]
print("1",len(data)) # data 배열의 요소 개수? -> [1, 2], [3, 4, 5], [6, 7, 8, 9] -> 3게
print("2",len(data[0])) # data 첫번째 요소인 배열안에 있는 요소의 개수 1,2 -> 2개
print("3",len(data[1])) # data 두번째 요소인 배열안에 있는 요소의 개수 3, 4, 5 -> 3개
print("4",len(data[2]))


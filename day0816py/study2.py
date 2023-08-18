a = 3 
if a % 2 == 0:
  print("a is even")
else: 
  print ("a is ood")

if "hello" in ("hello", "world"):
  print("포함")
else:
  print("미포함")
  
fruit = "banana"
if fruit == "apple":
  print("red")
elif fruit == "banana":
  print("yellow")
else:
  print("unknown")
  
a = 5
x= 10 if a > 0 else 20
print(x)

counter = 0
while counter < 20:
  print("counter:", counter)
  counter += 5

total = 0
index = 0
subject = (90, 80, 70, 60, 50)
while index < len(subject):
  total += subject[index]
  index += 1
average = total / len(subject)
print("while:", average)

total = 0
for score in subject:
  total += score
average = total / len(subject)
print("for:", average)
# hi = ("h", "i", "!")
for letter in "hi!":
  print("letter", letter)

# 마지막 포함하지 않음
total = 0
for val in range(10):
  print("val:", val)
  total += val
print("total", total)

# 시작값 포함, 종료값 미포함
total = 0
for val in range(3, 7):
  print("val:", val)
  total += val
print("total", total)

# 시작값 포함, 종료값 미포함, 증감
total = 0
for val in range(1, 8, 2):
  print("total", total)

# break, continue
count = 0
while True:
  if count > 3:
    break
  print("count:", count)
  count += 1
  
for val in range(5):
  print("val:", val)
  if val % 2 == 0:
    continue
  print("===")

def add(a, b):
  return a + b

ret = add(3, 4)
print("ret: ", ret)
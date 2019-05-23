# Python3 code to demonstrate
# each occurrence frequency using
# collections.Counter()
from collections import Counter

with open('test.txt', 'r') as file:
    data = file.read().replace('\n', '')

# using collections.Counter() to get
# count of each element in string
res = Counter(data)

# printing result
print("Count of all characters in GeeksforGeeks is :\n "
      + str(res))

# -*- coding: utf-8 -*-
"""
Created on Mon Feb  6 22:26:30 2023

@author: Shahad
"""
import pandas as pd
import time

# Read the data from the csv file
df = pd.read_csv('pcr_data.csv' , names=['ColA','ColB','ColC','ColD','ColE','ColF','ColG','ColH','ColI','ColJ','ColK'], skiprows=[0])

# Convert the values in column A and B to strings
dataX = [str(x) for x in df.ColA.tolist()]
dataY = [str(x) for x in df.ColB.tolist()]

# Join the strings in dataX to form the text
text = ''.join(dataX)

# Join the strings in dataY from index 1 to 10 to form the pattern
pattern = ''.join(dataY[1:10])

# Initialize a stack
stack = []
start=time.perf_counter()
# Loop through the text
for i in range(len(text)):
    # Push the current character to the stack
    stack.append(text[i])
    # If the length of the stack is equal to the length of the pattern
    if len(stack) == len(pattern):
        # Join the characters in the stack to form a substring
        substring = ''.join(stack)
        # If the substring is equal to the pattern
        if substring == pattern:
            # Return the index of the starting character of the substring
            print("Pattern found at index: ", i-len(pattern)+1)
            break
        # Pop the first character from the stack
        stack.pop(0)
else:
    # If the loop ends without a break, the pattern is not found
    print("Pattern not found")
print("the time is ",time.perf_counter()-start)
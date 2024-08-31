# -*- coding: utf-8 -*-
"""
Created on Mon Feb  6 22:22:27 2023

@author: Shahad
"""
import pandas as pd
import time

# Read the data from the csv file
df = pd.read_csv('pcr_data.csv',
                 names=['ColA', 'ColB', 'ColC', 'ColD', 'ColE', 'ColF', 'ColG', 'ColH', 'ColI', 'ColJ', 'ColK'],
                 skiprows=[0])

# Convert the values in column A and B to strings
dataX = [str(x) for x in df.ColA.tolist()]
dataY = [str(x) for x in df.ColB.tolist()]

# Join the strings in dataX to form the text
text = ''.join(dataX)
pattern = ''.join(dataY[1:10])

# Store the length of the text and pattern
n = len(text)
m = len(pattern)

# Create a 2D array to store the characters of the substrings
substring_arr = []
start=time.perf_counter()
# Loop through the text
for i in range(n):
    # Add the current character to the last row of the substring array
    if len(substring_arr) == 0:
        substring_arr.append([text[i]])
    else:
        substring_arr[-1].append(text[i])

    # If the length of the last row in the substring array is equal to the length of the pattern
    if len(substring_arr[-1]) == m:
        # Join the characters in the last row of the substring array to form a substring
        substring = ''.join(substring_arr[-1])

        # If the substring is equal to the pattern
        if substring == pattern:
            # Return the index of the starting character of the substring
            print("Pattern found at index: ", i - m + 1)
            break

        # Remove the first character from the last row of the substring array
        substring_arr[-1].pop(0)
else:
    # If the loop ends without a break, the pattern is not found
    print("Pattern not found")
print("the time is ",time.perf_counter()-start)
# -*- coding: utf-8 -*-
"""
Created on Mon Feb  6 22:27:59 2023

@author: Shahad
"""
# Import pandas library to read CSV file
import pandas as pd
import time

# Read the CSV file data_antibody, using names as the column names and skipping the first row using skiprows parameter
df = pd.read_csv('pcr_data.csv' , names=['ColA','ColB','ColC','ColD','ColE','ColF','ColG','ColH','ColI','ColJ','ColK'], skiprows=[0])

# Convert the first column of the data frame to a list of strings
dataX = [str(x) for x in df.ColA.tolist()]
# Convert the second column of the data frame to a list of strings
dataY = [str(x) for x in df.ColB.tolist()]

# Join the elements in dataX and dataY into strings pattern_1 and pattern_2, respectively
pattern_1 = ''.join(dataX)
pattern_2 = ''.join(dataY[1:10])

# Define the function search_pattern to find the pattern in the given text
def search_pattern(text, pattern):
    n, m = len(text), len(pattern)
    # If the pattern is empty, return 0
    if m == 0:
        return 0

    # Initialize an empty dictionary hash_map
    hash_map = {}
    # Loop through the text from 0 to n-m
    for i in range(n - m + 1):
        # Get the substring of the text from i to i+m
        s = text[i:i+m]
        # If s is not in the hash_map, add s as a key to the hash_map and set its value to i
        if hash_map.get(s, 0) == 0:
            hash_map[s] = i
    # Loop through the values in the hash_map
    for i in hash_map.values():
        # If the text from i to i+m is equal to the pattern, return i
        if text[i:i+m] == pattern:
            return i
    # If the pattern is not found, return -1
    return -1
start=time.perf_counter()
# Call the search_pattern function with pattern_1 and pattern_2 as arguments
result = search_pattern(pattern_1, pattern_2)
# If the result is not -1, print "Pattern found at index: " followed by the result
if result != -1:
    print("Pattern found at index: ", result)
# If the result is -1, print "Pattern not found"
else:
    print("Pattern not found")
print("the time is ",time.perf_counter()-start)
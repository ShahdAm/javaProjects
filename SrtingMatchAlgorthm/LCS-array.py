# -*- coding: utf-8 -*-
"""
Created on Mon Feb  6 22:32:33 2023

@author: Shahad
"""
#Import pandas library to read CSV file
import pandas as pd
import time

# Load the data from the csv file into a pandas dataframe
df = pd.read_csv('pcr_data.csv' , names=['ColA','ColB'], skiprows=[0])

# Convert the data from the dataframe into a list of integers
dataX = [int(x) for x in df.ColA.tolist()]
dataY = [int(x) for x in df.ColB.tolist()]

# Convert the list of integers into a list of strings
dataX = [str(x) for x in dataX]
dataY = [str(x) for x in dataY]

# Join the lists into two strings to be used as the input patterns
pattern_1 = ''.join(dataX[0:40])
pattern_2 = ''.join(dataY[0:10])

# Define a function to calculate the length of the LCS between two patterns
def lcs_length(x, y):
    m = len(x)
    n = len(y)
    c = [[0 for j in range(n + 1)] for i in range(m + 1)]
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if x[i - 1] == y[j - 1]:
                c[i][j] = c[i - 1][j - 1] + 1
            else:
                c[i][j] = max(c[i][j - 1], c[i - 1][j])
    return c

# Call the lcs_length function to get the length of the LCS
c = lcs_length(pattern_1, pattern_2)

# Define a function to print the LCS using an array
def print_lcs(c, x, y, i, j):
    if i == 0 or j == 0:
        return []
    if x[i - 1] == y[j - 1]:
        return print_lcs(c, x, y, i - 1, j - 1) + [x[i - 1]]
    if c[i][j - 1] > c[i - 1][j]:
        return print_lcs(c, x, y, i, j - 1)
    return print_lcs(c, x, y, i - 1, j)
start=time.perf_counter()
# Call the print_lcs function to get the LCS string
lcs = print_lcs(c, pattern_1, pattern_2, len(pattern_1), len(pattern_2))

# Print the length and LCS string
print("Length of LCS:", c[len(pattern_1)][len(pattern_2)])
print("LCS:", ''.join(lcs))
print("the time is ",time.perf_counter()-start)

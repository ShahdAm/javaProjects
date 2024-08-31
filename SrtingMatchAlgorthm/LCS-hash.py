# -*- coding: utf-8 -*-
"""
Created on Mon Feb  6 22:32:34 2023

@author: Shahad
"""
#Import pandas library to read CSV file
import pandas as pd
import time

# Load the data from the csv file into a pandas dataframe
df = pd.read_csv('pcr_data.csv', names=['ColA', 'ColB'], skiprows=[0])

# Convert the data from the dataframe into a list of integers
dataX = [int(x) for x in df.ColA.tolist()]
dataY = [int(x) for x in df.ColB.tolist()]

# Convert the list of integers into a list of strings
dataX = [str(x) for x in dataX]
dataY = [str(x) for x in dataY]

# Join the lists into two strings to be used as the input patterns
pattern_1 = ''.join(dataX[0:40])
pattern_2 = ''.join(dataY[0:10])

# Define a function to calculate the length of the LCS between two patterns using a hash table
def lcs_length_hash(x, y):
    m = len(x)
    n = len(y)
    c = [{} for i in range(m + 1)]
    b = [{} for i in range(m + 1)]
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if x[i - 1] == y[j - 1]:
                c[i][j] = c[i - 1].get(j - 1, 0) + 1
                b[i][j] = 'diagonal'
            elif c[i - 1].get(j, 0) >= c[i].get(j - 1, 0):
                c[i][j] = c[i - 1].get(j, 0)
                b[i][j] = 'top'
            else:
                c[i][j] = c[i].get(j - 1, 0)
                b[i][j] = 'left'
    return c, b

# Call the lcs_length_hash function to get the length and direction of the LCS
c, b = lcs_length_hash(pattern_1, pattern_2)

# Define a function to print the LCS using a hash table
def print_lcs_hash(b, x, i, j):
    lcs = []
    while i > 0 and j > 0:
        if b[i][j] == 'diagonal':
            lcs.append(x[i - 1])
            i -= 1
            j -= 1
        elif b[i][j] == 'top':
            i -= 1
        else:
            j -= 1
    return ''.join(reversed(lcs))
start=time.perf_counter()
# Call the print_lcs_hash function to get the LCS string
lcs = print_lcs_hash(b, pattern_1, len(pattern_1), len(pattern_2))

# Print the length and LCS string
print("Length of LCS:", c[len(pattern_1)][len(pattern_2)])
print("LCS:", lcs)
print("the time is ",time.perf_counter()-start)
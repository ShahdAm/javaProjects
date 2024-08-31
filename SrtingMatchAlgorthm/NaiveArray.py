# -*- coding: utf-8 -*-
"""
Created on Mon Feb  6 22:32:32 2023

@author: Shahad
"""
#Import pandas library to read CSV file
import csv
import time

def search(pat, txt):
    M = len(pat)
    N = len(txt)
  
    # A loop to slide pat[] one by one */
    for i in range(N - M + 1):
        j = 0
  
        # For current index i, check
        # for pattern match */
        while(j < M):
            if (txt[i + j] != pat[j]):
                break
            j += 1
  
        if (j == M):
            print("Pattern found at index ", i)

def read_csv(file_name, column_a, column_b):
    data = []
    with open(file_name, 'r') as file:
        reader = csv.reader(file)
        header = next(reader)
        if column_a not in header or column_b not in header:
            print(f"Error: One or both of the columns ({column_a}, {column_b}) are not present in the header row of the CSV file.")
            return data
        a_index = header.index(column_a)
        b_index = header.index(column_b)
        for row in reader:
            data.append((row[a_index], row[b_index]))
    return data

if __name__ == '__main__':
    start=time.perf_counter()
    data = read_csv("pcr_data.csv", "column_a", "column_b")
    for row in data:
        search(row[0], row[1])
    print("the time is ",time.perf_counter()-start)
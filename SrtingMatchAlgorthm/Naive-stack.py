# -*- coding: utf-8 -*-
"""
Created on Mon Feb  6 22:28:00 2023

@author: Shahad
"""
import csv
import time 

class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return self.items == []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[len(self.items) - 1]

    def size(self):
        return len(self.items)


def search_hash(pat, txt):
    M = len(pat)
    N = len(txt)
    p = 0  # hash value for pattern
    t = 0  # hash value for txt
    h = 1
    d = 256

    stack = Stack()

    # The value of h would be "pow(d, M-1)%q"
    for i in range(M - 1):
        h = (h * d) % 101
        stack.push(h)

    # Calculate the hash value of pattern and first window of text
    for i in range(M):
        p = (d * p + ord(pat[i])) % 101
        t = (d * t + ord(txt[i])) % 101

    # Slide the pattern over text one by one
    for i in range(N - M + 1):
        # Check the hash values of current window of text
        # and pattern. If the hash values match then only
        # check for characters one by one
        if p == t:
            for j in range(M):
                if txt[i + j] != pat[j]:
                    break

            j += 1
            if j == M:
                print("Pattern found at index " + str(i))

        # Calculate hash value for next window of text: Remove
        # leading digit, add trailing digit
        if i < N - M:
            h = stack.peek()
            t = (d * (t - ord(txt[i]) * h) + ord(txt[i + M])) % 101

            # We might get negative values of t, converting it
            # to positive
            if t < 0:
                t = t + 101


def read_csv(file_name, column_a, column_b):
    data = []
    with open(file_name, 'r') as file:
        reader = csv.reader(file)
        header = next(reader)
        if column_a not in header or column_b not in header:
            print(
                f"Error: One or both of the columns ({column_a}, {column_b}) are not present in the header row of the CSV file.")
            return data
        a_index = header.index(column_a)
        b_index = header.index(column_b)
        for row in reader:
            data.append((row[a_index], row[b_index]))
    return data


# Driver program to test the above function
if __name__ == '__main__':
    start=time.perf_counter()
    data = read_csv("pcr_data.csv", "column_a", "column_b")
    print("the time is ",time.perf_counter()-start)

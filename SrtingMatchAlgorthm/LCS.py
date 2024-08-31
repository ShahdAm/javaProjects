#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Feb  7 00:34:19 2023

@author: r
"""

import pandas as pd
import sys
sys.setrecursionlimit(15000)
df = pd.read_csv('/Users/r/Desktop/P-ALG/data_antibody.csv' , names=['ColA','ColB'],skiprows=[0])
dataX = [int(x) for x in df.ColA.tolist()]
dataY = [int(x) for x in df.ColB.tolist()]
dataX= [str(x) for x in dataX]
dataY= [str(x) for x in dataY]
def lcs(pattern_1, pattern_2, len_1, len_2):
    if len_1 == 0 or len_2 == 0:
        return 0
    if pattern_1[len_1 - 1] == pattern_2[len_2 - 1]:
        return 1 + lcs(pattern_1, pattern_2, len_1 - 1, len_2 - 1)
    else :
     return max(lcs(pattern_1, pattern_2, len_1 - 1, len_2), lcs(pattern_1, pattern_2, len_1, len_2 - 1))
pattern_1 = ''.join(dataX[0:40])
pattern_2 = ''.join(dataY[0:10])
print("Lenght of LCS is: ", lcs(pattern_1, pattern_2, len(pattern_1), len(pattern_2)))

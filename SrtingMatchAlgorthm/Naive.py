# -*- coding: utf-8 -*-
"""
@author:
    -Amera Almwalad, 
    -Someah AlQarni,
    -Norah Alamri,
    -Rahaf Alqethami,
    -Shahad Mohy Aldeen

######################################
   Naive Strung Matching algorithm:
######################################
"""


#import the library for calculate the time for execution
from timeit import default_timer as timer

#start the timer
start = timer()

'''
implement the Algorithm 
'''
##################################


  
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




print(search("of",                                 
 """Oh, say can you see, by the dawn's early light,
What so proudly we hailed at the twilight's last gleaming?
Whose broad stripes and bright stars, through the perilous fight,
O'er the ramparts we watched, were so gallantly streaming?
And the rockets' red glare, the bombs bursting in air,
Gave proof through the night that our flag was still there.
O say, does that star-spangled banner yet wave
O'er the land of the free and the home of the brave?""") )       
#end of timer and print it                    
end = timer()
print("The Calculated time",end - start)         
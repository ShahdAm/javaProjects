**********************************************
* STRING MATCHING ALGORITHMS IMPLEMENTATION: *
**********************************************
Project Name: String matching Algorithms
IDE: Spyder 
Language: Python3 
___________________________________________________________________

# Description:

This project contains an implementation of three Algorithms (KMP,LCS,Naive). The objective is to find pattern P from given text T, String matching operation is crucial. So locating P in T efficiently is very important.
We used three different data structures: 
- naIve
- KMP
- LCS
and calculate the excute time for each one, the dataset we use
is csv files whitch contain 0's and 1's as a string to find pattren
frome them.

**The data structure we used:**
 
    naive   |     KMP     |     LCS 
 -----------|-------------|-------------
 Stack      |    Stack    |    Stack  
 Hash table |  Hash table |  Hash table
 Array      |    Array    |    Array

___________________________________________________________________
Function Details: 
- import's part:
we will call from the library two functions is( import csv, import time)
 
Method search:
we have two parameters called a (pat, txt) in the method's header. The variable 'M' takes the length of the pattern, and the variable 'N' takes the length of the text.
The looping part is to do a slide pattern one by one, starting by passing both the pattern and text and increasing one of them. and variable 'j' when beginning any repeat outside of the pattern, the 'j' should return in the beginning. In the 'while loop' check if the pattern matches with text( 'j' reference less than 'M' length of pattern ) if there match will move into the next pattern, It will be doing this operation to find all matching and then return the index 'i' every time.

Method read_csv:
we have three parameters called a (file_name, column_a, column_b) in the method's header. The variable 'file_name' takes the data file, the variable 'column_a' takes the first column in the data file, and the variable '' column_b"second column in the data file.
Then will open the file and read data from the file (data_antibody or pcr_data or both_covid_data) and return the data. If not found (column_a not in the header or column_b not in header) will print this message: ''"Error: One or both of the columns ({column_a}, {column_b}) are not present in the header row of the CSV file ''.
 
The final part of the method will compute the time to the algorithm starting to ending, using by time.perf_counter() function.

Naïve algorithm with data structure(Hush table)  
Method search_hash :
we have two parameters called a (pat, txt) in the method's header. The variable 'M' takes the length of the pattern, the variable 'N' takes the length of the text, the variable 'P' hash value of the pattern, and the variable 't' is the hash value of the text.
 
The first looping is to do (pow(d, M-1)%q), and second Calculate the hash value of the pattern and first window of text then will slide the pattern over text one by one to check the hash values of the current window of text and pattern. If the hash values match then only check for characters one by one and return the index 'i'.
 
Calculate the hash value for the next window of text: Remove and leading digit, and add a trailing digit in the hash table. also,  we might get negative values of t, converting it to positive

Method read_csv:
we have three parameters called a (file_name, column_a, column_b) in the method's header. The variable 'file_name' takes the data file, the variable 'column_a' takes the first column in the data file, and the variable '' column_b"second column in the data file.
Then will open the file and read data from the file (data_antibody or pcr_data or both_covid_data) and return the data. If not found (column_a not in the header or column_b not in header) will print this message: ''"Error: One or both of the columns ({column_a}, {column_b}) are not present in the header row of the CSV file ''.
 
The final part of the method will compute the time to the algorithm starting to ending, using by time.perf_counter() function.

Naïve algorithm with data structure(Stack)  
class Stack:
we will use six methods to store data.
 
Method search_hash :
we have two parameters called a (pat, txt) in the method's header. The variable 'M' takes the length of the pattern, the variable 'N' takes the length of the text, the variable 'P' hash value of the pattern, and the variable 't' is the hash value of the text.
 
will create a stack to store values and use 'for' loop to the value of h would be "pow(d, M-1)%q" and author 'for' Calculate the hash value of pattern and first window of text and slide the pattern over text one by one. then check the hash values of the current window of text and pattern. If the hash values match then only
check for characters one by one in the stack, also calculate the hash value for the next window of text: Remove and leading digit, and add a trailing digit using 'peek'.
We might get negative values of t, converting it to positive

The lcs_length:
 is Define a function to calculate the length of the LCS between two patterns.  
declaring the array for storing the dp values and Following steps build L[m+1][n+1] in bottom up fashion 
Note: L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]. 
L[m][n] contains the length of LCS of X[0..n-1] & Y[0..m-1] 
Then return L[m][n]

search_pattern:
use to find the pattern in the given text

print_lcs_hash:
Define a function to print the LCS using a hash table


______________________________________
Usage:
In the same folder there will be the code files provided for each algorithm along with the data file you can easily download it on your computer and open them using the "Spyder(python3.9) version" 


___________________________________________________________________

# Credits:
https://youtu.be/vjxLlFTKhrU
https://youtu.be/BXCEFAzhxGY
https://youtu.be/MiqoA-yF-0M

The team who work on this project are student from umm alqura universty
- Amera Almwalad: computer scince
-Rahaf Abdullah Alqethami: computer scince
-Someah Ahmed AlQarni: computer scince
-Norah Abdulmajeed Alamri: computer scince
-Shahad Ahmad Mohy Aldeen: computer scince

Under supervision:
Dr. Hend


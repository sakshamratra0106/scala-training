# Assignment-1

## Note :

 - Create a scala file with name as
	 - NameAssignment1Question1
	 - NameAssignment1Question2
	 - NameAssignment1Question3

Where name is your name for example, my name is **Divyanshu Srivastava**, so the file name would be :-

 - DivyanshuSrivastavaAssignment1Question1
 - DivyanshuSrivastavaAssignment1Question2
 - DivyanshuSrivastavaAssignment1Question3

## Question-1 : Matrix multiplication

You are given two matrices of dimensions N x N, filled with integers. Your task is to print the product of these matrices.

**Input Format**

 - Interactively from user from command line.
 - The first line contains a positive integer **N**.
 - Each of the next **N** lines contains **N** space separated integers denoting a row of the first matrix.
 - Each of the next **N** lines contains **N** space separated integers denoting a row of the second matrix.

**Output Format**

Output  **N**  lines, the product of the two matrices.

**Sample Input**

    3  
    1 0 1  
    0 1 0  
    1 0 1  
    2 2 0  
    0 2 2  
    2 0 2

**Sample Output**

    4 2 2  
    0 2 2  
    4 2 2

## Question-2 : Recursive Sum

Your task is to calculate the sum of integers using **Tail Recursion**.

**Input Format**

 - As command line argument.

**Output Format**

Output  the sum of integers.

**Sample Input**

    Main 1 2 3 4 5

Where **Main** is the scala file where the main method exist, and it can have any name not just **Main**.

**Sample Output**

    15

## Question-3 : Recursive Digit Sum

Given an integer, we need to find the  _super digit_  of the integer.

-   If **x** has only one  digit, then its super digit is  **x**.
-   Otherwise, the super digit of **x**  is equal to the super digit of the sum of the digits of  **x**.

For example, the super digit of **9875**  will be calculated as:

    superDigit(9875)   	9+8+7+5    = 29 
    superDigit(29) 	    2 + 9      = 11
    superDigit(11)		1 + 1      = 2
    superDigit(2)		           = 2

the super digit of **9875987598759875**  will be calculated as:

    superDigit(9875987598759875)   9+8+7+5+9+8+7+5+9+8+7+5+9+8+7+5  = 116
    superDigit(116)                1+1+6                            = 8
    superDigit(8)                                                   = 8

**Input Format**

 - Interactively from user from command line.
 - The first line contains a positive integer **N**.

**Output Format**

Output  the result on console.

**Sample Input 0**

    148

**Sample Output 0**

    4

**Explanation 0**

    superDigit(148)   1 + 4 + 8  = 13
    superDigit(13)    1 + 3      = 4
    superDigit(8)                = 4

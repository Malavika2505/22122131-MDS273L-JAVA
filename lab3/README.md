LAB 3

Create a java program that performs the following operation:
The program should collect an integer array from the user
After the array is entered, you need to create a menu of items
Find the Mean Value
Find the Median Value
Find the Mode Value
From the user-given array.
The program should have a minimum of 3 functions apart from the main function; each of the functions implements the Mean, Median, and Mode computation by accepting the array user has entered as a parameter and returning the value as a result. From the main method, you will display the result.

soln:

call the scanner function 
inside the main class create an array and ask the user to input the values
give user option to choose among mean median or mode
define 3 functions Mean,Median,Mode
Mean function
     iterate through the array and store sum of elements to a variable sum
     then find mean by dividing sum by length of array
Median function
     first sort the elemnts in the array
     find the length of elements in the array
     if length is even
              find sum of n/2 and n/2+1 th element
              median=sum/2
    if length is odd
              median=n+1/2 th element in the array
Mode function
    find the count of each number in the array
    mode=element with max count
               
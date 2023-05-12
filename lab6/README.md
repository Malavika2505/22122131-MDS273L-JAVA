lab 6
Write a JAVA program that reads a file (text file) and finds the following details.<br>
Vowels and their count. Eg: [a:100, e:45, I:55, ..]<br>
Digits and their count. Eg: [0:1000, 1:10, 2:40, ...]<br>
Top Five repeated words and their count.<br>
Least Five repeated words and their count.<br>
Top Five repeated characters and their count.<br>
Least FIve repeated characters and their count.<br>

Flow chart

![lab6](https://github.com/Malavika2505/22122131-MDS273L-JAVA/assets/118505120/176b1ef6-7e19-44d2-a01e-4c9855a65114)
 
 Process
 
import java.io.* and java.util.*<br>
Inside the main class read the given file and save the lines into a variable "temp"<br>
using replace all -replace "." with" ".<br>
In the public define the different fuctions to count<br>
function -to count vowels<br>
      define the fuction vowel and pass the parameter temp<br>
      initialize the count for each vowel<br>
      using charAt loop through each character in temp and count the vowels<br>
function-to count number<br>
       similar to vowels inplace count the number using switch and charAt<br>
function -to count the number of words<br>
        create an array to store all words<br>
        split the String in temp by" "<br>
        store all the words in an array<br>
        using for loop and equality check store unique words in the array in a
             seperate array
        count the number of times each word is repaeted
        print the count
function- to count the number of alphabets
         as done above create an array of alphabets and count
call all the defined functions in  the main class


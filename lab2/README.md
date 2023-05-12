Lab Exercise Question
You are supposed to create a menu-driven program that has the following menu options:
Enter a name
Search for a name
Remove a name
Show all names

Flow chart
![lab2_flow](https://github.com/Malavika2505/22122131-MDS273L-JAVA/assets/118505120/ad840bdd-8a07-4f18-b880-dcbd4c0a1dd0)



Explanation

1.The program starts by importing the necessary Java utility classes and defining a class called "lab2".
2.Inside the "lab2" class, the main method is defined, which is the entry point of the program. The main method creates an instance of the Scanner class to read user input, initializes an array called "arr" with three initial names, and sets a variable called "count" to 3.
3.The program then enters a do-while loop that repeatedly asks the user to choose from four options: Enter a name, Search for a name, Remove a name, and Show all names.
4.Depending on the user's input, the program executes one of four cases using a switch statement.
In the "Enter a name" case, the program prompts the user to enter a name, checks if the name already exists in the array, and adds it to the array if it doesn't already exist.
5.In the "Search for a name" case, the program prompts the user to enter a name to search for, searches the array for the name, and displays a message indicating whether or not the name was found.
6.In the "Remove a name" case, the program prompts the user to enter a name to remove, searches the array for the name, removes the name from the array if it exists, and decrements the "count" variable.
7.In the "Show all names" case, the program displays all the names in the array.
8.After each case is executed, the program prompts the user to press 'y' to continue or any other key to exit the loop.
The program continues to loop until the user decides to exit by entering a key other than 'y'.
Once the loop has exited, the program prints "program end" and terminates.





Regenerate response

# Project_5
 Merrimack CSC 6301 week 5 project

## File: SortedStack

In this code, it scans integers from that the user inputs, sorts them, and stores them in a stack. It was developed from the previous week's code and was edited to be 
a stack instead of LinkedList.

## Features

- Prompts the user to enter a list of integers (press enter after each entry to save input).
- Reads and handles user input, including errors.
- Sorts the collected integers from smallest to largest.
- Stores sorted integers in a stack.
- Displays the sorted integers.

## To run project on windows

Use the following commands in your terminal to generate documentation and run the program (make such the file where code is downloaded is selected in cmd line):

Command to generate documentation:
javadoc SortedStack.java

Command to run the program:
java SortedStack.java

## How It Works

1. The program displays a message telling user to enter an integer and instructs them to type "done" when finished.
2. It scans the integers entered by the user (handles potential errors such as invalid inputs like decimals). It continues reading inputs until the user types "done."
3. It sorts the integers from smallest to largest.
4. The sorted integers are stored in a stack.
5. Finally, the sorted integers are displayed back to the user.


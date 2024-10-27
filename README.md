# Task-1
LOGIC :
1)We first create an array which contains unique numbers(Randomly generated)(Left table join key vector)
<br>
2)We create an arraylist which contains indexes for the right array ie from 0 to 3(the array contains values from 0 to 3)
<br>
3)Now we randomly select a number from the first array and randomly generate the number of times it is gonna be repeated in the second array
<br>
4)Now we shuffle the arraylist which contains all the positions
<br>
5)Now we have a outer loop which executes till the time all the slots in the right array are finished and an inner loop which runs the number of times the selected number is to be included in the second array
<br>
6)In the inner loop we get an index from the array list and at that position we insert the selected number into the second array
<br>
7)This loop runs the no of times the element has to be included in the second array
<br>
8)If the no of filled slots is not finished then the process continues 
<br>
Here left array refers to Left table join key vector and right array refers to Right Table join key vector
<br>
We have a seperate vector class for the join key vectors
<br>
The data type of the column is set as integer only ie it will contain only integer values

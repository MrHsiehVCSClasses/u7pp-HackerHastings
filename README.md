# u7pp

You will complete various static functions using recursion

## General Guidance

Use the test cases to figure out the specifics of the headers/usage of each method.

## Methods

### Factorial

Takes in an integer, and returns the factorial of that integer.
Precondition: the argument is non-negative

### Pow

Takes in a `double base` and an `int power`. Returns `base` raised to the `power`.
Precondition: `power` is a positive integer.

### Fibonacci

Takes in an integer `n`, and returns the **nth** term in the Fibonacci sequence.
For the sake of this project, the 0th term is `0` and the 1st term is `1`.
Precondition: `n` is a non-negative integer.

### isPalindrome

Takes in a string, and returns true if the string is a palindrome (case sensitive), and false otherwise.
Yes, we've done this before, but please do it recursively this time! :)

### nextIsDouble

Given an array, returns an `int` counting how many pairs of adjacent integers where the right integer is double the left one. For example: [3,6,10,20,40] would return `3` because 3x2 = 6, 10x2 = 20, and 20x2 = 40.
The `int` parameter is used for recursion, and represents where in the array the algorithm is currently at.
Precondition: the given array has at least 1 element.

### getBinary

Takes in an `int`, and returns a `String` of its binary representation.
Precondition: the argument is a positive integer

### binarySearch

Takes in an array and a value to search for. If the value is in the array, it returns the index of the value. Otherwise, return `-1`.
If you need a refresher on how binary search works, you can go here: <https://www.youtube.com/watch?v=KXJSjte_OAI>
The first two parameters are the array and the value to search for.
The next two parameters represent the bounds of the area to search.
Precondition: the given array is sorted, and has no repeat elements.

### canFlowOffMap

`public static boolean canFlowOffMap(int[][] map, int row, int col)`

In this problem, an area of land is represented as a two dimensional `int` array. The array element represents the elevation of that point on land. The higher the elevation, the higher the number. A flat plain at an elevation of 100 feet above sea level look like this:

``` java
100 100 100 100 100 100 100 100 100 100
100 100 100 100 100 100 100 100 100 100
100 100 100 100 100 100 100 100 100 100
100 100 100 100 100 100 100 100 100 100
100 100 100 100 100 100 100 100 100 100
100 100 100 100 100 100 100 100 100 100
```

A river flowing through a 200 foot gorge looks like this:

``` java
200  99 200 200 200 200 200 200 200 200
200  98 200 200 200 200 200 200 200 200
200  97  96 200 200 200 200 200 200 200
200 188  95 200 200 200  85  84  83 200
200 200  94  93  92 200  86 200  82 200
200   7 200 200  91 200  87 200  81 200
200   8 200 200  90  89  88 200  80 200
200   7 100 200 200 200 200 200  79 200
200   6   5 200 200 200 200 200  78  77
200 200 200 200 200 200 200 200 200  76
```

`canFlowOff` has a parameter that represents a map of elevations as 2D `int` array. It also has parameters that represent the starting location of a drop of water on the map.

The drop of water can move to one of the four adjacent cells (above, below, left and right of the current cell) if the elevation of the adjacent cell is less than the elevation of the current cell.

Water in any cell on the edge of the map can flow off the map.

In the first example, the plain, the water in any cell that is not on the border of the array cannot flow to any other cell, since all adjacent cells have the same elevation. Water on any of the border cells could flow off the map. In the second example, if a drop of water started at the cell in row 2, column 2 (the 96) it could eventually flow off the map by following the river, because each segment of the river is one foot lower than the previous.

Recall that water on the border can also flow off. In the second example, if water started at the cell in row 4, column 0 (a 200), then it can flow off the map. The water cannot flow to any adjacent cell, but that doesn't matter because the cell is on the border.

If the starting cell is row 4, column 1 (the 188), the water can flow off the map. The water cannot flow west or south because those cells have an elevation of 200. However, the water can flow north or east to the cells in the river. The water falls off the bank into the river, and then off the map via the river.

Finally, the cell at row 6, column 1 (the 8) cannot flow off the map. It tries north and reaches a dead-end. It cannot move east or west. It tries south, but reaches a dead-end.

`canFlowOff` returns true if a drop of water starting at the location specified by row, column can reach the edge of the map, false otherwise.

## Grading Breakdown

* Formatting/Indentation: 3 points
* All Code is DRY: 3 points
* All Code Properly JavaDoc'ed: 3 points
* no public methods/attributes besides the ones specified: 3 point
* Passes All Test Cases: 18 points ( ~1 point per 4 tests passed)
  
Total: 30 points
 
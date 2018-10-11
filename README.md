# Java Training 2018 - Week 2

## Download the project

### If you are comfortable with Git (Windows)

In Windows, go to the folder in which you would like to download this repository, click on the address bar at the top 
and type `cmd.exe`. This will open up the command line terminal, where you will enter the following commands:

```
git clone https://github.com/Compec/java-2018-w2-assignment
```

Launch `IntelliJ IDEA` and open the project by selecting the folder where you downloaded the project.

### If you are not comfortable with Git (Windows)

Simply press on the green button `Clone or Download` in top-right corner of this page and press `Download ZIP`.
Download the ZIP file then extract it with your zip program (Winrar, 7zip ...)

#### For other operating systems

 I do not have a mac/linux machine so I prefer not to give instructions :) The steps should be very similar though.

## Assignment 1

Write a Java program that takes a number as input and prints its multiplication table upto 10

#### Expected Output
```
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
```

#### Improvements

A) Why 10? Make the user decide of the number

Example:
```
Multiplication table from 1 to ... __100__
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 100 = 800
```

## Assignment 2

Write a Java program works as a calculator.
It should ask the user for two numbers and the operation to apply to them.

#### Expected Output
```
Enter the first real number:  __ 3 __
Enter the second real number:  __ 2 __
Operations possible:
    - addition
    - subtraction
    - division
    - multiplication
    - remainder
Enter the operation you want to do: addition
3 + 2 = 5
```
#### Improvements

A) Even if the user enters `aDDitIon` instead of `addition`, it should accept it

Example:
```
Enter the first real number:  __ 3 __
Enter the second real number:  __ 2 __
Operations possible:
    - addition
    - subtraction
    - division
    - multiplication
    - remainder
Enter the operation you want to do: sUbTraCTIon
3 - 2 = 1
```

B) Keep asking the user for the operation if they keep giving wrong input

Example:

```
Enter the first real number:  __3__
Enter the second real number:  __2__
Operations possible:
    - addition
    - subtraction
    - division
    - multiplication
    - remainder
Enter the operation you want to do: __exponentiation__
Sorry, this calculator cannot do `exponentation`.
Enter the operation you want to do: __division__
3 / 2 = 1.5
```

C) Prevent illegal operations from happening, like division by zero

Example:

```
Enter the first real number:  __8__
Enter the second real number:  __0__
Operations possible:
    - addition
    - subtraction
    - division
    - multiplication
    - remainder
Enter the operation you want to do: __division__
Sorry, division by zero is undefined
```


C) After an operation is done, ask the user if they want to calculate something again
```
Enter the first real number:  __3__
Enter the second real number:  __2__
Operations possible:
    - addition
    - subtraction
    - division
    - multiplication
    - remainder
Enter the operation you want to do: __addition
3 + 2 = 5
Would you like to calculate something else? __yes__
Enter the first real number:  __7__
Enter the second real number:  __17__
(...)
```

## Assignment 3

Write a Java program that prints all prime numbers from 1 to 100

#### Expected Output
```
2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
```

#### Improvements

A) Make the range flexible (from a to b instead of 1 to 100)


# Author

Mehdi Saffar - [LinkedIn](https://www.linkedin.com/in/mehdisaffar/)
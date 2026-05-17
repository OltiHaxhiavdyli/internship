# Basic Programming Exercise Set

## Overview

This file contains six beginner programming exercises for Week 2.

The exercises practice:

- Variables
- Control flow
- Loops
- Functions
- Scope
- Lists/arrays
- Dictionaries/maps

---

# Exercise 1: Variables and Arithmetic

## Task

Create variables for a product price and tax. Add them together and print the total price.

## Code

```python
price = 100
tax = 20

total = price + tax

print(total)
```

## Example Output

```text
120
```

## Concept Practiced

This exercise practices variables and arithmetic.

Variables are used to store values, and arithmetic is used to calculate a result.

---

# Exercise 2: Age Checker

## Task

Create a variable called `age`.

If the age is 18 or older, print:

```text
Adult
```

Otherwise, print:

```text
Minor
```

## Code

```python
age = 17

if age >= 18:
    print("Adult")
else:
    print("Minor")
```

## Example Output

```text
Minor
```

## Concept Practiced

This exercise practices control flow using `if` and `else`.

The program makes a decision based on whether the condition is true or false.

---

# Exercise 3: Grade Checker

## Task

Create a variable called `score`.

Print:

```text
Excellent
```

if the score is 90 or higher.

Print:

```text
Passed
```

if the score is 60 or higher.

Print:

```text
Failed
```

otherwise.

## Code

```python
score = 75

if score >= 90:
    print("Excellent")
elif score >= 60:
    print("Passed")
else:
    print("Failed")
```

## Example Output

```text
Passed
```

## Concept Practiced

This exercise practices control flow using `if`, `elif`, and `else`.

The program checks multiple conditions from top to bottom.

---

# Exercise 4: For Loop Counting

## Task

Use a `for` loop to print the numbers from 1 to 5.

## Code

```python
for number in range(1, 6):
    print(number)
```

## Example Output

```text
1
2
3
4
5
```

## Concept Practiced

This exercise practices loops.

A loop is used to repeat code without writing the same line many times.

---

# Exercise 5: Function to Add Numbers

## Task

Create a function called `add_numbers`.

The function should take two numbers as parameters and return their sum.

## Code

```python
def add_numbers(a, b):
    result = a + b
    return result

total = add_numbers(5, 3)

print(total)
```

## Example Output

```text
8
```

## Concept Practiced

This exercise practices functions, parameters, return values, and local scope.

The variables `a`, `b`, and `result` exist inside the function.

---

# Exercise 6: Dictionary / Map Practice

## Task

Create a dictionary with student names as keys and their grades as values.

Print one student's grade.

## Code

```python
grades = {
    "Ana": 90,
    "Ben": 75,
    "Olti": 88
}

print(grades["Olti"])
```

## Example Output

```text
88
```

## Concept Practiced

This exercise practices dictionaries/maps.

A dictionary stores data using key-value pairs.

In this example:

```text
"Olti" = key
88 = value
```

---

# Final Summary

These exercises cover the basic programming concepts from Week 2:

```text
Variables store values.
Control flow makes decisions.
Loops repeat code.
Functions organize reusable logic.
Scope controls where variables exist.
Dictionaries/maps store key-value data.
```
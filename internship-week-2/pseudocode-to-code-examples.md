# Pseudocode to Code Translation Examples

## Overview

This file contains examples of translating pseudocode into real Python code.

Pseudocode is a simple way to describe program logic before writing actual code.

Each example includes:

- Task
- Pseudocode
- Python code
- Example output
- Concept practiced

---

# Example 1: Age Checker

## Task

Check if a person is an adult or a minor.

## Pseudocode

```text
Set age to 17

If age is greater than or equal to 18
    Print "Adult"
Otherwise
    Print "Minor"
```

## Python Code

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

This example practices variables and control flow.

---

# Example 2: Add Two Numbers

## Task

Add two numbers and print the result.

## Pseudocode

```text
Set first_number to 5
Set second_number to 3

Set total to first_number plus second_number

Print total
```

## Python Code

```python
first_number = 5
second_number = 3

total = first_number + second_number

print(total)
```

## Example Output

```text
8
```

## Concept Practiced

This example practices variables and arithmetic.

---

# Example 3: Print Numbers from 1 to 5

## Task

Use a loop to print numbers from 1 to 5.

## Pseudocode

```text
For each number from 1 to 5
    Print number
```

## Python Code

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

This example practices loops.

---

# Example 4: Find the Larger Number

## Task

Compare two numbers and print the larger one.

## Pseudocode

```text
Set first_number to 10
Set second_number to 7

If first_number is greater than second_number
    Print first_number
Otherwise
    Print second_number
```

## Python Code

```python
first_number = 10
second_number = 7

if first_number > second_number:
    print(first_number)
else:
    print(second_number)
```

## Example Output

```text
10
```

## Concept Practiced

This example practices variables, comparison, and control flow.

---

# Example 5: Calculate Total Price with a Function

## Task

Create a function that adds price and tax, then print the total.

## Pseudocode

```text
Create function calculate_total with price and tax
    Set total to price plus tax
    Return total

Set result to calculate_total with 100 and 20

Print result
```

## Python Code

```python
def calculate_total(price, tax):
    total = price + tax
    return total

result = calculate_total(100, 20)

print(result)
```

## Example Output

```text
120
```

## Concept Practiced

This example practices functions, parameters, return values, and local scope.

---

# Final Summary

These examples show how plain logic can be translated into real Python code.

The basic process is:

```text
Understand the task
↓
Write the steps in pseudocode
↓
Convert each step into Python syntax
↓
Run and check the result
```

Pseudocode helps programmers think about logic before worrying about exact syntax.
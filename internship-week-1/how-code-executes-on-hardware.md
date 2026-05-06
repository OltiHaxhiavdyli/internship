# How Code Executes on Hardware

## Overview

When we write code, the computer does not understand it directly like a human.

Code must eventually become low-level instructions made from binary values:

```text
0 and 1
```

At the physical level, those 0s and 1s are represented using electrical states inside tiny switches called transistors.

The basic flow is:

```text
High-level code
↓
Compiler or interpreter
↓
Machine code
↓
Binary
↓
Electrical signals
↓
Transistors
↓
CPU execution
```

---

## 1. Human-Readable Code

Programmers usually write code in a high-level language.

Example:

```python
print("A")
```

Or:

```c
x = a + b;
```

This code is easier for humans to read, but the CPU cannot directly execute it in this form.

It must first be translated into lower-level instructions.

---

## 2. Compiler or Interpreter

A compiler or interpreter helps translate human-readable code into something the computer can run.

### Compiler

A compiler translates code into lower-level machine-executable instructions.

Example idea:

```text
Human-readable code
↓
Compiler
↓
Machine code
```

Grace Hopper helped pioneer compiler technology, which made programming more practical and less tied directly to hardware.

### Interpreter

An interpreter runs code more directly, often line by line.

Lisp helped introduce or popularize ideas like interpreters and garbage collection.

---

## 3. Machine Code and Binary

At the lowest software level, the CPU runs machine code.

Machine code is represented using binary:

```text
0 and 1
```

A single binary value is called a bit:

```text
bit = 0 or 1
```

A group of 8 bits is called a byte:

```text
byte = 8 bits
```

If a byte is treated as an unsigned number, it can represent values from:

```text
0 to 255
```

Example:

```text
01000001
```

This binary pattern represents the number `65`.

Using ASCII, the number `65` can represent the capital letter:

```text
A
```

So text, numbers, and instructions can all be represented using binary patterns.

---

## 4. Transistors: The Physical Switches

Computers use tiny electrical switches called transistors.

A common modern transistor is a MOSFET:

```text
Metal-Oxide-Semiconductor Field-Effect Transistor
```

A transistor can be thought of like a faucet for electricity.

It has three basic parts:

```text
Source = where electricity enters
Drain  = where electricity exits
Gate   = controls whether electricity can flow
```

When voltage is applied to the gate, electricity can flow.

When voltage is not applied, electricity is blocked.

This gives two states:

```text
On  = 1
Off = 0
```

That is how binary connects to real hardware.

---

## 5. Logic Gates

A single transistor can represent a simple on/off state.

When transistors are combined, they can form logic gates.

Common logic gates include:

```text
NOT gate = flips the signal
AND gate = outputs 1 only if both inputs are 1
OR gate  = outputs 1 if at least one input is 1
```

Logic gates are the building blocks of CPU operations.

By combining many logic gates, a computer can:

- Add numbers
- Compare data
- Make simple decisions
- Execute instructions

This is how basic on/off switches scale up into real computation.

---

## 6. Loading a Program: Disk to RAM

Programs are usually stored on disk first.

Disk is long-term storage.

Examples:

```text
SSD
HDD
NVMe SSD
```

Disk keeps data even when the computer is turned off.

When a program runs, the operating system loads it from disk into RAM.

RAM is faster than disk and is used for running programs.

The flow looks like this:

```text
Program stored on disk
↓
Program loaded into RAM
↓
CPU starts executing instructions
```

---

## 7. CPU Execution

The CPU is the part of the computer that executes instructions.

Important CPU parts include:

```text
Control Unit
ALU
Registers
Cache
```

### Control Unit

The Control Unit manages what the CPU should do next.

It controls the flow of instructions.

It decides things like:

```text
What instruction is next?
What data is needed?
Should the ALU add, subtract, or compare?
Where should the result go?
```

### ALU

ALU stands for Arithmetic Logic Unit.

The ALU performs math and logic operations.

Examples:

```text
Addition
Subtraction
Comparison
AND / OR / NOT logic
```

For code like:

```c
x = a + b;
```

The ALU is the part that performs the addition.

### Registers

Registers are tiny, extremely fast storage locations inside the CPU.

They hold the data the CPU is working with right now.

Example:

```text
Register 1 = a
Register 2 = b
ALU adds them
Register 3 = result
```

### Cache

Cache is fast memory close to the CPU.

It stores recently used or frequently used data so the CPU does not always have to wait for RAM.

Cache is smaller than RAM but much faster.

---

## 8. Memory Hierarchy During Execution

The computer uses different layers of memory.

The closer the memory is to the CPU, the faster it is, but the smaller it usually is.

The hierarchy is:

```text
Registers
↓
Cache
↓
RAM
↓
Disk
```

### Registers

Fastest and smallest.

Used for the CPU's immediate work.

### Cache

Very fast and close to the CPU.

Used for recently or frequently used data.

### RAM

Main working memory.

Used for running programs.

### Disk

Slowest but largest.

Used for permanent storage.

---

## 9. Processes and Threads

When a program runs, it becomes a process.

### Process

A process is a running program.

It has its own memory and resources.

Example:

```text
Browser process
Music app process
Text editor process
```

Processes are separated from each other, which helps with safety and stability.

### Thread

A thread is a smaller worker inside a process.

A process can have one thread or multiple threads.

Example:

```text
Game process
├── Thread for graphics
├── Thread for sound
├── Thread for player input
└── Thread for networking
```

Threads inside the same process share memory.

This makes them efficient, but they must coordinate carefully.

---

## 10. Simple Full Example

Imagine this simple code:

```c
x = a + b;
```

A simplified execution flow could be:

```text
1. The code is written by a programmer.
2. A compiler translates it into machine instructions.
3. The program is stored on disk.
4. When the program runs, the operating system loads it into RAM.
5. The CPU fetches the needed instructions and data.
6. Cache helps keep useful data close to the CPU.
7. Registers hold the current values of `a` and `b`.
8. The Control Unit tells the ALU to add them.
9. The ALU performs the addition.
10. The result is stored in a register.
11. The result can then be stored back into RAM.
12. If saved permanently, the data eventually goes back to disk.
```

---

## Final Summary

Code execution starts with human-readable code and ends with electrical activity inside hardware.

The main chain is:

```text
Code
↓
Compiler or interpreter
↓
Machine code
↓
Binary
↓
Transistors
↓
Logic gates
↓
CPU instructions
↓
Program execution
```

The CPU uses the Control Unit, ALU, registers, and cache to execute instructions.

Memory is organized in a hierarchy:

```text
Registers = fastest, tiny CPU storage
Cache     = very fast nearby memory
RAM       = main working memory
Disk      = permanent storage
```

A running program is a process.

Threads are workers inside a process.

The important idea is:

```text
Modern software is built on many layers of abstraction, but at the lowest level it is still based on binary, transistors, memory, and CPU instructions.
```
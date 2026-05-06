# Computing History Timeline Notes

## 1. The Foundation: Binary & Assembly

### Binary

Computers operate using voltage states: on/off.

These states are represented as:

```text
On  = 1
Off = 0
```

This is the machine-code level.

### The Byte

A byte is an 8-bit group.

If treated as an unsigned number, it can represent values from:

```text
0 to 255
```

### Assembly Language

Assembly language was created to make raw binary easier to work with.

Instead of writing only 1s and 0s, programmers could use mnemonic codes like:

```asm
MOV
ADD
SUB
JMP
```

### The Compiler

Grace Hopper helped pioneer compiler technology.

A compiler acts like a translator. It takes human-readable code and turns it into machine-executable instructions.

---

## 2. The First High-Level Languages

### FORTRAN

FORTRAN was designed for scientists, engineers, and heavy math.

### COBOL

COBOL was built for business and government systems.

It is still used today in many legacy finance, banking, and administrative systems.

### Lisp

Lisp introduced or popularized important programming ideas such as:

- Interpreters
- Garbage collection
- Symbolic computing

---

## 3. Systems & Power: The 70s - 80s

### C

C is known for speed and direct memory access.

It gives programmers a lot of control, but it is also easy to break things if memory is handled incorrectly.

### Unix

Unix was built using C.

It introduced the philosophy of small, specialized programs that can be connected together.

Examples:

```bash
ls
cd
cat
grep
```

### C++

C++ added abstraction to C using classes and objects.

It is still used in:

- Browsers
- Games
- Databases
- High-performance systems

### Smalltalk

Smalltalk was a pure object-oriented language.

Although it is less common today, many of its ideas influenced modern programming languages.

---

## 4. The Philosophy Era: The 90s

### Python

Python focused on readability.

The idea is that code should be easy for humans to read and maintain.

### Java

Java introduced the JVM: Java Virtual Machine.

The goal was:

```text
Write Once, Run Anywhere
```

Java code compiles to bytecode, which runs on the JVM.

### JavaScript

JavaScript was originally created for browser interaction.

It is now used in many areas, including:

- Websites
- Servers
- Mobile apps
- Desktop apps

### PHP

PHP powered much of the early World Wide Web.

---

## 5. Modern Refinements & AI

### Fixer Languages

Some modern languages were created to improve older ecosystems.

Examples:

```text
TypeScript fixed JavaScript.
Swift improved Apple development compared to Objective-C.
Rust and Zig provide C-like power with more focus on safety and clarity.
```

### The AI Shift

Programming has moved from simple autocomplete to AI agents that can help write full functions.

### Bottom Line

Programming is not dead.

The job is still about:

- Thinking
- Logic
- Problem-solving
- Understanding systems

Not just typing syntax.

---

# Extra Historical Notes

## 1. Punch Cards: The Physical Nightmare

Punch cards were used to represent data and instructions.

### Batch Processing

Programmers did not run code instantly.

They submitted a deck of cards to an operator and waited hours or even days for a result.

### The Drop Risk

If someone dropped a box of cards, the program could be physically messed up unless the cards were numbered.

### Chads

Chads were the small paper pieces punched out of the cards.

If the holes were not punched cleanly, the machine could misread the program.

---

## 2. Early Computers: Hard-Wired Logic

Before modern programming, some computers had to be programmed physically.

### Plugboards

Machines like ENIAC used plugboards.

To program them, people moved cables around, similar to an old telephone switchboard.

### Von Neumann Architecture

Von Neumann architecture introduced the idea that data and programs can live in the same memory.

Before this, the program could be the physical wiring of the machine.

---

## 3. Terminals: The Transition to Glass

### Teleprinters

The first terminals were not screens.

They were basically electric typewriters.

A user typed a command, and the computer typed the response back on paper.

### Green Screens

Later, glass terminals appeared.

Many were still dumb terminals, meaning they had no real processing power.

They were just windows into a larger mainframe computer.

---

## 4. CLI: The Unix Philosophy

The CLI is more than commands like:

```bash
ls
cd
```

The real power comes from the Unix philosophy.

### Everything is a File

In Unix-like systems, many things are treated like files:

- Hard drives
- Keyboards
- Printers
- Input/output streams

This makes it easier to connect tools together.

### Standard Streams

Unix uses standard streams:

```text
stdin   = input
stdout  = normal output
stderr  = error output
```

This is why small CLI tools can be chained together.

Example:

```bash
cat file.txt | grep "error"
```

---

## 5. Modern Development Environments

Modern development is defined by tools and ecosystems.

### LSP

LSP stands for Language Server Protocol.

It helps editors provide features like:

- Autocomplete
- Jump to definition
- Error checking
- Code hints

### Git

Git is version control.

It acts like a time machine for code.

It allows many developers to work on the same codebase without overwriting each other’s work.

### Package Managers

Modern coding often involves assembling existing libraries.

Examples:

```text
npm
pip
cargo
```

Package managers let developers download and use pre-written code quickly.

---

# Transistors and Binary Switching

## 1. The Physical Mechanism: The Gatekeeper

Modern computers use transistors.

A common type is the MOSFET:

```text
Metal-Oxide-Semiconductor Field-Effect Transistor
```

Think of it like a water faucet for electricity.

### Parts of a Transistor

```text
Source = where electricity enters
Drain  = where electricity exits
Gate   = the control handle
```

When voltage is applied to the gate, current flows from source to drain.

When there is no voltage, current is blocked.

---

## 2. Binary Switching

The transistor’s on/off state maps naturally to binary.

| Physical State | Electrical Condition | Binary Value | Logical Meaning |
|---|---|---:|---|
| On | Voltage present / flowing | 1 | True / High |
| Off | Voltage absent / blocked | 0 | False / Low |

Because transistors have no moving parts, they can switch billions of times per second.

---

## 3. Logic Gates

A single transistor can represent 0 or 1.

When transistors are wired together, they form logic gates.

### Common Logic Gates

```text
NOT gate = flips the signal
AND gate = outputs 1 only if both inputs are 1
OR gate  = outputs 1 if at least one input is 1
```

By combining millions or billions of gates, computers can:

- Add numbers
- Compare data
- Execute instructions
- Run programs

---

## 4. Scaling and Moore’s Law

Computers became more powerful because transistors became smaller.

In the 1940s, switches were vacuum tubes.

Today, processors contain billions of tiny transistors.

This miniaturization is why modern devices are so powerful.

---

# How Transistors and Binary Work Together

At the lowest level, computers do not understand human language.

They understand electrical states.

## 1. Transistor

A transistor is a microscopic switch.

It has two states:

```text
On  = electricity flows
Off = electricity is blocked
```

## 2. Binary

Binary uses only two numbers:

```text
0 and 1
```

This matches transistor states perfectly:

```text
On  = 1
Off = 0
```

## 3. Positional Binary

Computers use positional binary.

Each bit position represents a power of 2.

| Bit Position | Value |
|---:|---:|
| 7 | 128 |
| 6 | 64 |
| 5 | 32 |
| 4 | 16 |
| 3 | 8 |
| 2 | 4 |
| 1 | 2 |
| 0 | 1 |

Example:

```text
01000001
```

This means:

```text
64 + 1 = 65
```

So the binary value `01000001` represents the number `65`.

---

## 4. ASCII

ASCII is a translation system that maps numbers to characters.

Example:

```text
Capital A = 65
65 in binary = 01000001
```

So when the computer stores the letter `A`, it can store the binary pattern:

```text
01000001
```

---

# Software Hierarchy

The system scales from hardware to human-readable code like this:

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
```

Example:

```python
print("A")
```

This eventually becomes lower-level instructions that are represented by binary patterns and executed by hardware.

---

# Final Bottom Line

Computers are built from tiny on/off switches called transistors.

Those on/off states represent binary values.

Binary values can represent numbers, text, instructions, and data.

Logic gates combine binary values to perform computation.

Programming languages, compilers, operating systems, and development tools are layers of abstraction built on top of this foundation.
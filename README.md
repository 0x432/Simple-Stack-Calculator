# Simple-Stack-Calculator

## Description

The `Calculator.java` file evaluates postfix expressions using a stack. This program was created to complete an aspect of the Algorithms and Data Structures assignment by the University of Huddersfield.

## Usage

1. **Input:** The program takes a postfix expression as input (e.g., `"4 5 + 1 2 * - 5 /"`).
2. **Processing:** It processes each element of the expression, performing arithmetic operations as needed.
3. **Output:** The final result of the evaluated expression is printed.

## How It Works

- **Stack Operations:** The program uses a stack to manage operands and results.
- **Arithmetic Operations:** Supported operations include addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).

## Example

Given the input:

"4 5 + 1 2 * - 5 /"

The program will output:

Result: -1.0


## Requirements

- Java Development Kit (JDK)

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac Calculator.java
java Calculator

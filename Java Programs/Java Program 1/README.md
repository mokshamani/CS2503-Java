# JavaLab_Session1

## Problem
Create a `Book` class demonstrating constructors and the `this` keyword.

## Approach
- Defined fields: `title`, `author`, `price`
- Used a **default constructor** that chains to the **parameterized constructor** via `this(...)`
- Used `this.field = parameter` to disambiguate names
- Added `displayDetails()` to print info
- Tested in `main` by creating 3 `Book` objects

## How to Run
```bash
javac Book.java
java Book

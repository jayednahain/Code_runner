# Compile time vs Runtime
<!-- https://www.javatpoint.com/compile-time-vs-runtime -->
## compile time : 
- Compile-time is the time at which the source code is converted into an executable code 
- Compile-time errors are the errors that occurred when we write the wrong syntax.
### Compile-time errors
- Syntax errors
- Semantic errors
## runtime : 
- run time is the time at which the executable code is started running.
### Runtime errors
- Division by Zero:
- Accessing Array Out of Bounds:
- Null Pointer Dereference:
- Stack Overflow:
- Unused variables:
- 
# 1  https://www.youtube.com/watch?v=nQRW0_Q9RFI&list=PLptHs0ZDJKt_fLp8ImPQVc1obUJKDSQL7&index=2

## Dart's Type System
### Static Typing:
- Dart is a statically typed language, meaning that types are checked at compile time.
- This allows the compiler to catch type-related errors before the code is run.

```dart
int age = 25; // Correct
age = 'twenty-five'; // Error: A string cannot be assigned to an int variable.
```
### Type Inference:

https://www.geeksforgeeks.org/variables-and-keywords-in-dart/
https://chatgpt.com/c/6717dffc-3814-800d-8c75-9c9c357abff8

# final variables:
- A final variable can only be set once.
It is initialized when it is accessed at runtime, meaning that its value doesn't need to be known at compile time.

```dart
final a = "aa";
// in our program when we going to use it access it
// only that time it value will be initialized
// and then memory location will be allocated;
// if we don't use it wont initialized
```


# const variables:
- A const variable is a compile-time constant, meaning its value is fixed and must be known before the program runs (at compile time).
- It is initialized at compile time and cannot depend on anything that happens during runtime.

```dart
const a = "aa";
// final in nature
// no mater if you use it or not it will consume memory 
```


# Late
late keyword is used to indicate that a non-nullable variable will be initialized later in the code. 
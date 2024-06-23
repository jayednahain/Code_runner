# what happen we dont declare variable with out let, const or var ?
1. Implicit Global Variable:

 - If you assign a value to a variable without declaring it, JavaScript automatically creates a global variable.

- This variable will be accessible throughout the entire window or script, not just within the block or function where it was assigned.
```js
function foo() {
    x = 10;  // x is not declared with var, let, or const
}
foo();
console.log(x);  // Outputs: 10

```

Problems with Implicit Globals:

> Namespace Pollution: Global variables can lead to conflicts and unintended interactions between different parts of the code, especially in larger codebase or when using multiple libraries.

> Debugging Difficulties: It becomes harder to track the source of errors since variables may be modified from various parts of the code.

> Memory Leaks: Implicit global variables can cause memory leaks as they are not cleaned up until the page is closed.
  
# memory management issues in javaScript ?
### Memory Leaks:
- **Global Variables:** Unintentional global 
```js
variables can lead to memory not being freed.
  function foo() {
    x = 10;  // x is a global variable
}
```
- **Detached DOM Nodes:** If a DOM node is removed but references to it are kept, the memory for that node cannot be reclaimed.
```js
let element = document.getElementById('elementId');
document.body.removeChild(element);
// element still holds a reference to the detached DOM node
```
- **Closures:** Functions that reference variables from outer scopes can prevent those variables from being garbage collected if the function itself outlives the context in which it was created.

```js
function outer() {
    let largeObject = new Array(1000).fill('some large string');
    return function inner() {
        console.log(largeObject);
    };
}
let leak = outer();

When you call outer(), the following happens:

// The outer function executes, creating the largeObject array.
// The inner function is returned by outer.
// The returned inner function is assigned to the variable leak.
```
### Circular References:

> Objects Referencing Each Other: Circular references can confuse garbage collectors and lead to memory leaks

```js
let obj1 = {};
let obj2 = {};
obj1.ref = obj2;
obj2.ref = obj1;
```


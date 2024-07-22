# Function Currying
- function with multiple arguments -  convert the function into single arguments
- transform a function with multiple arguments into a nested series of functions, each taking a single arguments


```js
curriedMultiplyFunction = (a) => {
    return function (b) {
        return a * b;
    }
}

const double = curriedMultiplyFunction(2);
console.log(double(5));

const triple = curriedMultiplyFunction(3);
console.log(triple(5));
```
## Advantage
- Reusability , Modularity , Specialization
- big complex functions with multiple arguments can be broken into small, reusable functions with fewer arguments

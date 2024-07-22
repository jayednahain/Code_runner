## Pure Function
```js
let runFun = function (a, b) {
    return a+b;
}
console.log(runFun(1,5));
console.log(runFun(1,5));
console.log(runFun(1,5));
```
- Every times produces same output for the same outputs
- pure function cant modify the state
- pure function cant have side effects

## Impure Function
```js
let total = 0;
let runFun = function(value) {
    total = total+value;
    return total;
}
console.log(runFun(5));
console.log(runFun(5));
console.log(runFun(5));
```
- Every times produce different outputs for the same input
- impure function can modify the state
- impure function can have side effects


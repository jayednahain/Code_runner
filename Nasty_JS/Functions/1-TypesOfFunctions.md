# Types of functions
- 1 Named function
- 2 Anonymous function
- 3 Functions Expression
- 4 Arrow Function
- 5 IIFE
- 6 Callback Function
- 7 Higher-Order Function
#
## 1. Named function
```js
function sum(params) {
    return ;
}
```
- name function have name identifier
- use name function big and complex logic
- use it when we want to reuse it
#
## 2. Anonymous function
```js
console.log(function() {
    console.log("LOGGED")
    return 6+6;
} () )
```
- doesn't have function name
- when we want to use it on single place
- use it on simple logic
- use it on a single place
#
### Anonymous function + Named function
```js
function runFun() {
    console.log("runFun")
    return function() {
        console.log("ano");
        return 4+5 ;
    }();
}
```
#
## 3 - Functions Expression
- a away to define a function by assigning it to a variable
#### Named function expression
```js
let runFun1 = function (a, b) {
    return a + b;
}
runFun1()
```
#### Anonymous function expression
```js
let runFun2 = function sum(a, b) {
    return a + b;
}
runFun2()
```
## 4. Arrow Function
```js
let runFun = () => { return 5 + 6 }
let runFun = () => 5 + 6
```
- Arrow function also known as fat arrow functions,
- is a simpler and shorted way for defining functions
- if we use brackets we need use return key word other wise we dont need to use brackets

## 6. Callback Function
```js
let addFunction = (x,y) => x+y;
let runFun = (valOne,valTwo, calculateFunction)=>{
    return calculateFunction(valOne,valTwo);
}
console.log(runFun(3,4,addFunction));
```
- a callback function is a function that pass as a argument to another function
- the function which takes that call back as a parameter is called higher order function


## 7. Higher order function

```js
// ex1: as parameter
let addFunction = (x,y) => x+y;

let showResultFunction = (result) => console.log(result);

let runFun = (valOne,valTwo, calculateFunction, displayResultFunction)=>{
    
    let result = calculateFunction(valOne,valTwo) 
    
    displayResultFunction(result);
}

runFun(3,4,addFunction,showResultFunction)
```

```js
//ex:2 return a function
function runFun() {
    console.log("runFun")
    return function() {
        console.log("ano");
        return 4+5 ;
    }();
}
```
- a functions takes one or more function as a argument
- a function that return a function







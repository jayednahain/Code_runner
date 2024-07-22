# First class Function
- Functions treated like other variable
- - Assignable
```js
let runFun = function () {
    console.log(arguments[2])
}
```

- - Passable as Arguments
```js
let addFunction = (x,y) => x+y;
let showResultFunction = (result) => console.log(result)

let runFun = (valOne,valTwo, calculateFunction, displayResultFunction)=>{
    
    let result = calculateFunction(valOne,valTwo) 
    
    displayResultFunction(result);
}
runFun(3,4,addFunction,showResultFunction)
// pass addFunction and showResultFunction function as arguments
```
- - Return as Values

```js

let runFun = function (a, b) {
    
    return function() {
        return a+b;
    };
}

let result = runFun(5,5)
console.log(result())
```

## case -1 (Study)
```js
let runFun = function (a, b) {
    return function() {
        // return a+b;
        return function () {
            return a+b;   
        }

    };
}

console.log(runFun(5,5)()())
let result = runFun(5,5)
console.log(result()())
```
## case -2 (study)

```js
let runFun = function (a, b) {
    return function test1() {
        return function test2() {
           return a+b;
        }
    }
}

console.log(runFun(1,5)()());
```

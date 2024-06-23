// function outer() {
//     let largeObject = new Array(50).fill('some large string');
//     return function inner() {
//         console.log(largeObject);
//     };
// }
// let leak = outer();
// leak()


// let weakMapVal = new WeakMap();

// let obj = {}

// weakMapVal.set(obj, " test value")

// console.log(weakMapVal)

let id = Symbol("123");
console.log(id.valueOf())

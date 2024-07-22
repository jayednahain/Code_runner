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

// let id = Symbol("123");
// console.log(id.valueOf())

let testArray1 = [1,2,3,4,5,6]
//   testArray1.shift()
//   console.log(testArray1)
let testArray2 = [11,22,33,44,55,66]

testArray1.concat(testArray2)
console.log(testArray1)
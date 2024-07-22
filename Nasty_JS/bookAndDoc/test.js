// let runFun1 = function (a, b) {
//     return a + b;
// }
// runFun1()

// let runFun2 = function sum(a, b) {
//     return a + b;
// }
// runFun2()

// let runFun = () => { return 5 + 6 }
// let runFun = () => 5 + 6
// console.log(runFun())

// let addFunction = (x,y) => x+y;
// let showResultFunction = (result) => console.log(result)
// let runFun = (valOne,valTwo, calculateFunction, displayResultFunction)=>{
//     let result = calculateFunction(valOne,valTwo) 
//     displayResultFunction(result);
// }

// runFun(3,4,addFunction,showResultFunction)

// let runFun = function (a, b) {
//     console.log(a+b)
// }




// let runFun = function () {
//     console.log(arguments[2])
// }

// runFun("jack",0.1,[0,"po"],3,false)


// let runFun = function (a, b) {
//     return function test1() {
//         return function test2() {
//            return a+b;
//         }
//     }
// }

// console.log(runFun(1,5)()());


// let runFun = function (a, b) {
//     return a+b;
// }

// console.log(runFun(1,5));
// console.log(runFun(1,5));
// console.log(runFun(1,5));

// let total = 0;
// let runFun = function(value) {
//     total = total+value;
//     return total;
// }
// console.log(runFun(5));
// console.log(runFun(5));
// console.log(runFun(5));

// multiply = (a,b) => {
//     return a*b;
// }

// curriedMultiplyFunction = (a) => {
//     return function (b) {
//         return a * b;
//     }
// }

// const double = curriedMultiplyFunction(2);
// console.log(double(5));

// const triple = curriedMultiplyFunction(3);
// console.log(triple(5));

// let sequence = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// sequence.map((item, _) => {
//     // console.log(item)
//     let temp = curriedMultiplyFunction(item)
//     console.log(` 5 x ${item} = ${temp(5)}`)
// });


//apply call

function runFun(message1,message2) {
    console.log("this: ",this)
    console.log(message1 , "|| ", message2 ," || " ,this.fName)
}

// runFun("hellow there")
let PersonObject = {
    fName:"jayed",
    lName:"nahian",
    age:45,
}

runFun.call(PersonObject,"zzz",["aaa"]);




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

// function runFun(message1,message2) {
//     console.log("this: ",this)
//     console.log(message1 , "|| ", message2 ," || " ,this.fName)
// }

// // runFun("hellow there")
// let PersonObject = {
//     fName:"jayed",
//     lName:"nahian",
//     age:45,
// }

// runFun.call(PersonObject,"zzz",["aaa"]);


// const Vehicle = {
//     wheel: 4,
//     seat: 4,
//     start() {
//         console.log("insert key")
//     },
//     end: () => {
//         console.log("insert key")
//     }
// }

// let bmw = Object.create(Vehicle);
// console.log(bmw.start())

// let benz = Vehicle;
// console.log(benz.end())

// const CustomPromise = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         let randomNumber = Math.floor(Math.random() * 10);
//         console.log(randomNumber)
//         if (randomNumber < 5) {
//             resolve();
//         }
//         else {
//             reject()
//         }
//     }, 1000)

// }).then(()=>{
//     console.log("then");
// }).catch((err)=>{
//     console.log("catch");
// });
// CustomPromise()
// console.log(promise) 

// const CustomPromise1 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         let randomNumber = Math.floor(Math.random() * 10);
//         console.log(randomNumber)
//         if (randomNumber < 5) {
//             resolve();
//         }
//         else {
//             reject()
//         }
//     }, 1000)

// });
// const CustomPromise2 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         let randomNumber = Math.floor(Math.random() * 10);
//         console.log(randomNumber)
//         if (randomNumber < 5) {
//             resolve();
//         }
//         else {
//             reject()
//         }
//     }, 1000)

// });
// const CustomPromise3 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         let randomNumber = Math.floor(Math.random() * 10);
//         console.log(randomNumber)
//         if (randomNumber < 5) {
//             resolve();
//         }
//         else {
//             reject()
//         }
//     }, 1000)
// });


// Promise.all([CustomPromise1,CustomPromise2,CustomPromise3])
//     .then()
//     .catch((err)=>{
//             console.log("catch");
//         });


let delay = (ms) => {
    console.log("delay starting.... ")
    return new Promise((resolve)=>{
        console.log("delay promise block... ")
        setTimeout(()=>{
            console.log("delay resolved")
            resolve();
        },ms)
    }).then(()=>{
        console.log("delay complete..")
    });
}

async function TestAsync() {
    console.log("TestAsync function run")

    delay(3000); // not block the code
    console.log("TestAsync Not blocked")

    await delay(3000);
    console.log("blocked")

}


TestAsync();
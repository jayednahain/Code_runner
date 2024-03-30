
//=========================================================================================================================================================================================================================================================
// 22 - closure / hoisting
//https://www.youtube.com/watch?v=eWwge2YpHhc&list=PLu71SKxNbfoBuX3f4EOACle2y-tRC5Q37&index=22
//ex-1 function
// function one(){
//     const fName = "Jayed";
//     function two(){
//         console.log(fName)
//     }
//     console.log(lName); // error
//     two();
// }

// one()

//ex-2 conditions
// if (true){
//     const fName = "jayed";
//     if (userName == "jayed"){
//         const lName = "Jayed nahian";
//         console.log(fName + lName)
//     }
//     console.log(lName); // error
// }
// console.log(fName); // error


addOne()
addTwo() // error
//normal declaration
function addOne(){}
// hold and declaration
const addTwo = function(){}

//=========================================================================================================================================================================================================================================================

//23
// https://www.youtube.com/watch?v=9ksqBa8_txM&list=PLu71SKxNbfoBuX3f4EOACle2y-tRC5Q37&index=23

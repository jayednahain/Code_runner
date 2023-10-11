//page 83
var javaScriptObject = {}
//page 84
function exampleClass(){
    this.arrary = [1,2,3,4,5];
    this.name ="javascript";
}

// class exampleClass {
//     constructor() {
//         this.arrary = [1, 2, 3, 4, 5];
//         this.name = "javascript";
//     }
// }

var objectOne = new exampleClass()

exampleClass.prototype.sayName = function() {
    console.log(this.name)
}



// console.log(objectOne.sayName)
// console.log(exampleClass.prototype)

// o(n) linear time

// function exampleLinear(n) {
//     for (let i = 0; i < n; i++) {
//         console.log(i)
//     }
// }

// exampleLinear(10)

// function exampleQuadratic(n) {
//     for (let i = 1; i < n; i++) {
//         console.log("i=======: "+i);
//         for (let j = i; j < n; j++) {
//             console.log("J===--: "+j);
//             for (let k = j; k < n; k++) {
//                 console.log("k =-: "+k)
                
//             }            
//         }
        
//     }
// }
// exampleQuadratic(5)

class Vechicle {
    constructor(){
        console.log("Vechicle constructor  run !")
    }
    
}

console.log(Vechicle.prototype)
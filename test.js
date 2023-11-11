// function minimumNumber(n, password) {
//      let counter = 0;
//      [/[A-Z]/, /[a-z]/, /[\d]/, /[!@#$%^&*()--+]/].forEach((item)=>{
//           if (!item.test(password)) counter++ ;
//      })
//      if (counter >= 6 - n) return counter 
//      else return 6 - n


     // if (!/[A-Z]/.test(password)) counter = counter + 1; //A=1
     // if (!/[a-z]/.test(password)) counter = counter + 1; //a=1
     // if (!/[\d]/.test(password)) counter = counter + 1; // 1= 1
     // if (!(/[!@#$%^&*()--+]/.test(password))) counter = counter + 1; // # = 1
     // if (counter >= 6 - n) { return counter }
     // else {return 6 - n}
     // if ( password.length < 6) return 6-password.length ;
// }
// console.log(minimumNumber(7,"AUzs-nV"));


function caesarCipher(s, k) {
     const lowerCase = "abcdefghijklmnopqrstuvwxyz";
     const upperCase = lowerCase.toLocaleUpperCase();
     let newData =  s.split('').map((value, index) => {
          if (/[A-Za-z]/.test(value)) {
               if (value == value.toUpperCase()) {
                    let newUp = upperCase.indexOf(value) + k
                    var i,j = 0;
                    // var j = 0;
                    for (i; i < newUp; i++) {
                         const element = lowerCase.split('')[j];   
                         if (j >= lowerCase.split('').length - 1) {
                              j = 0
                         } else {
                              j++;  
                         }
                         console.log(element)
                    }
                   
                    // for (let item = 0; item < newUp; item++) {
                    //      const element = array[item];
                         
                    //     }
                
                    return upperCase.charAt(newUp)
               }
               else {
                    let newLow = lowerCase.indexOf(value) + k; 
                    if (newLow > 26) { 
                         newLow = newLow- 26;
                    }
                    return lowerCase.charAt(newLow);
               } 
          }
          else { return value; } 
     })
     return newData.join('');
}


// console.log(caesarCipher("middle-Outz", 2));


// aAbBcCdDeEfFgGhijklmnopqrstuvwxyz


// function caesarCipher(s, k) {
//      const lowerCase = "abcdefghijklmnopqrstuvwxyz";
//      const upperCase = lowerCase.toLocaleUpperCase();
//      let newData =  s.split('').map((value, index) => {
//           if (/[A-Za-z]/.test(value)) {
//                if (value == value.toUpperCase()) {
//                     let newUp = upperCase.indexOf(value) + k
//                     if (newUp > 26) { 
//                         for (let item = 0; item < newUp; item++) {
//                          const element = array[item];
                         
//                         }
//                     }
//                     return upperCase.charAt(newUp)
//                }
//                else {
//                     let newLow = lowerCase.indexOf(value) + k; 
//                     if (newLow > 26) { 
//                          newLow = newLow- 26;
//                     }
//                     return lowerCase.charAt(newLow);
//                } 
//           }
//           else { return value; } 
//      })
//      return newData.join('');
// }


// let listData = ["a", "b", "d"]

// for (let item = 0; item < 10; item++) {
//      const element = listData[item];
//      if (listData.length)
//      console.log(element);
     
// }
// while (condition) {
     
// }


// let listData = ["a", "b", "d"]
// do { }
// while (condition) 


// const cars = ["BMW", "Volvo", "Saab", "Ford"];
// let i = 0;
// let text = "";

// while (cars[i]) {
//      text = cars[i];
//      console.log(text);
//      i++;
// }



// let index = 0
// let j = 0;
// for (let index = 0; index < 2; index++) {
//      for (j = 0; j < 5; j++){
       
//      }
    
     
// }

// var index = 0;
// var index2 = 0;
// for (index; index < 10; index++) {
//      if (typeof cars[index] == "undefined") {
//           index2++;
//           index = 0;   
//           console.log(cars[index])
//      } else {
//           console.log(cars[index])
//      }    
// }





// const array = ["BMW", "Volvo", "Saab", "Ford"];
// var i = 0;
// var j = 0;
// for (i; i < 7; i++) {
//      const element = array[j];   
//      if (j >= array.length-1) {
//           j = 0
//      } else {
//           j++;  
//      }
//      console.log(element)
// }



          // return value.split("").reverse().join("")

// function revMe(data) {
//      let newData = data && typeof data == 'string' ?
          
//           data.split(" ").map((value, _) => {
//                value = value.

          
//                return /[A-Za-z]/.test(value)?value.split("").reverse().join(""): value
//           })
          
//           : null;
//      return newData?newData.join(" "):null
// }
// console.log(revMe("jayed nahian! data")); 






// var string = "I am string";
// var reverseEntireSentence = reverseBySeparator(string, "");
// console.log(reverseEntireSentence)
// var reverseEachWord = reverseBySeparator(reverseEntireSentence, " ");
// console.log(reverseEachWord)
// function reverseBySeparator(string, separator) {
//   return string.split(separator).reverse().join(separator);
// }



// function revMe(data) {
//      let newData = data.split(" ").map((value, _) => {
//           let rev=[];
//           for (let i = value.length - 1; i >= 0; i--) {
//                rev.push(value[i])
               
               
//                // console.log(value.split("")[i]);
//                // return value.split("")[i]
//           }
//           console.log(rev);
//      });
//       return newData.join(" ")
// }
 
// console.log(revMe("jayed nahian! data")); 



// function reverse1(str) {
//      console.log("str  lenght: " + str.length);
//      console.log("str -1: "+str.length-1)
//      let r = "";
//      for ( let i = str.length - 1; i >= 0; i--){
          
//      console.log(i);
//        r += str[i];
//      }
//      return r;
// }
    

// console.log(reverse1("jayed"));
// let dataList = [1,5,8,4,7,3,9]

// for (let i = 0; i < dataList.length; i++) {
//      let j = i + 1
//      // do some thing !
//      console.log("i==",i,'j====',j)
     
//      // console.log(dataList[i])
// }

// const sum = dataList.reduce((p, c) => { });

// function sum(valueA, valueB) {

// }

// function getSubString(nums, target) {
//      console.log(nums)
//      console.log(target);
// }
// console.log(getSubString([2,7,11,15],9));


// function test(s) {


     // let var1 = "";
     //      for (let i = 0; i < s.length-1; i++) {
     //           var1 = `${s[i]}${s[i + 1]}`
     //                // console.log("shift========// "+ var1)
     //                let var2 = "";
     //                for (let j = i+1; j < s.length-1; j++) {
     //                          var2 = `${s[j]}${s[j + 1]}`;
     //                          // console.log("/"+ var2)

     //                }
     //           if (var1 == var2) {
     //                     console.log("true")
     //                }
     //           else {
     //                console.log("false")
     //           }
     //      }
     // console.log(s)

     // for (let i = 0; i < array.length; i++) {
     //      // const element = array[i];
     // }

     // console.log(s.length);

     // let str = '';

     // for (i = 0; i <= 5; i++) {
     //      // console.log("----")
     //      for (j = 1; j <= i; j++) {
     //           console.log("$")
     //           str += "*";
     //      }
     //      str += '\n';

     // }
     // console.log(str);

     // for (let i = 0; i < s.length; i++) {
     //      console.log(s[i]);
     // }


     // console.log(s.length % 2==0);
     // if (s.length % 2 == 0) {
     //      for (let i = 0; i < s.length; i++) {
               
     //      }
     // }
     // else {
     //      return "false"
     // }
     


     // for (let i = 0; i < parseInt(s.length/ 2); i++) {
          
     //      var2 = `${s[i]}${s[i + 1]}`;
     //      console.log(var2)
     
     // }

     
     // for (let k = 0; k < s.length; k++) {
     //      console.log("++++++++")
     // let var1 = "";
     // let shifter = 0;
     // for (let i = 0; i < parseInt(s.length / 2); i++) {
               
          
     //      var1 = `${s[i]}${s[i + shifter]}`;
     //           let var2 = "";
     //           for (let j = i + 1; j < s.length; j++) {
     //                var2 = `${s[j]}${s[j + shifter]}`;
     //                console.log("/"+ var2)
     //           }
     //           shifter = shifter+1
     //           console.log("shift-- "+ var1)
     //      }
          
     // }

     // console.log("total lenght: " + s.length)
     // console.log("running cycle: " + parseInt(s.length / 2))

     // let flag = '';
     // for (let i = 0; i < parseInt(s.length / 2); i++) {
     //      let temp = "";
     //      for (let j = 0; j <= i; j++) {temp += s[j];}
     //      console.log("temp data:========== " + temp)
     //      let runningTemp = "";


     //      for (let i = 0; i < s.length - 1; i += temp.length) {
     //           runningTemp = s.substr(i, temp.length)
     //           console.log("=========="+runningTemp)
     //           if (temp != runningTemp) {
     //                console.log("--" + false)
     //           }
     //           else {
     //                console.log("--" + true)
     //                flag = true;

     //           }
     //      }
         
     // }

     


//      for (let i = 0; i < parseInt(s.length / 2); i++) {
//           let temp = "";
//           for (let j = 0; j <= i; j++) { temp += s[j]; }
//           let flag = true;

//           // console.log("temp data:========== " + temp)
//           let runningTemp = "";

//           for (let k = i + 1; k < s.length - 1; k += temp.length) {
               
//                runningTemp = s.substr(k, temp.length)

//                // console.log("==========" + runningTemp)
//                if (temp != runningTemp) {
//                     flag = false;
//                     console.log("false!!")
//                     break;

//                }
//                console.log("-- true value value !!!")
//           }

//           if (flag) {
//                console.log("---------true flag called !")
//                return true;

//           }


//      }

//      return false;
// }




// console.log("final result:  " + test("12123"))




// function subStringFinder(s) {
     // for (let i = 0; i < parseInt(s.length / 2); i++) {
     //      let temp = "";

     //      for (let j = 0; j <= i; j++) {
     //           temp += s[j];
     //      }
     //      let flag = true;
     //      for (let k = i+1; k < s.length - 1; k += temp.length) {
     //           // runningTemp = s.substr(i, temp.length)
     //           let runningTemp = s.substr(k, temp.length);
     //           if (temp != runningTemp) {
     //                flag = false;
     //                break;
     //           }
     //           if (flag) {
     //                return true;
     //            }
     //           // if (temp != runningTemp) {flag =false}
     //           // else {flag = true;}
               
     //      }
     // }
     // return false;



     // for (let i = 0; i < parseInt(s.length / 2); i++) {
     //      let temp = s.substr(0, i + 1);
     //      let flag = true;
  
     //      for (let j = i + 1; j < s.length; j += temp.length) {
     //          let runningTemp = s.substr(j, temp.length);
  
     //          if (temp !== runningTemp) {
     //              flag = false;
     //              break;
     //          }
     //      }

     //      if (flag) {
     //          return true;
     //      }
     //  }
  
     //  return false;
     
     
     
     
// }

// console.log(subStringFinder("ababc"))





// function finalSub(s) {
//      console.log("TOTAL LENGTH:" + s.length)
//      console.log("CYCLE: "+parseInt(s.length / 2))

//      for (let i = 0; i < parseInt(s.length / 2); i++) {
//           let temp = "";
//           for (let j = 0; j <= i; j++) { temp += s[j]; }
//           console.log("=========: "+temp)
//           let flag = true;
//           let shift = i+1
//           for (let z = shift; z < s.length; z += temp.length) {
//                let runningTemp = s.substr(z, temp.length);
//                console.log("--" + runningTemp)
//                if (temp != runningTemp) {
//                     flag = false;
//                }
//           }

//           if (flag) {
//                return true;
//           }
//      }
//      return false;
// }


// console.log(" final result : "+finalSub("bb"))

// function test(nums) {
//      let leftSide = 0;
//      let rightSide = nums.length - 1;
//      while (leftSide < rightSide) {
//           console.log("++ : " +leftSide)
//           leftSide++;
//           console.log("-- :" + rightSide)
//           rightSide--;

//      }
//      // console.log(leftSide)
//      // console.log(rightSide)
//      // for (let i = 0; i < nums.length; i++) {
//      //      console.log(nums[i])
//      // }
     
// }

// console.log(test([1,2,3,4,5,6,7]))

// let data = [0,5,8,7,8,4,5,6,9,8,5,2,5]
// // console.log(data)


// function sum(start,end) {
//      let temp =0;
//     for (let i = start; i < end; i++) {
//      //    console.log(data[i])
//         temp = temp + data[i]
//     }

//     return temp;
    
// }



// console.log(sum(0,5))

// class Node {
//      constructor(value){
//           console.log("comming value: "+value)
//           this.value = value;
//           console.log("this value: "+JSON.stringify(this))
//           this.next = null;
//      }
// }



// try{
//      const objectNode = new Node("5")
// }
// catch(e){console.log(e.message)}

class BankAccount {
     constructor(accountNumber) {
       // Encapsulated properties
       let _accountNumber = accountNumber;
       let _balance = 0;
   
       // Public methods to interact with the object
       this.getAccountNumber = () => _accountNumber;
       this.getBalance = () => _balance;
       this.deposit = (amount) => {
         _balance += amount;
       };
       this.withdraw = (amount) => {
         if (amount <= _balance) {
           _balance -= amount;
         } else {
           console.log('Insufficient balance.');
         }
       };
     }
   }
   
   // Create a BankAccount object
   const account = new BankAccount('12345');
   
   // Access properties through methods (encapsulation)
//    console.log('Account Number:', account.getAccountNumber()); // Output: '12345'
//    console.log('Balance:', account.getBalance());               // Output: 0
   
//    // Deposit and withdraw funds
//    account.deposit(500);
//    account.withdraw(500);
//    console.log('Balance after transactions:', account.getBalance()); 

// let arr_one = [1,2,3];
// let arr_two = [4,5,6];


function medianOfArray(array){
    var length = array.length;

     //find odd number
    if (length % 2==1){
        
        //3,5,7 something
        // find the index
        let index = Math.floor(length/2);

        // search va lue with the index;
        return array[index] ;
    }
    
    //find even
    //4,8,10
    else{
        
        return (array[length/2]+array[length/2-1])/2;
        // return(length/2)
    }

}

// let  currentArray= [1, 2, 3, 4]
// try
// {
//      console.log(medianOfArray(currentArray))
// }
// catch(e){console.log(e.message)}


class Node {
     constructor(value){
          this.value = value; // current node value 
          this.next = null;
     }
}

//creating nodes
const a = new Node('A');
const b = new Node('B');
const c = new Node('C');
const d = new Node('D');
const e = new Node('E');

// connect one node to another node
a.next = b;
b.next = c;
d.next = e;

//show link list
function showLinkList(head) {
     let current = head;
     console.log(current)
}


// try{
//      showLinkList(a)
// }
// catch(e){console.log(e.message)}


// var twoSum = function(nums, target) {
// 	var hasTable={};

// 	for (let i = 0; i < nums.length; i++) {
// 		// let currentElement = nums[i];
// 		let difference = target - nums[i];
		
// 		if (hasTable[nums[i]] != undefined){

// 			console.log("-----"+JSON.stringify(hasTable) )
// 		}
// 		else{
// 			hasTable[difference]=i
// 		}
// 		console.log(hasTable)
// 	}
// 	// console.log(hasTable)
// };

function findSum(arr, target) {
    let left = 0;
    let right = arr.length - 1;

    while (left < right) {
        let sum = arr[left] + arr[right];
		console.log("current sum: "+ sum)
        if (sum === target) {
            return [ arr[left] ,arr[right] ];
        } else if (sum < target) {
			console.log("++++++++++++")
            left++;
        } else {
			console.log("------------")
            right--;
        }
    }
    return -1;
}

var twoSum = function(nums, target) {
    let obj = {};
    for (let i = 0; i < nums.length; i++) {
        if (obj[nums[i]] != undefined){
            return [i, obj[nums[i]]]
        }
        else{
            obj[target- nums[i]]=i;
        }
        
    }
};



try{
    //[2,7,11,15], target = 9
//     twoSum([10,20,50,70],90)
	console.log(twoSum([10,30,50,60],90))
}
catch(e){console.log(e.message)}
# Call Apply bind

```js
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
```

- call apply bind are three methods in javaScript that are use to **work with functions** and control how they are invoked and **what the context** they operate in

- these methods provides a way to manipulate the **this value** and pass argument to functions


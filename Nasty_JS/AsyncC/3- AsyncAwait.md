# Async and Await

### async

```js
async function TestAsync() {}
```
- if we add async key word to a function. the function will run asynchronously
- The async keyword is used to define a function as an asynchronous function, which means the code inside async function will not block the execution of other code


```js
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
    // using await stop executing the next block until the delay function execution is complete
    console.log("blocked")
}
```
### Await
- the await keyword is used in a async function to **pause the execution** of a function until a **promise is resolve or reject**
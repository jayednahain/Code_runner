# Promise
- promise are in 3 states
- - pending
- - resolve
- - rejected


```javascript
const CustomPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        let randomNumber = Math.floor(Math.random() * 10);
        console.log(randomNumber)
        if (randomNumber < 5) {
            resolve();
        }
        else {
            reject()
        }
    }, 1000)

}).then(()=>{
    console.log("then");
}).catch((err)=>{
    console.log("catch");
});
```

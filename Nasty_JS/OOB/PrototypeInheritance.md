 # ProtoTypal Inheritance
 - ProtoTypal Inheritance allows objects to inherit **properties and methods from parent** objects
```js
 const Vehicle = {
    wheel: 4,
    seat: 4,
    start() {
        console.log("insert key")
    },
    end: () => {
        console.log("insert key")
    }
}

let bmw = Object.create(Vehicle);
console.log(bmw.start())
```
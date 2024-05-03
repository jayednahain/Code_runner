<img src="images/Screenshot from 2024-04-28 00-37-30.png"/>

```js
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

```
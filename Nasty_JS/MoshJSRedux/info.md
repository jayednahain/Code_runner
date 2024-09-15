## src link : https://www.youtube.com/watch?v=poQXNp9ItL4&t=1310s
## functional composition
<img src="src/Screenshot from 2024-09-12 16-00-35.png" width="800 " title="hover text">

## composite and piping
```js
export default function ReduxMosh() {
    const strTrip = str => str.trim();
    const strView = str => <Text>{str}</Text>
    const strUpperCase = str => str.toUpperCase();
    const strTransform =  _.pipeline(strTrip,strUpperCase,strView)


    return (
        <View>
            <Text>{strTransform("zakir  khan  ")}</Text>
        </View>
    )
}

const styles = StyleSheet.create({})
```


## Curry
- take a function which has n number of arguments , and convert to a function which has single arguments


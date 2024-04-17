void main(List<String> args) {
  // parameterized
  // testFunction(1, 2, 3, 4);

  // optional parameterized function
  // testFunction(a, b)

  //optional named parameter
  
}

// parameterized function
// testFunction(a, b, c, d) {
//   print(a);
//   print(b);
//   print(c);
//   print(d);
// }

// optional parameterized function
// testFunction(a, b, [c, d]) {
//   print(a);
//   print(b);
//   print(c);
//   print(d);
// }

//named parameter
testFunction({String? a, b,c, d}) {
  print(a);
  print(b);
  print(c);
  print(d);
}

//optional named parameter
// testFunction(a, b, {c, d}) {
//   print(a);
//   print(b);
//   print(c);
//   print(d);
// }


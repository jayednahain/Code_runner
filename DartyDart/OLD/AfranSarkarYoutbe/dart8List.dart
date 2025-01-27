void main(List<String> args) {
  print("test");

  List data = ["Hello", 1, 2.5];
  print(data);

  data.add("ADD");
  print(data);

  // add multiple data
  data.addAll(["new", "multiple", "data", "added"]);
  print(data);

  //insert data in position
  //increase list amount
  data.insert(0, "jayed");
  print(data);

  //replace data in postion
  //
  data[1] = "nahian";
  print(data);
}

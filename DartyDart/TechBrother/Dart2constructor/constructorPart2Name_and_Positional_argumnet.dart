class Student {
  String? name;
  int? age;
  //positional argument
  // Student({String name, int age}) {
  //   this.name = name;
  //   this.age = age;
  // }

  Student({this.name, this.age}) {}
}

void main(List<String> args) {
  List<Student> _studentData = [
    Student(name: "jayed", age: 55),
    Student(name: "jayed", age: 55),
    Student(name: "jayed", age: 55),
    Student(name: "jayed", age: 55),
  ];

  _studentData.forEach((element) {
    print(element.name);
  });
}

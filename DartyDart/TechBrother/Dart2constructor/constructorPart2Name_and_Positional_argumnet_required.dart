class Student {
  String? name;
  int? age;
  String? email;
  //positional argument
  // Student({String name, int age}) {
  //   this.name = name;
  //   this.age = age;
  // }

  Student({this.name, this.age, required this.email}) {}
}

void main(List<String> args) {
  List<Student> _studentData = [
    Student(name: "jayed", age: 55, email: "@yahoo.com"),
    Student(name: "jayed", age: 55, email: "@2yahoo.com"),
    Student(name: "jayed", age: 55, email: "@5yahoo.com"),
    Student(name: "jayed", age: 55, email: "@y8ahoo.com"),
  ];

  _studentData.forEach((element) {
    print(element.email);
  });
}

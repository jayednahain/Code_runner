//required param
void showCountry(String name1, String name2, String name3) {
  print(name1);
  print(name2);
  print(name3);
}

//Optional param Positional
void showCity([String? name1, String? name2, String? name3]) {
  print(name1);
  print(name2);
  print(name3);
}

//Optional param Named
void showName({String? name1, String? name2, String? name3}) {
  print(name1);
  print(name2);
  print(name3);
}

void main(List<String> args) {
  showCountry("bangladesh", "india", "australia");
  showCity("comilla", "comi2222");
  showName(name1: "jayed", name2: "nahian", name3: "comilla");
}

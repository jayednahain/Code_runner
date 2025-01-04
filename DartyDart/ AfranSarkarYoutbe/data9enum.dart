void setThemeConditions(dynamic theme) {
  if (theme == "light") {
    print("Light theme selected");
  } else if (theme == "dark") {
    print("Dark theme selected");
  } else {
    print("Invalid theme selected!");
  }
}

void setThemeCase(ThemeMode theme) {
  switch (theme) {
    case ThemeMode.light:
      print("Light theme selected");
      break;
    case ThemeMode.dark:
      print("Dark theme selected");
      break;
  }
}

void main(List<String> args) {
  setThemeConditions(0);
  setThemeCase("null");
}

enum gender { Male, Female, Unknown }

enum ThemeMode { light, dark }

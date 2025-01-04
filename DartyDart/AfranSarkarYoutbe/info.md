https://www.youtube.com/playlist?list=PLy0nhnjSE4irkzR9mbo70J2iKbf4a36y5

# 8 list

# 9 enum

```dart

enum ThemeMode { light, dark }

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
  setThemeCase("null");  //compile time error
}


```

- why need enum
Improved Readability:
Replace hard-coded strings or numbers with meaningful names.

- Error Prevention:
Catch errors at compile time by restricting values to a predefined set.

- Maintainability:
Enums centralize options, making it easier to add or modify them in one place.

- Code Consistency:
Avoids the use of arbitrary strings or numbers throughout the codebase.


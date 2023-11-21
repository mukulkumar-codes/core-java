+ In Java, an augmented expression of the form x1 op= x2 is implemented as x1 = (T) (x1 op x2), where T is the type 
  for x1. Therefore, the following code is correct:
```java
// Demo run
public class Demo{
  public static void main(String[] args) {
    int sum = 0;
    sum += 4.5; // sum becomes 4 after this statement
    // sum += 4.5 is equivalent to sum = (int)(sum + 4.5);
  }
}
```

+  Result with two digits after the decimal point.
```java
public class Demo{
  public static void main(String[] args) {
    double value = 293485.46546;
    double Result = (int) (value * 100) / 100.0;
    System.out.println(Result);
  }
}
```

+ Round off a double value into integer.
```java
public class Demo{
  public static void main(String[] args) {
    double value = 293485.46546;
    double Result = (int) (value * 100 + 0.5) / 100.0;
    System.out.println(Result);
  }
}
```

+ The software development life cycle is a multistage process that includes requirements specification, analysis, design, implementation, testing, deployment, and maintenance.

+ You can use Math.random() to obtain a random double value between 0.0 and 1.0, excluding 1.0.

```java
        // a. How do you generate a random integer i such that 0 <= i < 20?
        System.out.println((int) (Math.random() * 100) % 20);

        // b. How do you generate a random integer i such that 10 <= i < 20?
        System.out.println((int) (Math.random() * 10) + 10);

        // c. How do you generate a random integer i such that 10 <= i <= 50?
        System.out.println((int) (Math.random() * 100) % 41 + 10);

        // d. Write an expression that returns 0 or 1 randomly.
        System.out.println((int) (Math.random() * 10) % 2);
```

+ For all programs, you should write a small amount of code and test it before moving on to add more code. This is called incremental development and testing. This approach makes testing easier, because the errors are likely in the new code you just added.

+ The % sign denotes a format specifier. To output a literal % in the format string, use %%. For example, the following code
```java
public class FormatDemo{
    public static void main(String[] args) {
        System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);

        System.out.printf("%,8d %,10.1f\n", 12345678, 12345678.263);         
        System.out.printf("%08d %08.1f\n", 1234, 5.63);
        System.out.printf("%,08d %,08.1f\n", 1234, 5.63);
        System.out.printf("%.2f%%\n", 75.234);

        System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);
        System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);
    }
} 
```

+ Trigonometric Methods

| Method             | Description                                               |
|--------------------|-----------------------------------------------------------|
| sin(radians)       | Returns the trigonometric sine of an angle in radians.    |
| cos(radians)       | Returns the trigonometric cosine of an angle in radians.  |
| tan(radians)       | Returns the trigonometric tangent of an angle in radians. |
| toRadians(degree)  | Returns the angle in radians for the angle in degrees.    |
| toDegrees(radians) | Returns the angle in degrees for the angle in radians.    |
| asin(a)            | Returns the angle in radians for the inverse of sine.     |
| acos(a)            | Returns the angle in radians for the inverse of cosine.   |
| atan(a)            | Returns the angle in radians for the inverse of tangent.  |

+ Exponent Methods

| Method    | Description                                           |
|-----------|-------------------------------------------------------|
| exp(x)    | Returns e raised to power of x (e^x^).                |
| log(x)    | Returns the natural logarithm of x (ln(x) = loge(x)). |
| log10(x)  | Returns the base 10 logarithm of x (log10(x)).        |
| pow(a, b) | Returns a raised to the power of b (a^b).             |
| sqrt(x)   | Returns the square root of x () for x 7 = 0.          |

+ The Rounding Methods

| Method   | Description                                                                                                             |
|----------|-------------------------------------------------------------------------------------------------------------------------|
| ceil(x)  | x is rounded up to its nearest integer. This integer is returned as a double value.                                     |
| floor(x) | x is rounded down to its nearest integer. This integer is returned as a double value.                                   |
| rint(x)  | x is rounded to its nearest integer. If x is equally close to two integers, the even one is returned as a double value. |
| round(x) | Returns (int)Math.floor(x + 0.5) if x is a float and returns (long)Math.floor(x + 0.5) if x is a double.                |

+ Escape Sequences

| Escape Sequence | Name            | Unicode Code | Decimal Value |
|-----------------|-----------------|--------------|---------------|
| \b              | Backspace       | \u0008       | 8             |
| \t              | Tab             | \u0009       | 9             |
| \n              | Linefeed        | \u000A       | 10            |
| \f              | Form feed       | \u000C       | 12            |
| \r              | Carriage Return | \u000D       | 13            |
| \\              | Backslash       | \u005C       | 92            |
| \"              | Double Quote    | \u0022       | 34            |

+ Methods in the Character Class

| Method              | Description                                                     |
|---------------------|-----------------------------------------------------------------|
| isDigit(ch)         | Returns true if the specified character is a digit.             |
| isLetter(ch)        | Returns true if the specified character is a letter.            |
| isLetterOrDigit(ch) | Returns true if the specified character is a letter or digit.   |
| isLowerCase(ch)     | Returns true if the specified character is a lowercase letter.  |
| isUpperCase(ch)     | Returns true if the specified character is an uppercase letter. |
| toLowerCase(ch)     | Returns the lowercase of the specified character.               |
| toUpperCase(ch)     | Returns the uppercase of the specified character.               |

+ Simple Methods for String Objects

| Method        | Description                                                            |
|---------------|------------------------------------------------------------------------|
| length()      | Returns the number of characters in this string.                       |
| charAt(index) | Returns the character at the specified index from this string.         |
| concat(s1)    | Returns a new string that concatenates this string with string s1.     |
| toUpperCase() | Returns a new string with all letters in uppercase.                    |
| toLowerCase() | Returns a new string with all letters in lowercase.                    |
| trim()        | Returns a new string with whitespace characters trimmed on both sides. |

+ Comparison Methods for String Objects

| Method                  | Description                                                                                                                               |
|-------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| equals(s1)              | Returns true if this string is equal to string s1.                                                                                        |
| equalsIgnoreCase(s1)    | Returns true if this string is equal to string s1; it is case insensitive.                                                                |
| compareTo(s1)           | Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1. |
| compareToIgnoreCase(s1) | Same as compareTo except that the comparison is case insensitive.                                                                         |
| startsWith(prefix)      | Returns true if this string starts with the specified prefix.                                                                             |
| endsWith(suffix)        | Returns true if this string ends with the specified suffix.                                                                               |
| contains(s1)            | Returns true if s1 is a substring in this string.                                                                                         |

+ The String Class Contains the Methods for Obtaining Substrings

| Method                          | Description                                                                                                                                                                                                      |
|---------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| substring(beginIndex)           | Returns this string’s substring that begins with the character at the specified beginIndex and extends to the end of the string, as shown in Figure 4.2.                                                         |
| substring(beginIndex, endIndex) | Returns this string’s substring that begins at the specified beginIndex and extends to the character at index endIndex – 1, as shown in Figure 4.2. Note the character at endIndex is not part of the substring. |

+ The String Class Contains the Methods for Finding Substrings

| Method                     | Description                                                                                                      |
|----------------------------|------------------------------------------------------------------------------------------------------------------|
| index Of (ch)              | Returns the index of the first occurrence of ch in the string. Returns −1 if not matched.                        |
| indexOf(ch, fromIndex)     | Returns the index of the first occurrence of ch after fromIndex in the string. Returns −1 if not matched.        |
| indexOf(s)                 | Returns the index of the first occurrence of string s in this string. Returns −1 if not matched.                 |
| indexOf(s, fromIndex)      | Returns the index of the first occurrence of string s in this string after fromIndex. Returns −1 if not matched. |
| lastIndexOf(ch)            | Returns the index of the last occurrence of ch in the string. Returns −1 if not matched.                         |
| lastIndexOf(ch, fromIndex) | Returns the index of the last occurrence of ch before fromIndex in this string. Returns −1 if not matched.       |
| lastIndexOf(s)             | Returns the index of the last occurrence of string s. Returns −1 if not matched.                                 |
| lastIndexOf(s, fromIndex)  | Returns the index of the last occurrence of string s before fromIndex. Returns −1 if not matched.                |

+ Frequently Used Format Specifiers

| Format Specifier | Output                                   |
|------------------|------------------------------------------|
| %b               | A Boolean value                          |
| %c               | A character                              |
| %d               | A decimal integer                        |
| %f               | A floating-point number                  |
| %e               | A number in standard scientific notation |
| %s               | A string                                 |








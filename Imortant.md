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


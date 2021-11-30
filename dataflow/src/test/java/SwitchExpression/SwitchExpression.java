package SwitchExpression;

import org.checkerframework.checker.nullness.qual.*;

public class SwitchExpression {
  public static void main(String[] args) {
     @NonNull Object nnobj = new Object();
     nnobj = null;
    switch (getNullable()) {
      case X  -> System.out.println("X");
      default -> System.out.println("default");
    }
  }

  public static void goodUse() {
    switch (getNonNull()) {
      case X  -> System.out.println("X");
      default -> System.out.println("default");
    }
  }

  public static @Nullable A getNullable() {
    return A.X;
  }

  public static A getNonNull() {
    return A.X;
  }

  public static enum A {
    X
  }
}
